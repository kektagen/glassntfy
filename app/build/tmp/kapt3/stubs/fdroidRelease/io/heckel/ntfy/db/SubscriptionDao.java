package io.heckel.ntfy.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\'J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\'J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000bH\'J\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u0013H\'J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018\u00c0\u0006\u0003"}, d2 = {"Lio/heckel/ntfy/db/SubscriptionDao;", "", "add", "", "subscription", "Lio/heckel/ntfy/db/Subscription;", "get", "Lio/heckel/ntfy/db/SubscriptionWithMetadata;", "subscriptionId", "", "baseUrl", "", "topic", "getByConnectorToken", "connectorToken", "list", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listFlow", "Lkotlinx/coroutines/flow/Flow;", "remove", "update", "updateLastNotificationId", "lastNotificationId", "app_fdroidRelease"})
public abstract interface SubscriptionDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "\n        SELECT \n          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n          COUNT(n.id) totalCount, \n          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n          IFNULL(MAX(n.timestamp),0) AS lastActive\n        FROM Subscription AS s\n        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n        GROUP BY s.id\n        ORDER BY s.upAppId ASC, MAX(n.timestamp) DESC\n    ")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<io.heckel.ntfy.db.SubscriptionWithMetadata>> listFlow();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT \n          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n          COUNT(n.id) totalCount, \n          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n          IFNULL(MAX(n.timestamp),0) AS lastActive\n        FROM Subscription AS s\n        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n        GROUP BY s.id\n        ORDER BY s.upAppId ASC, MAX(n.timestamp) DESC\n    ")
    public abstract java.lang.Object list(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<io.heckel.ntfy.db.SubscriptionWithMetadata>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT \n          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n          COUNT(n.id) totalCount, \n          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n          IFNULL(MAX(n.timestamp),0) AS lastActive\n        FROM Subscription AS s\n        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n        WHERE s.baseUrl = :baseUrl AND s.topic = :topic\n        GROUP BY s.id\n    ")
    public abstract io.heckel.ntfy.db.SubscriptionWithMetadata get(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT \n          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n          COUNT(n.id) totalCount, \n          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n          IFNULL(MAX(n.timestamp),0) AS lastActive\n        FROM Subscription AS s\n        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n        WHERE s.id = :subscriptionId\n        GROUP BY s.id\n    ")
    public abstract io.heckel.ntfy.db.SubscriptionWithMetadata get(long subscriptionId);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "\n        SELECT \n          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n          COUNT(n.id) totalCount, \n          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n          IFNULL(MAX(n.timestamp),0) AS lastActive\n        FROM Subscription AS s\n        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n        WHERE s.upConnectorToken = :connectorToken\n        GROUP BY s.id\n    ")
    public abstract io.heckel.ntfy.db.SubscriptionWithMetadata getByConnectorToken(@org.jetbrains.annotations.NotNull()
    java.lang.String connectorToken);
    
    @androidx.room.Insert()
    public abstract void add(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription);
    
    @androidx.room.Query(value = "UPDATE subscription SET lastNotificationId = :lastNotificationId WHERE id = :subscriptionId")
    public abstract void updateLastNotificationId(long subscriptionId, @org.jetbrains.annotations.NotNull()
    java.lang.String lastNotificationId);
    
    @androidx.room.Query(value = "DELETE FROM subscription WHERE id = :subscriptionId")
    public abstract void remove(long subscriptionId);
}