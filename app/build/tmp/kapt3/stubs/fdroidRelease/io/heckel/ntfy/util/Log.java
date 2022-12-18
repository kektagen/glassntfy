package io.heckel.ntfy.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\n\u0018\u0000 ,2\u00020\u0001:\u0003,-.B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0016\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ*\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J \u0010&\u001a\u00020\f2\u0006\u0010\'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u001eH\u0002J\u0014\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\fH\u0002J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000RN\u0010\n\u001aB\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n \r*\u0004\u0018\u00010\u000e0\u000e \r* \u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f\u0012\f\u0012\n \r*\u0004\u0018\u00010\u000e0\u000e\u0018\u00010\u000f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lio/heckel/ntfy/util/Log;", "", "logsDao", "Lio/heckel/ntfy/db/LogDao;", "(Lio/heckel/ntfy/db/LogDao;)V", "count", "Ljava/util/concurrent/atomic/AtomicInteger;", "record", "Ljava/util/concurrent/atomic/AtomicBoolean;", "scrubNum", "scrubTerms", "", "", "kotlin.jvm.PlatformType", "Lio/heckel/ntfy/util/Log$ReplaceTerm;", "", "addScrubTerm", "", "term", "type", "Lio/heckel/ntfy/util/Log$TermType;", "deleteAll", "formatEntries", "entries", "", "Lio/heckel/ntfy/db/LogEntry;", "getFormatted", "context", "Landroid/content/Context;", "scrub", "", "log", "level", "", "tag", "message", "exception", "", "prependDeviceInfo", "logs", "settings", "scrubLine", "line", "scrubEntries", "Companion", "ReplaceTerm", "TermType", "app_fdroidRelease"})
public final class Log {
    private final io.heckel.ntfy.db.LogDao logsDao = null;
    private final java.util.concurrent.atomic.AtomicBoolean record = null;
    private final java.util.concurrent.atomic.AtomicInteger count = null;
    private final java.util.concurrent.atomic.AtomicInteger scrubNum = null;
    private final java.util.Map<java.lang.String, io.heckel.ntfy.util.Log.ReplaceTerm> scrubTerms = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.util.Log.Companion Companion = null;
    private static final java.lang.String TAG = "NtfyLog";
    private static final int PRUNE_EVERY = 100;
    private static final int ENTRIES_MAX = 1000;
    private static final java.util.List<java.lang.String> IGNORE_TERMS = null;
    private static final java.util.List<java.lang.String> REPLACE_TERMS = null;
    private static io.heckel.ntfy.util.Log instance;
    
    public Log(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.LogDao logsDao) {
        super();
    }
    
    private final void log(int level, java.lang.String tag, java.lang.String message, java.lang.Throwable exception) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormatted(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean scrub) {
        return null;
    }
    
    private final java.lang.String prependDeviceInfo(java.lang.String logs, java.lang.String settings, boolean scrubLine) {
        return null;
    }
    
    public final void addScrubTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.util.Log.TermType type) {
    }
    
    private final java.util.List<io.heckel.ntfy.db.LogEntry> scrubEntries(java.util.List<io.heckel.ntfy.db.LogEntry> entries) {
        return null;
    }
    
    private final java.lang.String scrub(java.lang.String line) {
        return null;
    }
    
    private final java.lang.String formatEntries(java.util.List<io.heckel.ntfy.db.LogEntry> entries) {
        return null;
    }
    
    private final void deleteAll() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/heckel/ntfy/util/Log$TermType;", "", "(Ljava/lang/String;I)V", "Domain", "Username", "Password", "Term", "app_fdroidRelease"})
    public static enum TermType {
        /*public static final*/ Domain /* = new Domain() */,
        /*public static final*/ Username /* = new Username() */,
        /*public static final*/ Password /* = new Password() */,
        /*public static final*/ Term /* = new Term() */;
        
        TermType() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lio/heckel/ntfy/util/Log$ReplaceTerm;", "", "termType", "Lio/heckel/ntfy/util/Log$TermType;", "replaceTerm", "", "(Lio/heckel/ntfy/util/Log$TermType;Ljava/lang/String;)V", "getReplaceTerm", "()Ljava/lang/String;", "getTermType", "()Lio/heckel/ntfy/util/Log$TermType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_fdroidRelease"})
    public static final class ReplaceTerm {
        @org.jetbrains.annotations.NotNull()
        private final io.heckel.ntfy.util.Log.TermType termType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String replaceTerm = null;
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.util.Log.ReplaceTerm copy(@org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.util.Log.TermType termType, @org.jetbrains.annotations.NotNull()
        java.lang.String replaceTerm) {
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
        
        public ReplaceTerm(@org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.util.Log.TermType termType, @org.jetbrains.annotations.NotNull()
        java.lang.String replaceTerm) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.util.Log.TermType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.util.Log.TermType getTermType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReplaceTerm() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\"\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0017\u001a\u00020\u000eJ\"\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0016\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\n\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010\u001f\u001a\u00020\u001dJ\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070!J\"\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u000e\u0010#\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u001dJ\"\u0010&\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lio/heckel/ntfy/util/Log$Companion;", "", "()V", "ENTRIES_MAX", "", "IGNORE_TERMS", "", "", "PRUNE_EVERY", "REPLACE_TERMS", "TAG", "instance", "Lio/heckel/ntfy/util/Log;", "addScrubTerm", "", "term", "type", "Lio/heckel/ntfy/util/Log$TermType;", "d", "tag", "message", "exception", "", "deleteAll", "e", "getFormatted", "context", "Landroid/content/Context;", "scrub", "", "getInstance", "getRecord", "getScrubTerms", "", "i", "init", "setRecord", "enable", "w", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void d(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable exception) {
        }
        
        public final void i(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable exception) {
        }
        
        public final void w(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable exception) {
        }
        
        public final void e(@org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable exception) {
        }
        
        public final void setRecord(boolean enable) {
        }
        
        public final boolean getRecord() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFormatted(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean scrub) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> getScrubTerms() {
            return null;
        }
        
        public final void deleteAll() {
        }
        
        public final void addScrubTerm(@org.jetbrains.annotations.NotNull()
        java.lang.String term, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.util.Log.TermType type) {
        }
        
        public final void init(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private final io.heckel.ntfy.util.Log getInstance() {
            return null;
        }
    }
}