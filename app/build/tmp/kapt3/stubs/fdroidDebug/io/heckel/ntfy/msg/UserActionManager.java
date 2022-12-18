package io.heckel.ntfy.msg;

import java.lang.System;

/**
 * Trigger user actions clicked from notification popups.
 *
 * The indirection via WorkManager is required since this code may be executed
 * in a doze state and Internet may not be available. It's also best practice, apparently.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/heckel/ntfy/msg/UserActionManager;", "", "()V", "TAG", "", "WORK_NAME_PREFIX", "enqueue", "", "context", "Landroid/content/Context;", "notificationId", "actionId", "app_fdroidDebug"})
public final class UserActionManager {
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.msg.UserActionManager INSTANCE = null;
    private static final java.lang.String TAG = "NtfyUserActionEx";
    private static final java.lang.String WORK_NAME_PREFIX = "io.heckel.ntfy.USER_ACTION_";
    
    private UserActionManager() {
        super();
    }
    
    public final void enqueue(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String notificationId, @org.jetbrains.annotations.NotNull()
    java.lang.String actionId) {
    }
}