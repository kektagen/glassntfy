package io.heckel.ntfy.work;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lio/heckel/ntfy/work/PollWorker;", "Landroidx/work/CoroutineWorker;", "ctx", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_fdroidRelease"})
public final class PollWorker extends androidx.work.CoroutineWorker {
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.work.PollWorker.Companion Companion = null;
    public static final int VERSION = io.heckel.ntfy.BuildConfig.VERSION_CODE;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfyPollWorker";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_NAME_PERIODIC_ALL = "NtfyPollWorkerPeriodic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_NAME_ONCE_SINGE_PREFIX = "NtfyPollWorkerSingle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_BASE_URL = "baseUrl";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_TOPIC = "topic";
    
    public PollWorker(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lio/heckel/ntfy/work/PollWorker$Companion;", "", "()V", "INPUT_DATA_BASE_URL", "", "INPUT_DATA_TOPIC", "TAG", "VERSION", "", "WORK_NAME_ONCE_SINGE_PREFIX", "WORK_NAME_PERIODIC_ALL", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}