package io.heckel.ntfy.up;

import java.lang.System;

/**
 * This is the UnifiedPush distributor, an amalgamation of messages to be sent as part of the spec.
 * See https://unifiedpush.org/spec/android/ for details.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lio/heckel/ntfy/up/Distributor;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "sendEndpoint", "", "app", "", "connectorToken", "endpoint", "sendMessage", "message", "", "sendRegistrationFailed", "sendUnregistered", "Companion", "app_fdroidDebug"})
public final class Distributor {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.up.Distributor.Companion Companion = null;
    private static final java.lang.String TAG = "NtfyUpDistributor";
    
    public Distributor(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String app, @org.jetbrains.annotations.NotNull()
    java.lang.String connectorToken, @org.jetbrains.annotations.NotNull()
    byte[] message) {
    }
    
    public final void sendEndpoint(@org.jetbrains.annotations.NotNull()
    java.lang.String app, @org.jetbrains.annotations.NotNull()
    java.lang.String connectorToken, @org.jetbrains.annotations.NotNull()
    java.lang.String endpoint) {
    }
    
    public final void sendUnregistered(@org.jetbrains.annotations.NotNull()
    java.lang.String app, @org.jetbrains.annotations.NotNull()
    java.lang.String connectorToken) {
    }
    
    public final void sendRegistrationFailed(@org.jetbrains.annotations.NotNull()
    java.lang.String app, @org.jetbrains.annotations.NotNull()
    java.lang.String connectorToken, @org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/heckel/ntfy/up/Distributor$Companion;", "", "()V", "TAG", "", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}