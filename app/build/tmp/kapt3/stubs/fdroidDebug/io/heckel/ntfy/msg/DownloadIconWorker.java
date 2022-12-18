package io.heckel.ntfy.msg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0016H\u0002J\u0014\u0010\u001d\u001a\u00020\u001c2\n\u0010\u001e\u001a\u00060\u001fj\u0002` H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u001cH\u0002J\b\u0010$\u001a\u00020\u001cH\u0016J\u0010\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\nH\u0002J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/heckel/ntfy/msg/DownloadIconWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "client", "Lokhttp3/OkHttpClient;", "icon", "Lio/heckel/ntfy/db/Icon;", "notification", "Lio/heckel/ntfy/db/Notification;", "notifier", "Lio/heckel/ntfy/msg/NotificationService;", "repository", "Lio/heckel/ntfy/db/Repository;", "subscription", "Lio/heckel/ntfy/db/Subscription;", "uri", "Landroid/net/Uri;", "createIconFile", "Ljava/io/File;", "createIconUri", "iconFile", "doWork", "Landroidx/work/ListenableWorker$Result;", "downloadIcon", "", "failed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getDownloadLimit", "", "maybeDeleteFile", "onStopped", "save", "newIcon", "shouldAbortDownload", "", "response", "Lokhttp3/Response;", "Companion", "app_fdroidDebug"})
public final class DownloadIconWorker extends androidx.work.Worker {
    private final android.content.Context context = null;
    private final okhttp3.OkHttpClient client = null;
    private final io.heckel.ntfy.msg.NotificationService notifier = null;
    private io.heckel.ntfy.db.Repository repository;
    private io.heckel.ntfy.db.Subscription subscription;
    private io.heckel.ntfy.db.Notification notification;
    private io.heckel.ntfy.db.Icon icon;
    private android.net.Uri uri;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.msg.DownloadIconWorker.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FILE_PROVIDER_AUTHORITY = "io.heckel.ntfy.provider";
    public static final long DEFAULT_MAX_ICON_DOWNLOAD_BYTES = 307200L;
    public static final long MAX_ICON_DOWNLOAD_BYTES = 5242880L;
    public static final int MAX_CACHE_MILLIS = 86400000;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ICON_CACHE_DIR = "icons";
    private static final java.lang.String TAG = "NtfyIconDownload";
    private static final int BUFFER_SIZE = 8192;
    
    public DownloadIconWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.work.ListenableWorker.Result doWork() {
        return null;
    }
    
    @java.lang.Override()
    public void onStopped() {
    }
    
    private final void downloadIcon(java.io.File iconFile) {
    }
    
    private final void failed(java.lang.Exception e) {
    }
    
    private final void maybeDeleteFile() {
    }
    
    private final void save(io.heckel.ntfy.db.Icon newIcon) {
    }
    
    private final boolean shouldAbortDownload(okhttp3.Response response) {
        return false;
    }
    
    private final long getDownloadLimit() {
        return 0L;
    }
    
    private final java.io.File createIconFile(io.heckel.ntfy.db.Icon icon) {
        return null;
    }
    
    private final android.net.Uri createIconUri(java.io.File iconFile) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/heckel/ntfy/msg/DownloadIconWorker$Companion;", "", "()V", "BUFFER_SIZE", "", "DEFAULT_MAX_ICON_DOWNLOAD_BYTES", "", "FILE_PROVIDER_AUTHORITY", "", "ICON_CACHE_DIR", "INPUT_DATA_ID", "MAX_CACHE_MILLIS", "MAX_ICON_DOWNLOAD_BYTES", "TAG", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}