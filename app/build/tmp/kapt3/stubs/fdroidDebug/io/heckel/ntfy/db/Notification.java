package io.heckel.ntfy.db;

import java.lang.System;

@androidx.room.Entity(primaryKeys = {"id", "subscriptionId"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u0011\u00101\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\t\u00103\u001a\u00020\u0017H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u000bH\u00c6\u0003J\t\u0010:\u001a\u00020\u000bH\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u00a1\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u00c6\u0001J\u0013\u0010=\u001a\u00020\u00172\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020\u000bH\u00d6\u0001J\t\u0010@\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010*R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001e\u00a8\u0006A"}, d2 = {"Lio/heckel/ntfy/db/Notification;", "", "id", "", "subscriptionId", "", "timestamp", "title", "message", "encoding", "notificationId", "", "priority", "tags", "click", "icon", "Lio/heckel/ntfy/db/Icon;", "actions", "", "Lio/heckel/ntfy/db/Action;", "attachment", "Lio/heckel/ntfy/db/Attachment;", "deleted", "", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lio/heckel/ntfy/db/Icon;Ljava/util/List;Lio/heckel/ntfy/db/Attachment;Z)V", "getActions", "()Ljava/util/List;", "getAttachment", "()Lio/heckel/ntfy/db/Attachment;", "getClick", "()Ljava/lang/String;", "getDeleted", "()Z", "getEncoding", "getIcon", "()Lio/heckel/ntfy/db/Icon;", "getId", "getMessage", "getNotificationId", "()I", "getPriority", "getSubscriptionId", "()J", "getTags", "getTimestamp", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_fdroidDebug"})
public final class Notification {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "id")
    private final java.lang.String id = null;
    @androidx.room.ColumnInfo(name = "subscriptionId")
    private final long subscriptionId = 0L;
    @androidx.room.ColumnInfo(name = "timestamp")
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "message")
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "encoding")
    private final java.lang.String encoding = null;
    @androidx.room.ColumnInfo(name = "notificationId")
    private final int notificationId = 0;
    @androidx.room.ColumnInfo(name = "priority", defaultValue = "3")
    private final int priority = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "tags")
    private final java.lang.String tags = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "click")
    private final java.lang.String click = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded(prefix = "icon_")
    private final io.heckel.ntfy.db.Icon icon = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "actions")
    private final java.util.List<io.heckel.ntfy.db.Action> actions = null;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Embedded(prefix = "attachment_")
    private final io.heckel.ntfy.db.Attachment attachment = null;
    @androidx.room.ColumnInfo(name = "deleted")
    private final boolean deleted = false;
    
    @org.jetbrains.annotations.NotNull()
    public final io.heckel.ntfy.db.Notification copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, long subscriptionId, long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String encoding, int notificationId, int priority, @org.jetbrains.annotations.NotNull()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    java.lang.String click, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.Icon icon, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.db.Action> actions, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.Attachment attachment, boolean deleted) {
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
    
    public Notification(@org.jetbrains.annotations.NotNull()
    java.lang.String id, long subscriptionId, long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String encoding, int notificationId, int priority, @org.jetbrains.annotations.NotNull()
    java.lang.String tags, @org.jetbrains.annotations.NotNull()
    java.lang.String click, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.Icon icon, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.db.Action> actions, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.Attachment attachment, boolean deleted) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getSubscriptionId() {
        return 0L;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEncoding() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getNotificationId() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getPriority() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClick() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.db.Icon component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.db.Icon getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.db.Action> component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.db.Action> getActions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.db.Attachment component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.db.Attachment getAttachment() {
        return null;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getDeleted() {
        return false;
    }
}