package io.heckel.ntfy.msg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ$\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/heckel/ntfy/msg/NotificationParser;", "", "()V", "gson", "Lcom/google/gson/Gson;", "parse", "Lio/heckel/ntfy/db/Notification;", "s", "", "subscriptionId", "", "notificationId", "", "parseActions", "", "Lio/heckel/ntfy/db/Action;", "parseWithTopic", "Lio/heckel/ntfy/msg/NotificationParser$NotificationWithTopic;", "NotificationWithTopic", "app_fdroidRelease"})
public final class NotificationParser {
    private final com.google.gson.Gson gson = null;
    
    public NotificationParser() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.db.Notification parse(@org.jetbrains.annotations.NotNull()
    java.lang.String s, long subscriptionId, int notificationId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.msg.NotificationParser.NotificationWithTopic parseWithTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String s, long subscriptionId, int notificationId) {
        return null;
    }
    
    /**
     * Parse JSON array to Action list. The indirection via MessageAction is probably
     * not necessary, but for "good form".
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<io.heckel.ntfy.db.Action> parseActions(@org.jetbrains.annotations.Nullable()
    java.lang.String s) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/heckel/ntfy/msg/NotificationParser$NotificationWithTopic;", "", "topic", "", "notification", "Lio/heckel/ntfy/db/Notification;", "(Ljava/lang/String;Lio/heckel/ntfy/db/Notification;)V", "getNotification", "()Lio/heckel/ntfy/db/Notification;", "getTopic", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_fdroidRelease"})
    public static final class NotificationWithTopic {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String topic = null;
        @org.jetbrains.annotations.NotNull()
        private final io.heckel.ntfy.db.Notification notification = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.msg.NotificationParser.NotificationWithTopic copy(@org.jetbrains.annotations.NotNull()
        java.lang.String topic, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Notification notification) {
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
        
        public NotificationWithTopic(@org.jetbrains.annotations.NotNull()
        java.lang.String topic, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Notification notification) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTopic() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.db.Notification component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.db.Notification getNotification() {
            return null;
        }
    }
}