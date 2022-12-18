package io.heckel.ntfy.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e\u00c0\u0006\u0003"}, d2 = {"Lio/heckel/ntfy/db/LogDao;", "", "deleteAll", "", "getAll", "", "Lio/heckel/ntfy/db/LogEntry;", "insert", "entry", "(Lio/heckel/ntfy/db/LogEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prune", "keepCount", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_fdroidDebug"})
public abstract interface LogDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.LogEntry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM log WHERE id NOT IN (SELECT id FROM log ORDER BY timestamp DESC, id DESC LIMIT :keepCount)")
    public abstract java.lang.Object prune(int keepCount, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM log ORDER BY timestamp ASC, id ASC")
    public abstract java.util.List<io.heckel.ntfy.db.LogEntry> getAll();
    
    @androidx.room.Query(value = "DELETE FROM log")
    public abstract void deleteAll();
}