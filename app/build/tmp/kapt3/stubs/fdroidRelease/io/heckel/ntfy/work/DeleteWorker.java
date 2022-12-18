package io.heckel.ntfy.work;

import java.lang.System;

/**
 * Deletes notifications marked for deletion and attachments for deleted notifications.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0011\u0010\n\u001a\u00020\bH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lio/heckel/ntfy/work/DeleteWorker;", "Landroidx/work/CoroutineWorker;", "ctx", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "deleteExpiredAttachments", "", "deleteExpiredIcons", "deleteExpiredNotifications", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doWork", "Landroidx/work/ListenableWorker$Result;", "Companion", "app_fdroidRelease"})
public final class DeleteWorker extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.work.DeleteWorker.Companion Companion = null;
    public static final int VERSION = io.heckel.ntfy.BuildConfig.VERSION_CODE;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfyDeleteWorker";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_NAME_PERIODIC_ALL = "NtfyDeleteWorkerPeriodic";
    private static final long ONE_DAY_SECONDS = 86400L;
    public static final long HARD_DELETE_AFTER_SECONDS = 10368000L;
    
    public DeleteWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
        return null;
    }
    
    private final void deleteExpiredAttachments() {
    }
    
    private final void deleteExpiredIcons() {
    }
    
    private final java.lang.Object deleteExpiredNotifications(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/heckel/ntfy/work/DeleteWorker$Companion;", "", "()V", "HARD_DELETE_AFTER_SECONDS", "", "ONE_DAY_SECONDS", "TAG", "", "VERSION", "", "WORK_NAME_PERIODIC_ALL", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}