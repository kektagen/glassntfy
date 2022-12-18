package io.heckel.ntfy.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/heckel/ntfy/util/ContentUriRequestBody;", "Lokhttp3/RequestBody;", "resolver", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "size", "", "(Landroid/content/ContentResolver;Landroid/net/Uri;J)V", "contentLength", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "app_fdroidDebug"})
public final class ContentUriRequestBody extends okhttp3.RequestBody {
    private final android.content.ContentResolver resolver = null;
    private final android.net.Uri uri = null;
    private final long size = 0L;
    
    public ContentUriRequestBody(@org.jetbrains.annotations.NotNull()
    android.content.ContentResolver resolver, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, long size) {
        super();
    }
    
    @java.lang.Override()
    public long contentLength() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override()
    public void writeTo(@org.jetbrains.annotations.NotNull()
    okio.BufferedSink sink) {
    }
}