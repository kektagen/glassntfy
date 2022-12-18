package io.heckel.ntfy.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tH\u00c6\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u00c6\u0003J_\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lio/heckel/ntfy/backup/BackupFile;", "", "magic", "", "version", "", "settings", "Lio/heckel/ntfy/backup/Settings;", "subscriptions", "", "Lio/heckel/ntfy/backup/Subscription;", "notifications", "Lio/heckel/ntfy/backup/Notification;", "users", "Lio/heckel/ntfy/backup/User;", "(Ljava/lang/String;ILio/heckel/ntfy/backup/Settings;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getMagic", "()Ljava/lang/String;", "getNotifications", "()Ljava/util/List;", "getSettings", "()Lio/heckel/ntfy/backup/Settings;", "getSubscriptions", "getUsers", "getVersion", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_fdroidRelease"})
public final class BackupFile {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String magic = null;
    private final int version = 0;
    @org.jetbrains.annotations.Nullable()
    private final io.heckel.ntfy.backup.Settings settings = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<io.heckel.ntfy.backup.Subscription> subscriptions = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<io.heckel.ntfy.backup.Notification> notifications = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<io.heckel.ntfy.backup.User> users = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.heckel.ntfy.backup.BackupFile copy(@org.jetbrains.annotations.NotNull()
    java.lang.String magic, int version, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.backup.Settings settings, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.backup.Subscription> subscriptions, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.backup.Notification> notifications, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.backup.User> users) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public BackupFile(@org.jetbrains.annotations.NotNull()
    java.lang.String magic, int version, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.backup.Settings settings, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.backup.Subscription> subscriptions, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.backup.Notification> notifications, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.backup.User> users) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMagic() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getVersion() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.backup.Settings component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.backup.Settings getSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.backup.Subscription> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.backup.Subscription> getSubscriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.backup.Notification> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.backup.Notification> getNotifications() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.backup.User> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.backup.User> getUsers() {
        return null;
    }
}