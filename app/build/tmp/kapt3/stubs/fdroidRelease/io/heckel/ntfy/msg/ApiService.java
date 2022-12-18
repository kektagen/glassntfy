package io.heckel.ntfy.msg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 ,2\u00020\u0001:\u0003,-.B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ:\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fJn\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\b\b\u0002\u0010\u001d\u001a\u00020\f2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\fJk\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\'\u0010$\u001a#\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b&\u0012\b\b\'\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00170%2\u0016\u0010(\u001a\u0012\u0012\b\u0012\u00060*j\u0002`+\u0012\u0004\u0012\u00020\u00170)R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lio/heckel/ntfy/msg/ApiService;", "", "()V", "client", "Lokhttp3/OkHttpClient;", "parser", "Lio/heckel/ntfy/msg/NotificationParser;", "publishClient", "subscriberClient", "checkAuth", "", "baseUrl", "", "topic", "user", "Lio/heckel/ntfy/db/User;", "poll", "", "Lio/heckel/ntfy/db/Notification;", "subscriptionId", "", "since", "publish", "", "message", "title", "priority", "", "tags", "delay", "body", "Lokhttp3/RequestBody;", "filename", "subscribe", "Lokhttp3/Call;", "topics", "notify", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "fail", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Companion", "EntityTooLargeException", "UnauthorizedException", "app_fdroidRelease"})
public final class ApiService {
    private final okhttp3.OkHttpClient client = null;
    private final okhttp3.OkHttpClient publishClient = null;
    private final okhttp3.OkHttpClient subscriberClient = null;
    private final io.heckel.ntfy.msg.NotificationParser parser = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.msg.ApiService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String USER_AGENT = null;
    private static final java.lang.String TAG = "NtfyApiService";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONTROL_TOPIC = "~control";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EVENT_MESSAGE = "message";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EVENT_KEEPALIVE = "keepalive";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EVENT_POLL_REQUEST = "poll_request";
    
    public ApiService() {
        super();
    }
    
    public final void publish(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.User user, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int priority, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.NotNull()
    java.lang.String delay, @org.jetbrains.annotations.Nullable()
    okhttp3.RequestBody body, @org.jetbrains.annotations.NotNull()
    java.lang.String filename) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<io.heckel.ntfy.db.Notification> poll(long subscriptionId, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.User user, @org.jetbrains.annotations.Nullable()
    java.lang.String since) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.Call subscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topics, @org.jetbrains.annotations.Nullable()
    java.lang.String since, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.User user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super io.heckel.ntfy.db.Notification, kotlin.Unit> notify, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> fail) {
        return null;
    }
    
    public final boolean checkAuth(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.User user) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lio/heckel/ntfy/msg/ApiService$UnauthorizedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "user", "Lio/heckel/ntfy/db/User;", "(Lio/heckel/ntfy/db/User;)V", "getUser", "()Lio/heckel/ntfy/db/User;", "app_fdroidRelease"})
    public static final class UnauthorizedException extends java.lang.Exception {
        @org.jetbrains.annotations.Nullable()
        private final io.heckel.ntfy.db.User user = null;
        
        public UnauthorizedException(@org.jetbrains.annotations.Nullable()
        io.heckel.ntfy.db.User user) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final io.heckel.ntfy.db.User getUser() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lio/heckel/ntfy/msg/ApiService$EntityTooLargeException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "app_fdroidRelease"})
    public static final class EntityTooLargeException extends java.lang.Exception {
        
        public EntityTooLargeException() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lio/heckel/ntfy/msg/ApiService$Companion;", "", "()V", "CONTROL_TOPIC", "", "EVENT_KEEPALIVE", "EVENT_MESSAGE", "EVENT_POLL_REQUEST", "TAG", "USER_AGENT", "getUSER_AGENT", "()Ljava/lang/String;", "requestBuilder", "Lokhttp3/Request$Builder;", "url", "user", "Lio/heckel/ntfy/db/User;", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUSER_AGENT() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.Request.Builder requestBuilder(@org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        io.heckel.ntfy.db.User user) {
            return null;
        }
    }
}