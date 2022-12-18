package io.heckel.ntfy.msg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0014\u0010\u001c\u001a\u00020\u00192\n\u0010\u001d\u001a\u00060\u001ej\u0002`\u001fH\u0002J\u0017\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u00a2\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0016J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\bH\u0002J\b\u0010\'\u001a\u00020\u001bH\u0002J\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lio/heckel/ntfy/msg/DownloadAttachmentWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "attachment", "Lio/heckel/ntfy/db/Attachment;", "client", "Lokhttp3/OkHttpClient;", "notification", "Lio/heckel/ntfy/db/Notification;", "notifier", "Lio/heckel/ntfy/msg/NotificationService;", "repository", "Lio/heckel/ntfy/db/Repository;", "subscription", "Lio/heckel/ntfy/db/Subscription;", "uri", "Landroid/net/Uri;", "createUri", "doWork", "Landroidx/work/ListenableWorker$Result;", "downloadAttachment", "", "userAction", "", "failed", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getDownloadLimit", "", "(Z)Ljava/lang/Long;", "maybeDeleteFile", "onStopped", "save", "newAttachment", "shouldAbortDownload", "updateAttachmentFromResponse", "response", "Lokhttp3/Response;", "Companion", "app_fdroidRelease"})
public final class DownloadAttachmentWorker extends androidx.work.Worker {
    private final android.content.Context context = null;
    private final okhttp3.OkHttpClient client = null;
    private final io.heckel.ntfy.msg.NotificationService notifier = null;
    private io.heckel.ntfy.db.Repository repository;
    private io.heckel.ntfy.db.Subscription subscription;
    private io.heckel.ntfy.db.Notification notification;
    private io.heckel.ntfy.db.Attachment attachment;
    private android.net.Uri uri;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.msg.DownloadAttachmentWorker.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_ID = "id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INPUT_DATA_USER_ACTION = "userAction";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FILE_PROVIDER_AUTHORITY = "io.heckel.ntfy.provider";
    private static final java.lang.String TAG = "NtfyAttachDownload";
    private static final java.lang.String ATTACHMENT_CACHE_DIR = "attachments";
    private static final int BUFFER_SIZE = 8192;
    private static final int NOTIFICATION_UPDATE_INTERVAL_MILLIS = 800;
    
    public DownloadAttachmentWorker(@org.jetbrains.annotations.NotNull()
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
    
    private final void downloadAttachment(boolean userAction) {
    }
    
    private final io.heckel.ntfy.db.Attachment updateAttachmentFromResponse(okhttp3.Response response) {
        return null;
    }
    
    private final void failed(java.lang.Exception e) {
    }
    
    private final void maybeDeleteFile() {
    }
    
    private final void save(io.heckel.ntfy.db.Attachment newAttachment) {
    }
    
    private final boolean shouldAbortDownload() {
        return false;
    }
    
    private final java.lang.Long getDownloadLimit(boolean userAction) {
        return null;
    }
    
    private final android.net.Uri createUri(io.heckel.ntfy.db.Notification notification) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/heckel/ntfy/msg/DownloadAttachmentWorker$Companion;", "", "()V", "ATTACHMENT_CACHE_DIR", "", "BUFFER_SIZE", "", "FILE_PROVIDER_AUTHORITY", "INPUT_DATA_ID", "INPUT_DATA_USER_ACTION", "NOTIFICATION_UPDATE_INTERVAL_MILLIS", "TAG", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}