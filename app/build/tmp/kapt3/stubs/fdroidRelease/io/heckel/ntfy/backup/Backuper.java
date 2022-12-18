package io.heckel.ntfy.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 82\u00020\u0001:\u00018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J!\u0010\u001f\u001a\u00020\u00132\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ!\u0010\"\u001a\u00020\u00132\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ7\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010,J)\u0010-\u001a\u00020\u00152\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\b\u00101\u001a\u00020\u001eH\u0002J\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020!0\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020$0\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u0019\u00104\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0006\u00106\u001a\u000207R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lio/heckel/ntfy/backup/Backuper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "gson", "Lcom/google/gson/Gson;", "messenger", "Lio/heckel/ntfy/firebase/FirebaseMessenger;", "notifier", "Lio/heckel/ntfy/msg/NotificationService;", "repository", "Lio/heckel/ntfy/db/Repository;", "resolver", "Landroid/content/ContentResolver;", "kotlin.jvm.PlatformType", "applyBackupFile", "", "backupFile", "Lio/heckel/ntfy/backup/BackupFile;", "(Lio/heckel/ntfy/backup/BackupFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyNotifications", "notifications", "", "Lio/heckel/ntfy/backup/Notification;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applySettings", "settings", "Lio/heckel/ntfy/backup/Settings;", "applySubscriptions", "subscriptions", "Lio/heckel/ntfy/backup/Subscription;", "applyUsers", "users", "Lio/heckel/ntfy/backup/User;", "backup", "uri", "Landroid/net/Uri;", "withSettings", "", "withSubscriptions", "withUsers", "(Landroid/net/Uri;ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createBackupFile", "(ZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNotificationList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSettings", "createSubscriptionList", "createUserList", "restore", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settingsAsString", "", "Companion", "app_fdroidRelease"})
public final class Backuper {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final com.google.gson.Gson gson = null;
    private final android.content.ContentResolver resolver = null;
    private final io.heckel.ntfy.db.Repository repository = null;
    private final io.heckel.ntfy.firebase.FirebaseMessenger messenger = null;
    private final io.heckel.ntfy.msg.NotificationService notifier = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.backup.Backuper.Companion Companion = null;
    private static final java.lang.String FILE_MAGIC = "ntfy2586";
    private static final int FILE_VERSION = 1;
    private static final java.lang.String TAG = "NtfyExporter";
    
    public Backuper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object backup(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, boolean withSettings, boolean withSubscriptions, boolean withUsers, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object restore(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String settingsAsString() {
        return null;
    }
    
    private final java.lang.Object applyBackupFile(io.heckel.ntfy.backup.BackupFile backupFile, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void applySettings(io.heckel.ntfy.backup.Settings settings) {
    }
    
    private final java.lang.Object applySubscriptions(java.util.List<io.heckel.ntfy.backup.Subscription> subscriptions, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object applyNotifications(java.util.List<io.heckel.ntfy.backup.Notification> notifications, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object applyUsers(java.util.List<io.heckel.ntfy.backup.User> users, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object createBackupFile(boolean withSettings, boolean withSubscriptions, boolean withUsers, kotlin.coroutines.Continuation<? super io.heckel.ntfy.backup.BackupFile> continuation) {
        return null;
    }
    
    private final io.heckel.ntfy.backup.Settings createSettings() {
        return null;
    }
    
    private final java.lang.Object createSubscriptionList(kotlin.coroutines.Continuation<? super java.util.List<io.heckel.ntfy.backup.Subscription>> continuation) {
        return null;
    }
    
    private final java.lang.Object createNotificationList(kotlin.coroutines.Continuation<? super java.util.List<io.heckel.ntfy.backup.Notification>> continuation) {
        return null;
    }
    
    private final java.lang.Object createUserList(kotlin.coroutines.Continuation<? super java.util.List<io.heckel.ntfy.backup.User>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lio/heckel/ntfy/backup/Backuper$Companion;", "", "()V", "FILE_MAGIC", "", "FILE_VERSION", "", "TAG", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}