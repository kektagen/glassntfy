package io.heckel.ntfy.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007\u00c0\u0006\u0003"}, d2 = {"Lio/heckel/ntfy/service/Connection;", "", "close", "", "since", "", "start", "app_fdroidRelease"})
public abstract interface Connection {
    
    public abstract void start();
    
    public abstract void close();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.String since();
}