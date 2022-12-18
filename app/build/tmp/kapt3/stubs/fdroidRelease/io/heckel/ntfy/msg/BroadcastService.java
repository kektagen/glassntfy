package io.heckel.ntfy.msg;

import java.lang.System;

/**
 * The broadcast service is responsible for sending and receiving broadcast intents
 * in order to facilitate tasks app integrations.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/heckel/ntfy/msg/BroadcastService;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sendMessage", "", "subscription", "Lio/heckel/ntfy/db/Subscription;", "notification", "Lio/heckel/ntfy/db/Notification;", "muted", "", "sendUserAction", "action", "Lio/heckel/ntfy/db/Action;", "BroadcastReceiver", "Companion", "app_fdroidRelease"})
public final class BroadcastService {
    private final android.content.Context ctx = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.msg.BroadcastService.Companion Companion = null;
    private static final java.lang.String TAG = "NtfyBroadcastService";
    private static final int DOES_NOT_EXIST = -2586000;
    private static final java.lang.String MESSAGE_RECEIVED_ACTION = "io.heckel.ntfy.MESSAGE_RECEIVED";
    private static final java.lang.String MESSAGE_SEND_ACTION = "io.heckel.ntfy.SEND_MESSAGE";
    private static final java.lang.String USER_ACTION_ACTION = "io.heckel.ntfy.USER_ACTION";
    
    public BroadcastService(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification, boolean muted) {
    }
    
    public final void sendUserAction(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Action action) {
    }
    
    /**
     * This receiver is triggered when the SEND_MESSAGE intent is received.
     * See AndroidManifest.xml for details.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u000e"}, d2 = {"Lio/heckel/ntfy/msg/BroadcastService$BroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "getStringExtra", "", "intent", "Landroid/content/Intent;", "name", "onReceive", "", "context", "Landroid/content/Context;", "send", "ctx", "app_fdroidRelease"})
    public static final class BroadcastReceiver extends android.content.BroadcastReceiver {
        
        public BroadcastReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
        
        private final void send(android.content.Context ctx, android.content.Intent intent) {
        }
        
        /**
         * Gets an extra as a String value, even if the extra may be an int or a long.
         */
        private final java.lang.String getStringExtra(android.content.Intent intent, java.lang.String name) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lio/heckel/ntfy/msg/BroadcastService$Companion;", "", "()V", "DOES_NOT_EXIST", "", "MESSAGE_RECEIVED_ACTION", "", "MESSAGE_SEND_ACTION", "TAG", "USER_ACTION_ACTION", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}