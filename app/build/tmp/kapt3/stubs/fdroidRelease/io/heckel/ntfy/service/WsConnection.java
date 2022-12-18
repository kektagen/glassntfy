package io.heckel.ntfy.service;

import java.lang.System;

/**
 * Connect to ntfy server via WebSockets. This connection represents a single connection to a server, with
 * one or more topics. When the topics are changed, the connection is recreated by the service.
 *
 * The connection re-connects on failure, indefinitely. It reports limited status via the stateChangeListener,
 * and forwards incoming messages via the notificationListener.
 *
 * The original class is taken from the fantastic Gotify project (MIT). Thank you:
 * https://github.com/gotify/android/blob/master/app/src/main/java/com/github/gotify/service/WebSocketConnection.java
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 12\u00020\u0001:\u0003123Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u001e\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0002\u0010\u0015J\b\u0010-\u001a\u00020\u000fH\u0016J\u000e\u0010.\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u001cJ\n\u0010#\u001a\u0004\u0018\u00010\tH\u0016J\b\u00100\u001a\u00020\u000fH\u0016R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\n\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lio/heckel/ntfy/service/WsConnection;", "Lio/heckel/ntfy/service/Connection;", "connectionId", "Lio/heckel/ntfy/service/ConnectionId;", "repository", "Lio/heckel/ntfy/db/Repository;", "user", "Lio/heckel/ntfy/db/User;", "sinceId", "", "stateChangeListener", "Lkotlin/Function2;", "", "", "Lio/heckel/ntfy/db/ConnectionState;", "", "notificationListener", "Lio/heckel/ntfy/db/Subscription;", "Lio/heckel/ntfy/db/Notification;", "alarmManager", "Landroid/app/AlarmManager;", "(Lio/heckel/ntfy/service/ConnectionId;Lio/heckel/ntfy/db/Repository;Lio/heckel/ntfy/db/User;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroid/app/AlarmManager;)V", "baseUrl", "client", "Lokhttp3/OkHttpClient;", "closed", "", "errorCount", "", "globalId", "listenerId", "Ljava/util/concurrent/atomic/AtomicLong;", "parser", "Lio/heckel/ntfy/msg/NotificationParser;", "shortUrl", "since", "Ljava/util/concurrent/atomic/AtomicReference;", "state", "Lio/heckel/ntfy/service/WsConnection$State;", "subscriptionIds", "topicsStr", "topicsToSubscriptionIds", "", "webSocket", "Lokhttp3/WebSocket;", "close", "scheduleReconnect", "seconds", "start", "Companion", "Listener", "State", "app_fdroidRelease"})
public final class WsConnection implements io.heckel.ntfy.service.Connection {
    private final io.heckel.ntfy.service.ConnectionId connectionId = null;
    private final io.heckel.ntfy.db.Repository repository = null;
    private final io.heckel.ntfy.db.User user = null;
    private final java.lang.String sinceId = null;
    private final kotlin.jvm.functions.Function2<java.util.Collection<java.lang.Long>, io.heckel.ntfy.db.ConnectionState, kotlin.Unit> stateChangeListener = null;
    private final kotlin.jvm.functions.Function2<io.heckel.ntfy.db.Subscription, io.heckel.ntfy.db.Notification, kotlin.Unit> notificationListener = null;
    private final android.app.AlarmManager alarmManager = null;
    private final io.heckel.ntfy.msg.NotificationParser parser = null;
    private final okhttp3.OkHttpClient client = null;
    private int errorCount = 0;
    private okhttp3.WebSocket webSocket;
    private io.heckel.ntfy.service.WsConnection.State state;
    private boolean closed = false;
    private final long globalId = 0L;
    private final java.util.concurrent.atomic.AtomicLong listenerId = null;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.String> since = null;
    private final java.lang.String baseUrl = null;
    private final java.util.Map<java.lang.String, java.lang.Long> topicsToSubscriptionIds = null;
    private final java.util.Collection<java.lang.Long> subscriptionIds = null;
    private final java.lang.String topicsStr = null;
    private final java.lang.String shortUrl = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.service.WsConnection.Companion Companion = null;
    private static final java.lang.String TAG = "NtfyWsConnection";
    private static final java.lang.String RECONNECT_TAG = "WsReconnect";
    private static final int WS_CLOSE_NORMAL = 1000;
    private static final java.util.List<java.lang.Integer> RETRY_SECONDS = null;
    private static final java.util.concurrent.atomic.AtomicLong GLOBAL_ID = null;
    
    public WsConnection(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.service.ConnectionId connectionId, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Repository repository, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.User user, @org.jetbrains.annotations.Nullable()
    java.lang.String sinceId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.util.Collection<java.lang.Long>, ? super io.heckel.ntfy.db.ConnectionState, kotlin.Unit> stateChangeListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super io.heckel.ntfy.db.Subscription, ? super io.heckel.ntfy.db.Notification, kotlin.Unit> notificationListener, @org.jetbrains.annotations.NotNull()
    android.app.AlarmManager alarmManager) {
        super();
    }
    
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void start() {
    }
    
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized void close() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Synchronized()
    @java.lang.Override()
    public synchronized java.lang.String since() {
        return null;
    }
    
    @kotlin.jvm.Synchronized()
    public final synchronized void scheduleReconnect(int seconds) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/heckel/ntfy/service/WsConnection$Listener;", "Lokhttp3/WebSocketListener;", "id", "", "(Lio/heckel/ntfy/service/WsConnection;J)V", "onClosed", "", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "", "onFailure", "t", "", "response", "Lokhttp3/Response;", "onMessage", "text", "onOpen", "synchronize", "tag", "fn", "Lkotlin/Function0;", "app_fdroidRelease"})
    final class Listener extends okhttp3.WebSocketListener {
        private final long id = 0L;
        
        public Listener(long id) {
            super();
        }
        
        @java.lang.Override()
        public void onOpen(@org.jetbrains.annotations.NotNull()
        okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
        okhttp3.Response response) {
        }
        
        @java.lang.Override()
        public void onMessage(@org.jetbrains.annotations.NotNull()
        okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
        }
        
        @java.lang.Override()
        public void onClosed(@org.jetbrains.annotations.NotNull()
        okhttp3.WebSocket webSocket, int code, @org.jetbrains.annotations.NotNull()
        java.lang.String reason) {
        }
        
        @java.lang.Override()
        public void onFailure(@org.jetbrains.annotations.NotNull()
        okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
        java.lang.Throwable t, @org.jetbrains.annotations.Nullable()
        okhttp3.Response response) {
        }
        
        private final void synchronize(java.lang.String tag, kotlin.jvm.functions.Function0<kotlin.Unit> fn) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/heckel/ntfy/service/WsConnection$State;", "", "(Ljava/lang/String;I)V", "Scheduled", "Connecting", "Connected", "Disconnected", "app_fdroidRelease"})
    public static enum State {
        /*public static final*/ Scheduled /* = new Scheduled() */,
        /*public static final*/ Connecting /* = new Connecting() */,
        /*public static final*/ Connected /* = new Connected() */,
        /*public static final*/ Disconnected /* = new Disconnected() */;
        
        State() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/heckel/ntfy/service/WsConnection$Companion;", "", "()V", "GLOBAL_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "RECONNECT_TAG", "", "RETRY_SECONDS", "", "", "TAG", "WS_CLOSE_NORMAL", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}