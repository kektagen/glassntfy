package io.heckel.ntfy.service;

import java.lang.System;

/**
 * The subscriber service manages the foreground service for instant delivery.
 *
 * This should be so easy but it's a hot mess due to all the Android restrictions, and all the hoops you have to jump
 * through to make your service not die or restart.
 *
 * Cliff notes:
 * - If the service is running, we keep one connection per base URL open (we group all topics together)
 * - Incoming notifications are immediately forwarded and broadcasted
 *
 * "Trying to keep the service running" cliff notes:
 * - Manages the service SHOULD-BE state in a SharedPref, so that we know whether or not to restart the service
 * - The foreground service is STICKY, so it is restarted by Android if it's killed
 * - On destroy (onDestroy), we send a broadcast to AutoRestartReceiver (see AndroidManifest.xml) which will schedule
 *  a one-off AutoRestartWorker to restart the service (this is weird, but necessary because services started from
 *  receivers are apparently low priority, see the gist below for details)
 * - The MainActivity schedules a periodic worker (AutoRestartWorker) which restarts the service
 * - FCM receives keepalive message from the main ntfy.sh server, which broadcasts an intent to AutoRestartReceiver,
 *  which will schedule a one-off AutoRestartWorker to restart the service (see above)
 * - On boot, the BootStartReceiver is triggered to restart the service (see AndroidManifest.xml)
 *
 * This is all a hot mess, but you do what you gotta do.
 *
 * Largely modeled after this fantastic resource:
 * - https://robertohuertas.com/2019/06/29/android_foreground_services/
 * - https://github.com/robertohuertasm/endless-service/blob/master/app/src/main/java/com/robertohuertas/endless/EndlessService.kt
 * - https://gist.github.com/varunon9/f2beec0a743c96708eb0ef971a9ff9cd
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 F2\u00020\u0001:\u0005CDEFGB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020)H\u0016J\u0018\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\"\u00100\u001a\u0002012\b\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201H\u0016J\u001e\u00104\u001a\u00020)2\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020\'H\u0016J\u0019\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?J\b\u0010@\u001a\u00020)H\u0002J\b\u0010A\u001a\u00020)H\u0002J\b\u0010B\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0018\u00010\u001dR\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006H"}, d2 = {"Lio/heckel/ntfy/service/SubscriberService;", "Landroid/app/Service;", "()V", "api", "Lio/heckel/ntfy/msg/ApiService;", "connections", "Ljava/util/concurrent/ConcurrentHashMap;", "Lio/heckel/ntfy/service/ConnectionId;", "Lio/heckel/ntfy/service/Connection;", "dispatcher", "Lio/heckel/ntfy/msg/NotificationDispatcher;", "getDispatcher", "()Lio/heckel/ntfy/msg/NotificationDispatcher;", "dispatcher$delegate", "Lkotlin/Lazy;", "isServiceStarted", "", "notificationManager", "Landroid/app/NotificationManager;", "refreshMutex", "Lkotlinx/coroutines/sync/Mutex;", "repository", "Lio/heckel/ntfy/db/Repository;", "getRepository", "()Lio/heckel/ntfy/db/Repository;", "repository$delegate", "serviceNotification", "Landroid/app/Notification;", "wakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "createNotification", "title", "", "text", "createNotificationChannel", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onNotificationReceived", "subscription", "Lio/heckel/ntfy/db/Subscription;", "notification", "Lio/heckel/ntfy/db/Notification;", "onStartCommand", "", "flags", "startId", "onStateChanged", "subscriptionIds", "", "", "state", "Lio/heckel/ntfy/db/ConnectionState;", "onTaskRemoved", "rootIntent", "reallyRefreshConnections", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshConnections", "startService", "stopService", "Action", "AutoRestartReceiver", "BootStartReceiver", "Companion", "ServiceState", "app_fdroidDebug"})
public final class SubscriberService extends android.app.Service {
    private android.os.PowerManager.WakeLock wakeLock;
    private boolean isServiceStarted = false;
    private final kotlin.Lazy repository$delegate = null;
    private final kotlin.Lazy dispatcher$delegate = null;
    private final java.util.concurrent.ConcurrentHashMap<io.heckel.ntfy.service.ConnectionId, io.heckel.ntfy.service.Connection> connections = null;
    private final io.heckel.ntfy.msg.ApiService api = null;
    private android.app.NotificationManager notificationManager;
    private android.app.Notification serviceNotification;
    private final kotlinx.coroutines.sync.Mutex refreshMutex = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.service.SubscriberService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfySubscriberService";
    public static final int SERVICE_START_WORKER_VERSION = io.heckel.ntfy.BuildConfig.VERSION_CODE;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVICE_START_WORKER_WORK_NAME_PERIODIC = "NtfyAutoRestartWorkerPeriodic";
    private static final java.lang.String WAKE_LOCK_TAG = "SubscriberService:lock";
    private static final java.lang.String NOTIFICATION_CHANNEL_ID = "ntfy-subscriber";
    private static final java.lang.String NOTIFICATION_GROUP_ID = "io.heckel.ntfy.NOTIFICATION_GROUP_SERVICE";
    private static final int NOTIFICATION_SERVICE_ID = 2586;
    private static final long NOTIFICATION_RECEIVED_WAKELOCK_TIMEOUT_MILLIS = 600000L;
    private static final java.lang.String SHARED_PREFS_ID = "SubscriberService";
    private static final java.lang.String SHARED_PREFS_SERVICE_STATE = "ServiceState";
    
    public SubscriberService() {
        super();
    }
    
    private final io.heckel.ntfy.db.Repository getRepository() {
        return null;
    }
    
    private final io.heckel.ntfy.msg.NotificationDispatcher getDispatcher() {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void startService() {
    }
    
    private final void stopService() {
    }
    
    private final void refreshConnections() {
    }
    
    /**
     * Start/stop connections based on the desired state
     * It is guaranteed that only one of function is run at a time (see mutex above).
     */
    private final java.lang.Object reallyRefreshConnections(kotlinx.coroutines.CoroutineScope scope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void onStateChanged(java.util.Collection<java.lang.Long> subscriptionIds, io.heckel.ntfy.db.ConnectionState state) {
    }
    
    private final void onNotificationReceived(io.heckel.ntfy.db.Subscription subscription, io.heckel.ntfy.db.Notification notification) {
    }
    
    private final android.app.NotificationManager createNotificationChannel() {
        return null;
    }
    
    private final android.app.Notification createNotification(java.lang.String title, java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onTaskRemoved(@org.jetbrains.annotations.NotNull()
    android.content.Intent rootIntent) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lio/heckel/ntfy/service/SubscriberService$BootStartReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_fdroidDebug"})
    public static final class BootStartReceiver extends android.content.BroadcastReceiver {
        
        public BootStartReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lio/heckel/ntfy/service/SubscriberService$AutoRestartReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_fdroidDebug"})
    public static final class AutoRestartReceiver extends android.content.BroadcastReceiver {
        
        public AutoRestartReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/heckel/ntfy/service/SubscriberService$Action;", "", "(Ljava/lang/String;I)V", "START", "STOP", "app_fdroidDebug"})
    public static enum Action {
        /*public static final*/ START /* = new START() */,
        /*public static final*/ STOP /* = new STOP() */;
        
        Action() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lio/heckel/ntfy/service/SubscriberService$ServiceState;", "", "(Ljava/lang/String;I)V", "STARTED", "STOPPED", "app_fdroidDebug"})
    public static enum ServiceState {
        /*public static final*/ STARTED /* = new STARTED() */,
        /*public static final*/ STOPPED /* = new STOPPED() */;
        
        ServiceState() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/heckel/ntfy/service/SubscriberService$Companion;", "", "()V", "NOTIFICATION_CHANNEL_ID", "", "NOTIFICATION_GROUP_ID", "NOTIFICATION_RECEIVED_WAKELOCK_TIMEOUT_MILLIS", "", "NOTIFICATION_SERVICE_ID", "", "SERVICE_START_WORKER_VERSION", "SERVICE_START_WORKER_WORK_NAME_PERIODIC", "SHARED_PREFS_ID", "SHARED_PREFS_SERVICE_STATE", "TAG", "WAKE_LOCK_TAG", "readServiceState", "Lio/heckel/ntfy/service/SubscriberService$ServiceState;", "context", "Landroid/content/Context;", "saveServiceState", "", "state", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void saveServiceState(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.service.SubscriberService.ServiceState state) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.service.SubscriberService.ServiceState readServiceState(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}