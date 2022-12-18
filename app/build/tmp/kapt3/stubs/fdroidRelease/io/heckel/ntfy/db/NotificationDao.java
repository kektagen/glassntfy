package io.heckel.ntfy.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000bH\'J\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\'J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\'J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u00142\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\'J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\'J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\'J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\'J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e\u00c0\u0006\u0003"}, d2 = {"Lio/heckel/ntfy/db/NotificationDao;", "", "add", "", "notification", "Lio/heckel/ntfy/db/Notification;", "clearAllNotificationIds", "subscriptionId", "", "clearIconUri", "uri", "", "get", "notificationId", "list", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listActiveIconUris", "listDeletedWithAttachments", "listFlow", "Lkotlinx/coroutines/flow/Flow;", "listIds", "markAllAsDeleted", "markAsDeleted", "markAsDeletedIfOlderThan", "olderThanTimestamp", "removeAll", "removeIfOlderThan", "undelete", "update", "app_fdroidRelease"})
public abstract interface NotificationDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM notification")
    public abstract java.lang.Object list(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<io.heckel.ntfy.db.Notification>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM notification WHERE subscriptionId = :subscriptionId AND deleted != 1 ORDER BY timestamp DESC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<io.heckel.ntfy.db.Notification>> listFlow(long subscriptionId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT id FROM notification WHERE subscriptionId = :subscriptionId")
    public abstract java.util.List<java.lang.String> listIds(long subscriptionId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM notification WHERE deleted = 1 AND attachment_contentUri <> \'\'")
    public abstract java.util.List<io.heckel.ntfy.db.Notification> listDeletedWithAttachments();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT DISTINCT icon_contentUri FROM notification WHERE deleted != 1 AND icon_contentUri <> \'\'")
    public abstract java.util.List<java.lang.String> listActiveIconUris();
    
    @androidx.room.Query(value = "UPDATE notification SET icon_contentUri = null WHERE icon_contentUri = :uri")
    public abstract void clearIconUri(@org.jetbrains.annotations.NotNull()
    java.lang.String uri);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void add(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification);
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM notification WHERE id = :notificationId")
    public abstract io.heckel.ntfy.db.Notification get(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationId);
    
    @androidx.room.Query(value = "UPDATE notification SET notificationId = 0 WHERE subscriptionId = :subscriptionId")
    public abstract void clearAllNotificationIds(long subscriptionId);
    
    @androidx.room.Query(value = "UPDATE notification SET deleted = 1 WHERE id = :notificationId")
    public abstract void markAsDeleted(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationId);
    
    @androidx.room.Query(value = "UPDATE notification SET deleted = 1 WHERE subscriptionId = :subscriptionId")
    public abstract void markAllAsDeleted(long subscriptionId);
    
    @androidx.room.Query(value = "UPDATE notification SET deleted = 1 WHERE subscriptionId = :subscriptionId AND timestamp < :olderThanTimestamp")
    public abstract void markAsDeletedIfOlderThan(long subscriptionId, long olderThanTimestamp);
    
    @androidx.room.Query(value = "UPDATE notification SET deleted = 0 WHERE id = :notificationId")
    public abstract void undelete(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationId);
    
    @androidx.room.Query(value = "DELETE FROM notification WHERE subscriptionId = :subscriptionId AND timestamp < :olderThanTimestamp")
    public abstract void removeIfOlderThan(long subscriptionId, long olderThanTimestamp);
    
    @androidx.room.Query(value = "DELETE FROM notification WHERE subscriptionId = :subscriptionId")
    public abstract void removeAll(long subscriptionId);
}