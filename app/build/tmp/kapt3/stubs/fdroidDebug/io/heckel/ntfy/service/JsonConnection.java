package io.heckel.ntfy.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\u0018\u0000 +2\u00020\u0001:\u0001+B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001e\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000f\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u000f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\u0002\u0010\u001aJ\b\u0010&\u001a\u00020\u0013H\u0016J\u0018\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u0011H\u0002J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0016J\b\u0010*\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/heckel/ntfy/service/JsonConnection;", "Lio/heckel/ntfy/service/Connection;", "connectionId", "Lio/heckel/ntfy/service/ConnectionId;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "repository", "Lio/heckel/ntfy/db/Repository;", "api", "Lio/heckel/ntfy/msg/ApiService;", "user", "Lio/heckel/ntfy/db/User;", "sinceId", "", "stateChangeListener", "Lkotlin/Function2;", "", "", "Lio/heckel/ntfy/db/ConnectionState;", "", "notificationListener", "Lio/heckel/ntfy/db/Subscription;", "Lio/heckel/ntfy/db/Notification;", "serviceActive", "Lkotlin/Function0;", "", "(Lio/heckel/ntfy/service/ConnectionId;Lkotlinx/coroutines/CoroutineScope;Lio/heckel/ntfy/db/Repository;Lio/heckel/ntfy/msg/ApiService;Lio/heckel/ntfy/db/User;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "baseUrl", "call", "Lokhttp3/Call;", "job", "Lkotlinx/coroutines/Job;", "since", "subscriptionIds", "topicsStr", "topicsToSubscriptionIds", "", "url", "close", "nextRetryMillis", "retryMillis", "startTime", "start", "Companion", "app_fdroidDebug"})
public final class JsonConnection implements io.heckel.ntfy.service.Connection {
    private final io.heckel.ntfy.service.ConnectionId connectionId = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final io.heckel.ntfy.db.Repository repository = null;
    private final io.heckel.ntfy.msg.ApiService api = null;
    private final io.heckel.ntfy.db.User user = null;
    private final java.lang.String sinceId = null;
    private final kotlin.jvm.functions.Function2<java.util.Collection<java.lang.Long>, io.heckel.ntfy.db.ConnectionState, kotlin.Unit> stateChangeListener = null;
    private final kotlin.jvm.functions.Function2<io.heckel.ntfy.db.Subscription, io.heckel.ntfy.db.Notification, kotlin.Unit> notificationListener = null;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> serviceActive = null;
    private final java.lang.String baseUrl = null;
    private final java.util.Map<java.lang.String, java.lang.Long> topicsToSubscriptionIds = null;
    private final java.util.Collection<java.lang.Long> subscriptionIds = null;
    private final java.lang.String topicsStr = null;
    private final java.lang.String url = null;
    private java.lang.String since;
    private okhttp3.Call call;
    private kotlinx.coroutines.Job job;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.service.JsonConnection.Companion Companion = null;
    private static final java.lang.String TAG = "NtfySubscriberConn";
    private static final long CONNECTION_LOOP_DELAY_MILLIS = 30000L;
    private static final long RETRY_STEP_MILLIS = 5000L;
    private static final long RETRY_MAX_MILLIS = 60000L;
    private static final long RETRY_RESET_AFTER_MILLIS = 60000L;
    
    public JsonConnection(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.service.ConnectionId connectionId, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Repository repository, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.msg.ApiService api, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.User user, @org.jetbrains.annotations.Nullable()
    java.lang.String sinceId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.util.Collection<java.lang.Long>, ? super io.heckel.ntfy.db.ConnectionState, kotlin.Unit> stateChangeListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super io.heckel.ntfy.db.Subscription, ? super io.heckel.ntfy.db.Notification, kotlin.Unit> notificationListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> serviceActive) {
        super();
    }
    
    @java.lang.Override()
    public void start() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String since() {
        return null;
    }
    
    @java.lang.Override()
    public void close() {
    }
    
    private final long nextRetryMillis(long retryMillis, long startTime) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lio/heckel/ntfy/service/JsonConnection$Companion;", "", "()V", "CONNECTION_LOOP_DELAY_MILLIS", "", "RETRY_MAX_MILLIS", "RETRY_RESET_AFTER_MILLIS", "RETRY_STEP_MILLIS", "TAG", "", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}