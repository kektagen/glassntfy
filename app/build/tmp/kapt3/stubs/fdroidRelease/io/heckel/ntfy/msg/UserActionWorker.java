package io.heckel.ntfy.msg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\bH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/heckel/ntfy/msg/UserActionWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "action", "Lio/heckel/ntfy/db/Action;", "broadcaster", "Lio/heckel/ntfy/msg/BroadcastService;", "client", "Lokhttp3/OkHttpClient;", "notification", "Lio/heckel/ntfy/db/Notification;", "notifier", "Lio/heckel/ntfy/msg/NotificationService;", "repository", "Lio/heckel/ntfy/db/Repository;", "subscription", "Lio/heckel/ntfy/db/Subscription;", "doWork", "Landroidx/work/ListenableWorker$Result;", "performBroadcastAction", "", "performHttpAction", "save", "newAction", "Companion", "app_fdroidRelease"})
public final class UserActionWorker extends androidx.work.Worker {
    private final android.content.Context context = null;
    private final okhttp3.OkHttpClient client = null;
    private final io.heckel.ntfy.msg.NotificationService notifier = null;
    private final io.heckel.ntfy.msg.BroadcastService broadcaster = null;
    private io.heckel.ntfy.db.Repository repository;
    private io.heckel.ntfy.db.Subscription subscription;
    private io.heckel.ntfy.db.Notification notification;
    private io.heckel.ntfy.db.Action action;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.msg.UserActionWorker.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_NOTIFICATION_ID = "notificationId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_ACTION_ID = "actionId";
    private static final java.lang.String DEFAULT_HTTP_ACTION_METHOD = "POST";
    private static final java.lang.String TAG = "NtfyUserActWrk";
    
    public UserActionWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    private final void performBroadcastAction(io.heckel.ntfy.db.Action action) {
    }
    
    private final void performHttpAction(io.heckel.ntfy.db.Action action) {
    }
    
    private final void save(io.heckel.ntfy.db.Action newAction) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lio/heckel/ntfy/msg/UserActionWorker$Companion;", "", "()V", "DEFAULT_HTTP_ACTION_METHOD", "", "INPUT_DATA_ACTION_ID", "INPUT_DATA_NOTIFICATION_ID", "TAG", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}