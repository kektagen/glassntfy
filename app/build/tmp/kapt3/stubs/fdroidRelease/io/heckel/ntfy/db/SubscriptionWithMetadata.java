package io.heckel.ntfy.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0017J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\bH\u00c6\u0003J\t\u00103\u001a\u00020\fH\u00c6\u0003J\t\u00104\u001a\u00020\fH\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\bH\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\t\u0010<\u001a\u00020\fH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00bd\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010?\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010A\u001a\u00020\fH\u00d6\u0001J\t\u0010B\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001b\u00a8\u0006C"}, d2 = {"Lio/heckel/ntfy/db/SubscriptionWithMetadata;", "", "id", "", "baseUrl", "", "topic", "instant", "", "mutedUntil", "autoDelete", "minPriority", "", "insistent", "lastNotificationId", "icon", "upAppId", "upConnectorToken", "displayName", "dedicatedChannels", "totalCount", "newCount", "lastActive", "(JLjava/lang/String;Ljava/lang/String;ZJJIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIJ)V", "getAutoDelete", "()J", "getBaseUrl", "()Ljava/lang/String;", "getDedicatedChannels", "()Z", "getDisplayName", "getIcon", "getId", "getInsistent", "()I", "getInstant", "getLastActive", "getLastNotificationId", "getMinPriority", "getMutedUntil", "getNewCount", "getTopic", "getTotalCount", "getUpAppId", "getUpConnectorToken", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_fdroidRelease"})
public final class SubscriptionWithMetadata {
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String baseUrl = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String topic = null;
    private final boolean instant = false;
    private final long mutedUntil = 0L;
    private final long autoDelete = 0L;
    private final int minPriority = 0;
    private final int insistent = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String lastNotificationId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String upAppId = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String upConnectorToken = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String displayName = null;
    private final boolean dedicatedChannels = false;
    private final int totalCount = 0;
    private final int newCount = 0;
    private final long lastActive = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final io.heckel.ntfy.db.SubscriptionWithMetadata copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, boolean instant, long mutedUntil, long autoDelete, int minPriority, int insistent, @org.jetbrains.annotations.Nullable()
    java.lang.String lastNotificationId, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.Nullable()
    java.lang.String upAppId, @org.jetbrains.annotations.Nullable()
    java.lang.String upConnectorToken, @org.jetbrains.annotations.Nullable()
    java.lang.String displayName, boolean dedicatedChannels, int totalCount, int newCount, long lastActive) {
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
    
    public SubscriptionWithMetadata(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, boolean instant, long mutedUntil, long autoDelete, int minPriority, int insistent, @org.jetbrains.annotations.Nullable()
    java.lang.String lastNotificationId, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.Nullable()
    java.lang.String upAppId, @org.jetbrains.annotations.Nullable()
    java.lang.String upConnectorToken, @org.jetbrains.annotations.Nullable()
    java.lang.String displayName, boolean dedicatedChannels, int totalCount, int newCount, long lastActive) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTopic() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getInstant() {
        return false;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getMutedUntil() {
        return 0L;
    }
    
    public final long component6() {
        return 0L;
    }
    
    public final long getAutoDelete() {
        return 0L;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getMinPriority() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getInsistent() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastNotificationId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpAppId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpConnectorToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getDedicatedChannels() {
        return false;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getTotalCount() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getNewCount() {
        return 0;
    }
    
    public final long component17() {
        return 0L;
    }
    
    public final long getLastActive() {
        return 0L;
    }
}