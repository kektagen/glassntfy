package io.heckel.ntfy.service;

import java.lang.System;

/**
 * This class only manages the SubscriberService, i.e. it starts or stops it.
 * It's used in multiple activities.
 *
 * We are starting the service via a worker and not directly because since Android 7
 * (but officially since Lollipop!), any process called by a BroadcastReceiver
 * (only manifest-declared receiver) is run at low priority and hence eventually
 * killed by Android.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0002\b\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lio/heckel/ntfy/service/SubscriberServiceManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "refresh", "", "restart", "Companion", "ServiceStartWorker", "app_fdroidRelease"})
public final class SubscriberServiceManager {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.service.SubscriberServiceManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfySubscriberMgr";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WORK_NAME_ONCE = "ServiceStartWorkerOnce";
    
    public SubscriberServiceManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void refresh() {
    }
    
    public final void restart() {
    }
    
    /**
     * Starts or stops the foreground service by figuring out how many instant delivery subscriptions
     * exist. If there's > 0, then we need a foreground service.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lio/heckel/ntfy/service/SubscriberServiceManager$ServiceStartWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_fdroidRelease"})
    public static final class ServiceStartWorker extends androidx.work.CoroutineWorker {
        private final android.content.Context context = null;
        
        public ServiceStartWorker(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        androidx.work.WorkerParameters params) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> continuation) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lio/heckel/ntfy/service/SubscriberServiceManager$Companion;", "", "()V", "TAG", "", "WORK_NAME_ONCE", "refresh", "", "context", "Landroid/content/Context;", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void refresh(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}