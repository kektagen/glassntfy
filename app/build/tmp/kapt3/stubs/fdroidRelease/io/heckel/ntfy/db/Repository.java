package io.heckel.ntfy.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0005\u0018\u0000 \u008d\u00012\u00020\u0001:\u0002\u008d\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0019\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J\u0006\u0010-\u001a\u00020!J\u000e\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\tJ\u000e\u00100\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001fJ\u0019\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u001f06J\u0006\u00107\u001a\u00020\tJ\u0006\u00108\u001a\u00020\tJ\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u00020\tJ\u0006\u0010<\u001a\u00020!J\u0006\u0010=\u001a\u00020\u001fJ\u0006\u0010>\u001a\u00020:J\b\u0010?\u001a\u0004\u0018\u00010\u001fJ\u0006\u0010@\u001a\u00020:J\f\u0010A\u001a\b\u0012\u0004\u0012\u00020#0BJ\u0006\u0010C\u001a\u00020\tJ\u0006\u0010D\u001a\u00020!J\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001f0BJ\u0006\u0010F\u001a\u00020:J\u0010\u0010G\u001a\u0004\u0018\u00010#2\u0006\u0010H\u001a\u00020\u001fJ\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020#0BH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u001a\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0B0L2\u0006\u0010/\u001a\u00020\tJ\u0006\u0010M\u001a\u00020:J\u0006\u0010N\u001a\u00020!J\u0010\u0010O\u001a\u00020\n2\u0006\u0010/\u001a\u00020\tH\u0002J\u0010\u0010P\u001a\u0004\u0018\u00010\'2\u0006\u0010/\u001a\u00020\tJ#\u0010P\u001a\u0004\u0018\u00010\'2\u0006\u00103\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u001b\u0010R\u001a\u0004\u0018\u00010\'2\u0006\u0010S\u001a\u00020\u001fH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J#\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!0U06H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u001e\u0010V\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020!0U060LJ\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\'0BH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u0012\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0B0LJ\u001b\u0010Y\u001a\u0004\u0018\u00010+2\u0006\u00103\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u0017\u0010Z\u001a\b\u0012\u0004\u0012\u00020+0BH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u0012\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0B0LJ\u0006\u0010\\\u001a\u00020\tJ\u0006\u0010]\u001a\u00020!J\u000e\u0010^\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\tJ\u000e\u0010_\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001fJ\u0016\u0010`\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tJ\"\u0010b\u001a\b\u0012\u0004\u0012\u00020#0B2\u0006\u0010/\u001a\u00020\t2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020#0BJ\u000e\u0010d\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\tJ\u0016\u0010e\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\t2\u0006\u0010a\u001a\u00020\tJ\u0019\u0010f\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\tH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010gJ\u000e\u0010h\u001a\u00020\u001d2\u0006\u0010i\u001a\u00020\tJ\u000e\u0010j\u001a\u00020\u001d2\u0006\u0010k\u001a\u00020\tJ\u000e\u0010l\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020:J\u000e\u0010n\u001a\u00020\u001d2\u0006\u0010o\u001a\u00020\tJ\u000e\u0010p\u001a\u00020\u001d2\u0006\u0010q\u001a\u00020!J\u000e\u0010r\u001a\u00020\u001d2\u0006\u0010s\u001a\u00020\u001fJ\u000e\u0010t\u001a\u00020\u001d2\u0006\u0010u\u001a\u00020:J\u000e\u0010v\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001fJ\u000e\u0010w\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020:J\u000e\u0010x\u001a\u00020\u001d2\u0006\u0010y\u001a\u00020\tJ\u000e\u0010z\u001a\u00020\u001d2\u0006\u0010q\u001a\u00020!J\u000e\u0010{\u001a\u00020\u001d2\u0006\u0010|\u001a\u00020:J\u000e\u0010}\u001a\u00020\u001d2\u0006\u0010m\u001a\u00020:J\u000e\u0010~\u001a\u00020\u001d2\u0006\u0010q\u001a\u00020!J\u000e\u0010\u007f\u001a\u00020\u001d2\u0006\u0010o\u001a\u00020\tJ\u0017\u0010\u0080\u0001\u001a\u0004\u0018\u00010\'2\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0082\u0001H\u0002J\u001f\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\'0B2\u000e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010BH\u0002J\u000f\u0010\u0085\u0001\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001fJ\u000f\u0010\u0086\u0001\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#J \u0010\u0087\u0001\u001a\u00020\u001d2\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020\nJ\u001a\u0010\u008b\u0001\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\'H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u001a\u0010\u008c\u0001\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R4\u0010\u000b\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n \r*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b0\b0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u008e\u0001"}, d2 = {"Lio/heckel/ntfy/db/Repository;", "", "sharedPrefs", "Landroid/content/SharedPreferences;", "database", "Lio/heckel/ntfy/db/Database;", "(Landroid/content/SharedPreferences;Lio/heckel/ntfy/db/Database;)V", "connectionStates", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lio/heckel/ntfy/db/ConnectionState;", "connectionStatesLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "detailViewSubscriptionId", "Ljava/util/concurrent/atomic/AtomicLong;", "getDetailViewSubscriptionId", "()Ljava/util/concurrent/atomic/AtomicLong;", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "notificationDao", "Lio/heckel/ntfy/db/NotificationDao;", "subscriptionDao", "Lio/heckel/ntfy/db/SubscriptionDao;", "userDao", "Lio/heckel/ntfy/db/UserDao;", "addLastShareTopic", "", "topic", "", "addNotification", "", "notification", "Lio/heckel/ntfy/db/Notification;", "(Lio/heckel/ntfy/db/Notification;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addSubscription", "subscription", "Lio/heckel/ntfy/db/Subscription;", "(Lio/heckel/ntfy/db/Subscription;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addUser", "user", "Lio/heckel/ntfy/db/User;", "(Lio/heckel/ntfy/db/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkGlobalMutedUntil", "clearAllNotificationIds", "subscriptionId", "clearIconUri", "uri", "deleteUser", "baseUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveIconUris", "", "getAutoDeleteSeconds", "getAutoDownloadMaxSize", "getAutoRestartWorkerVersion", "", "getBatteryOptimizationsRemindTime", "getBroadcastEnabled", "getConnectionProtocol", "getDarkMode", "getDefaultBaseUrl", "getDeleteWorkerVersion", "getDeletedNotificationsWithAttachments", "", "getGlobalMutedUntil", "getInsistentMaxPriorityEnabled", "getLastShareTopics", "getMinPriority", "getNotification", "notificationId", "getNotifications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotificationsLiveData", "Landroidx/lifecycle/LiveData;", "getPollWorkerVersion", "getRecordLogs", "getState", "getSubscription", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriptionByConnectorToken", "connectorToken", "getSubscriptionIdsWithInstantStatus", "Lkotlin/Pair;", "getSubscriptionIdsWithInstantStatusLiveData", "getSubscriptions", "getSubscriptionsLiveData", "getUser", "getUsers", "getUsersLiveData", "getWebSocketRemindTime", "isGlobalMuted", "markAllAsDeleted", "markAsDeleted", "markAsDeletedIfOlderThan", "olderThanTimestamp", "onlyNewNotifications", "notifications", "removeAllNotifications", "removeNotificationsIfOlderThan", "removeSubscription", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAutoDeleteSeconds", "seconds", "setAutoDownloadMaxSize", "maxSize", "setAutoRestartWorkerVersion", "version", "setBatteryOptimizationsRemindTime", "timeMillis", "setBroadcastEnabled", "enabled", "setConnectionProtocol", "connectionProtocol", "setDarkMode", "mode", "setDefaultBaseUrl", "setDeleteWorkerVersion", "setGlobalMutedUntil", "mutedUntilTimestamp", "setInsistentMaxPriorityEnabled", "setMinPriority", "minPriority", "setPollWorkerVersion", "setRecordLogsEnabled", "setWebSocketRemindTime", "toSubscription", "s", "Lio/heckel/ntfy/db/SubscriptionWithMetadata;", "toSubscriptionList", "list", "undeleteNotification", "updateNotification", "updateState", "subscriptionIds", "", "newState", "updateSubscription", "updateUser", "Companion", "app_fdroidRelease"})
public final class Repository {
    private final android.content.SharedPreferences sharedPrefs = null;
    private final io.heckel.ntfy.db.Database database = null;
    private final io.heckel.ntfy.db.SubscriptionDao subscriptionDao = null;
    private final io.heckel.ntfy.db.NotificationDao notificationDao = null;
    private final io.heckel.ntfy.db.UserDao userDao = null;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Long, io.heckel.ntfy.db.ConnectionState> connectionStates = null;
    private final androidx.lifecycle.MutableLiveData<java.util.concurrent.ConcurrentHashMap<java.lang.Long, io.heckel.ntfy.db.ConnectionState>> connectionStatesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.atomic.AtomicLong detailViewSubscriptionId = null;
    @org.jetbrains.annotations.NotNull()
    private final android.media.MediaPlayer mediaPlayer = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.db.Repository.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_ID = "MainPreferences";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_POLL_WORKER_VERSION = "PollWorkerVersion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_DELETE_WORKER_VERSION = "DeleteWorkerVersion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_AUTO_RESTART_WORKER_VERSION = "AutoRestartWorkerVersion";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_MUTED_UNTIL_TIMESTAMP = "MutedUntil";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_MIN_PRIORITY = "MinPriority";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_AUTO_DOWNLOAD_MAX_SIZE = "AutoDownload";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_AUTO_DELETE_SECONDS = "AutoDelete";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_CONNECTION_PROTOCOL = "ConnectionProtocol";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_DARK_MODE = "DarkMode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_BROADCAST_ENABLED = "BroadcastEnabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_INSISTENT_MAX_PRIORITY_ENABLED = "InsistentMaxPriority";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_RECORD_LOGS_ENABLED = "RecordLogs";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_BATTERY_OPTIMIZATIONS_REMIND_TIME = "BatteryOptimizationsRemindTime";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_WEBSOCKET_REMIND_TIME = "JsonStreamRemindTime";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_UNIFIED_PUSH_BASE_URL = "UnifiedPushBaseURL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_DEFAULT_BASE_URL = "DefaultBaseURL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SHARED_PREFS_LAST_TOPICS = "LastTopics";
    private static final int LAST_TOPICS_COUNT = 3;
    public static final int MIN_PRIORITY_USE_GLOBAL = 0;
    public static final int MIN_PRIORITY_ANY = 1;
    public static final long MUTED_UNTIL_SHOW_ALL = 0L;
    public static final long MUTED_UNTIL_FOREVER = 1L;
    public static final long MUTED_UNTIL_TOMORROW = 2L;
    private static final long ONE_MB = 1048576L;
    public static final long AUTO_DOWNLOAD_NEVER = 0L;
    public static final long AUTO_DOWNLOAD_ALWAYS = 1L;
    public static final long AUTO_DOWNLOAD_DEFAULT = 1048576L;
    private static final long ONE_DAY_SECONDS = 86400L;
    public static final long AUTO_DELETE_USE_GLOBAL = -1L;
    public static final long AUTO_DELETE_NEVER = 0L;
    public static final long AUTO_DELETE_ONE_DAY_SECONDS = 86400L;
    public static final long AUTO_DELETE_THREE_DAYS_SECONDS = 259200L;
    public static final long AUTO_DELETE_ONE_WEEK_SECONDS = 604800L;
    public static final long AUTO_DELETE_ONE_MONTH_SECONDS = 2592000L;
    public static final long AUTO_DELETE_THREE_MONTHS_SECONDS = 7776000L;
    public static final long AUTO_DELETE_DEFAULT_SECONDS = 2592000L;
    public static final int INSISTENT_MAX_PRIORITY_USE_GLOBAL = -1;
    public static final int INSISTENT_MAX_PRIORITY_ENABLED = 1;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONNECTION_PROTOCOL_JSONHTTP = "jsonhttp";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONNECTION_PROTOCOL_WS = "ws";
    public static final long BATTERY_OPTIMIZATIONS_REMIND_TIME_ALWAYS = 1L;
    public static final long BATTERY_OPTIMIZATIONS_REMIND_TIME_NEVER = 9223372036854775807L;
    public static final long WEBSOCKET_REMIND_TIME_ALWAYS = 1L;
    public static final long WEBSOCKET_REMIND_TIME_NEVER = 9223372036854775807L;
    private static final java.lang.String TAG = "NtfyRepository";
    private static io.heckel.ntfy.db.Repository instance;
    
    public Repository(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPrefs, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Database database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.atomic.AtomicLong getDetailViewSubscriptionId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.media.MediaPlayer getMediaPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.heckel.ntfy.db.Subscription>> getSubscriptionsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Set<kotlin.Pair<java.lang.Long, java.lang.Boolean>>> getSubscriptionIdsWithInstantStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubscriptions(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<io.heckel.ntfy.db.Subscription>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSubscriptionIdsWithInstantStatus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Set<kotlin.Pair<java.lang.Long, java.lang.Boolean>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.db.Subscription getSubscription(long subscriptionId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object getSubscription(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.heckel.ntfy.db.Subscription> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object getSubscriptionByConnectorToken(@org.jetbrains.annotations.NotNull()
    java.lang.String connectorToken, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.heckel.ntfy.db.Subscription> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object addSubscription(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object updateSubscription(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object removeSubscription(long subscriptionId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNotifications(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<io.heckel.ntfy.db.Notification>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.heckel.ntfy.db.Notification> getDeletedNotificationsWithAttachments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getActiveIconUris() {
        return null;
    }
    
    public final void clearIconUri(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.heckel.ntfy.db.Notification>> getNotificationsLiveData(long subscriptionId) {
        return null;
    }
    
    public final void clearAllNotificationIds(long subscriptionId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.db.Notification getNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.heckel.ntfy.db.Notification> onlyNewNotifications(long subscriptionId, @org.jetbrains.annotations.NotNull()
    java.util.List<io.heckel.ntfy.db.Notification> notifications) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.WorkerThread()
    @kotlin.Suppress(names = {"RedundantSuspendModifier"})
    public final java.lang.Object addNotification(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    public final void updateNotification(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
    }
    
    public final void undeleteNotification(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationId) {
    }
    
    public final void markAsDeleted(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationId) {
    }
    
    public final void markAllAsDeleted(long subscriptionId) {
    }
    
    public final void markAsDeletedIfOlderThan(long subscriptionId, long olderThanTimestamp) {
    }
    
    public final void removeNotificationsIfOlderThan(long subscriptionId, long olderThanTimestamp) {
    }
    
    public final void removeAllNotifications(long subscriptionId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<io.heckel.ntfy.db.User>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.heckel.ntfy.db.User>> getUsersLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addUser(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.heckel.ntfy.db.User> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteUser(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final int getPollWorkerVersion() {
        return 0;
    }
    
    public final void setPollWorkerVersion(int version) {
    }
    
    public final int getDeleteWorkerVersion() {
        return 0;
    }
    
    public final void setDeleteWorkerVersion(int version) {
    }
    
    public final int getAutoRestartWorkerVersion() {
        return 0;
    }
    
    public final void setAutoRestartWorkerVersion(int version) {
    }
    
    public final void setMinPriority(int minPriority) {
    }
    
    public final int getMinPriority() {
        return 0;
    }
    
    public final long getAutoDownloadMaxSize() {
        return 0L;
    }
    
    public final void setAutoDownloadMaxSize(long maxSize) {
    }
    
    public final long getAutoDeleteSeconds() {
        return 0L;
    }
    
    public final void setAutoDeleteSeconds(long seconds) {
    }
    
    public final void setDarkMode(int mode) {
    }
    
    public final int getDarkMode() {
        return 0;
    }
    
    public final void setConnectionProtocol(@org.jetbrains.annotations.NotNull()
    java.lang.String connectionProtocol) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConnectionProtocol() {
        return null;
    }
    
    public final boolean getBroadcastEnabled() {
        return false;
    }
    
    public final void setBroadcastEnabled(boolean enabled) {
    }
    
    public final boolean getInsistentMaxPriorityEnabled() {
        return false;
    }
    
    public final void setInsistentMaxPriorityEnabled(boolean enabled) {
    }
    
    public final boolean getRecordLogs() {
        return false;
    }
    
    public final void setRecordLogsEnabled(boolean enabled) {
    }
    
    public final long getBatteryOptimizationsRemindTime() {
        return 0L;
    }
    
    public final void setBatteryOptimizationsRemindTime(long timeMillis) {
    }
    
    public final long getWebSocketRemindTime() {
        return 0L;
    }
    
    public final void setWebSocketRemindTime(long timeMillis) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefaultBaseUrl() {
        return null;
    }
    
    public final void setDefaultBaseUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
    }
    
    public final boolean isGlobalMuted() {
        return false;
    }
    
    public final long getGlobalMutedUntil() {
        return 0L;
    }
    
    public final void setGlobalMutedUntil(long mutedUntilTimestamp) {
    }
    
    public final boolean checkGlobalMutedUntil() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLastShareTopics() {
        return null;
    }
    
    public final void addLastShareTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
    }
    
    private final java.util.List<io.heckel.ntfy.db.Subscription> toSubscriptionList(java.util.List<io.heckel.ntfy.db.SubscriptionWithMetadata> list) {
        return null;
    }
    
    private final io.heckel.ntfy.db.Subscription toSubscription(io.heckel.ntfy.db.SubscriptionWithMetadata s) {
        return null;
    }
    
    public final void updateState(@org.jetbrains.annotations.NotNull()
    java.util.Collection<java.lang.Long> subscriptionIds, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.ConnectionState newState) {
    }
    
    private final io.heckel.ntfy.db.ConnectionState getState(long subscriptionId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u00106\u001a\u0002052\u0006\u00107\u001a\u000208J\u0018\u00106\u001a\u0002052\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0012X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lio/heckel/ntfy/db/Repository$Companion;", "", "()V", "AUTO_DELETE_DEFAULT_SECONDS", "", "AUTO_DELETE_NEVER", "AUTO_DELETE_ONE_DAY_SECONDS", "AUTO_DELETE_ONE_MONTH_SECONDS", "AUTO_DELETE_ONE_WEEK_SECONDS", "AUTO_DELETE_THREE_DAYS_SECONDS", "AUTO_DELETE_THREE_MONTHS_SECONDS", "AUTO_DELETE_USE_GLOBAL", "AUTO_DOWNLOAD_ALWAYS", "AUTO_DOWNLOAD_DEFAULT", "AUTO_DOWNLOAD_NEVER", "BATTERY_OPTIMIZATIONS_REMIND_TIME_ALWAYS", "BATTERY_OPTIMIZATIONS_REMIND_TIME_NEVER", "CONNECTION_PROTOCOL_JSONHTTP", "", "CONNECTION_PROTOCOL_WS", "INSISTENT_MAX_PRIORITY_ENABLED", "", "INSISTENT_MAX_PRIORITY_USE_GLOBAL", "LAST_TOPICS_COUNT", "MIN_PRIORITY_ANY", "MIN_PRIORITY_USE_GLOBAL", "MUTED_UNTIL_FOREVER", "MUTED_UNTIL_SHOW_ALL", "MUTED_UNTIL_TOMORROW", "ONE_DAY_SECONDS", "ONE_MB", "SHARED_PREFS_AUTO_DELETE_SECONDS", "SHARED_PREFS_AUTO_DOWNLOAD_MAX_SIZE", "SHARED_PREFS_AUTO_RESTART_WORKER_VERSION", "SHARED_PREFS_BATTERY_OPTIMIZATIONS_REMIND_TIME", "SHARED_PREFS_BROADCAST_ENABLED", "SHARED_PREFS_CONNECTION_PROTOCOL", "SHARED_PREFS_DARK_MODE", "SHARED_PREFS_DEFAULT_BASE_URL", "SHARED_PREFS_DELETE_WORKER_VERSION", "SHARED_PREFS_ID", "SHARED_PREFS_INSISTENT_MAX_PRIORITY_ENABLED", "SHARED_PREFS_LAST_TOPICS", "SHARED_PREFS_MIN_PRIORITY", "SHARED_PREFS_MUTED_UNTIL_TIMESTAMP", "SHARED_PREFS_POLL_WORKER_VERSION", "SHARED_PREFS_RECORD_LOGS_ENABLED", "SHARED_PREFS_UNIFIED_PUSH_BASE_URL", "SHARED_PREFS_WEBSOCKET_REMIND_TIME", "TAG", "WEBSOCKET_REMIND_TIME_ALWAYS", "WEBSOCKET_REMIND_TIME_NEVER", "instance", "Lio/heckel/ntfy/db/Repository;", "getInstance", "context", "Landroid/content/Context;", "sharedPrefs", "Landroid/content/SharedPreferences;", "database", "Lio/heckel/ntfy/db/Database;", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.db.Repository getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final io.heckel.ntfy.db.Repository getInstance(android.content.SharedPreferences sharedPrefs, io.heckel.ntfy.db.Database database) {
            return null;
        }
    }
}