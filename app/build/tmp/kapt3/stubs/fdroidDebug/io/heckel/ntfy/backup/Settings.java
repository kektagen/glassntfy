package io.heckel.ntfy.backup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\u000b\u0010)\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0013J\u008c\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0003H\u00d6\u0001J\t\u00103\u001a\u00020\tH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\"\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0017\u00a8\u00064"}, d2 = {"Lio/heckel/ntfy/backup/Settings;", "", "minPriority", "", "autoDownloadMaxSize", "", "autoDeleteSeconds", "darkMode", "connectionProtocol", "", "broadcastEnabled", "", "recordLogs", "defaultBaseUrl", "mutedUntil", "lastSharedTopics", "", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "getAutoDeleteSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAutoDownloadMaxSize", "getBroadcastEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getConnectionProtocol", "()Ljava/lang/String;", "getDarkMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDefaultBaseUrl", "getLastSharedTopics", "()Ljava/util/List;", "getMinPriority", "getMutedUntil", "getRecordLogs", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lio/heckel/ntfy/backup/Settings;", "equals", "other", "hashCode", "toString", "app_fdroidDebug"})
public final class Settings {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer minPriority = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long autoDownloadMaxSize = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long autoDeleteSeconds = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer darkMode = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String connectionProtocol = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean broadcastEnabled = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean recordLogs = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String defaultBaseUrl = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long mutedUntil = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<java.lang.String> lastSharedTopics = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.heckel.ntfy.backup.Settings copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer minPriority, @org.jetbrains.annotations.Nullable()
    java.lang.Long autoDownloadMaxSize, @org.jetbrains.annotations.Nullable()
    java.lang.Long autoDeleteSeconds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer darkMode, @org.jetbrains.annotations.Nullable()
    java.lang.String connectionProtocol, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean broadcastEnabled, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean recordLogs, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultBaseUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Long mutedUntil, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> lastSharedTopics) {
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
    
    public Settings(@org.jetbrains.annotations.Nullable()
    java.lang.Integer minPriority, @org.jetbrains.annotations.Nullable()
    java.lang.Long autoDownloadMaxSize, @org.jetbrains.annotations.Nullable()
    java.lang.Long autoDeleteSeconds, @org.jetbrains.annotations.Nullable()
    java.lang.Integer darkMode, @org.jetbrains.annotations.Nullable()
    java.lang.String connectionProtocol, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean broadcastEnabled, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean recordLogs, @org.jetbrains.annotations.Nullable()
    java.lang.String defaultBaseUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Long mutedUntil, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> lastSharedTopics) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getMinPriority() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAutoDownloadMaxSize() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getAutoDeleteSeconds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getDarkMode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getConnectionProtocol() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getBroadcastEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getRecordLogs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDefaultBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getMutedUntil() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<java.lang.String> getLastSharedTopics() {
        return null;
    }
}