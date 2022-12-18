package io.heckel.ntfy.msg;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bH\u00c6\u0003J\u00ac\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\tH\u00d6\u0001J\t\u0010<\u001a\u00020\u0003H\u00d6\u0001R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001b\u00a8\u0006="}, d2 = {"Lio/heckel/ntfy/msg/Message;", "", "id", "", "time", "", "event", "topic", "priority", "", "tags", "", "click", "icon", "actions", "Lio/heckel/ntfy/msg/MessageAction;", "title", "message", "encoding", "attachment", "Lio/heckel/ntfy/msg/MessageAttachment;", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/heckel/ntfy/msg/MessageAttachment;)V", "getActions", "()Ljava/util/List;", "getAttachment", "()Lio/heckel/ntfy/msg/MessageAttachment;", "getClick", "()Ljava/lang/String;", "getEncoding", "getEvent", "getIcon", "getId", "getMessage", "getPriority", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTags", "getTime", "()J", "getTitle", "getTopic", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/heckel/ntfy/msg/MessageAttachment;)Lio/heckel/ntfy/msg/Message;", "equals", "", "other", "hashCode", "toString", "app_fdroidRelease"})
public final class Message {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    private final long time = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String event = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String topic = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer priority = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> tags = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String click = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String icon = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<io.heckel.ntfy.msg.MessageAction> actions = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String encoding = null;
    @org.jetbrains.annotations.Nullable()
    private final io.heckel.ntfy.msg.MessageAttachment attachment = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.heckel.ntfy.msg.Message copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, long time, @org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    java.lang.Integer priority, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    java.lang.String click, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.msg.MessageAction> actions, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String encoding, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.msg.MessageAttachment attachment) {
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
    
    public Message(@org.jetbrains.annotations.NotNull()
    java.lang.String id, long time, @org.jetbrains.annotations.NotNull()
    java.lang.String event, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.Nullable()
    java.lang.Integer priority, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> tags, @org.jetbrains.annotations.Nullable()
    java.lang.String click, @org.jetbrains.annotations.Nullable()
    java.lang.String icon, @org.jetbrains.annotations.Nullable()
    java.util.List<io.heckel.ntfy.msg.MessageAction> actions, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String encoding, @org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.msg.MessageAttachment attachment) {
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
    
    public final long getTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTopic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPriority() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getClick() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.msg.MessageAction> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.msg.MessageAction> getActions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEncoding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.msg.MessageAttachment component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.msg.MessageAttachment getAttachment() {
        return null;
    }
}