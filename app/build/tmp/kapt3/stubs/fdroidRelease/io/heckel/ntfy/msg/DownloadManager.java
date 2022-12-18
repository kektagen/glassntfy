package io.heckel.ntfy.msg;

import java.lang.System;

/**
 * Download attachment in the background via WorkManager
 *
 * The indirection via WorkManager is required since this code may be executed
 * in a doze state and Internet may not be available. It's also best practice, apparently.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J&\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lio/heckel/ntfy/msg/DownloadManager;", "", "()V", "DOWNLOAD_WORK_ATTACHMENT_NAME_PREFIX", "", "DOWNLOAD_WORK_BOTH_NAME_PREFIX", "DOWNLOAD_WORK_ICON_NAME_PREFIX", "TAG", "cancel", "", "context", "Landroid/content/Context;", "id", "enqueue", "notificationId", "userAction", "", "type", "Lio/heckel/ntfy/msg/DownloadType;", "enqueueAttachment", "enqueueAttachmentAndIcon", "enqueueIcon", "app_fdroidRelease"})
public final class DownloadManager {
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.msg.DownloadManager INSTANCE = null;
    private static final java.lang.String TAG = "NtfyDownloadManager";
    private static final java.lang.String DOWNLOAD_WORK_ATTACHMENT_NAME_PREFIX = "io.heckel.ntfy.DOWNLOAD_FILE_";
    private static final java.lang.String DOWNLOAD_WORK_ICON_NAME_PREFIX = "io.heckel.ntfy.DOWNLOAD_ICON_";
    private static final java.lang.String DOWNLOAD_WORK_BOTH_NAME_PREFIX = "io.heckel.ntfy.DOWNLOAD_BOTH_";
    
    private DownloadManager() {
        super();
    }
    
    public final void enqueue(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String notificationId, boolean userAction, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.msg.DownloadType type) {
    }
    
    private final void enqueueAttachment(android.content.Context context, java.lang.String notificationId, boolean userAction) {
    }
    
    private final void enqueueIcon(android.content.Context context, java.lang.String notificationId) {
    }
    
    private final void enqueueAttachmentAndIcon(android.content.Context context, java.lang.String notificationId, boolean userAction) {
    }
    
    public final void cancel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}