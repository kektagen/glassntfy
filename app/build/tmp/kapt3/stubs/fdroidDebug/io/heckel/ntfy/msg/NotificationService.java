package io.heckel.ntfy.msg;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u0000 @2\u00020\u0001:\u0004@ABCB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010!\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010J\"\u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\u0019H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020%H\u0002J\u0018\u0010)\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010*\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010+\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010,\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010-\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0017H\u0002J\u0018\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020%2\u0006\u00103\u001a\u00020%H\u0002J\u0018\u00104\u001a\u00020\f2\u0006\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0017H\u0002J\u0010\u00105\u001a\u00020\f2\u0006\u00102\u001a\u00020%H\u0002J\u0018\u00106\u001a\u00020\f2\u0006\u0010(\u001a\u00020%2\u0006\u00107\u001a\u00020\u0019H\u0002J\u0018\u00108\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u0019H\u0002J\u0018\u00109\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010:\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u0019H\u0002J \u0010;\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010<\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010=\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010>\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010?\u001a\u00020%2\u0006\u0010(\u001a\u00020%2\u0006\u00100\u001a\u00020\u0017H\u0002J\u0016\u0010#\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006D"}, d2 = {"Lio/heckel/ntfy/msg/NotificationService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "repository", "Lio/heckel/ntfy/db/Repository;", "addHttpOrBroadcastUserAction", "", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "notification", "Lio/heckel/ntfy/db/Notification;", "action", "Lio/heckel/ntfy/db/Action;", "addViewUserActionWithClear", "addViewUserActionWithoutClear", "cancel", "notificationId", "", "channelsSupported", "", "createDefaultNotificationChannels", "createSubscriptionNotificationChannels", "subscription", "Lio/heckel/ntfy/db/Subscription;", "deleteSubscriptionNotificationChannels", "detailActivityIntent", "Landroid/app/PendingIntent;", "display", "displayInternal", "update", "formatMessageMaybeWithAttachmentInfos", "", "getInsistentSound", "Landroid/net/Uri;", "groupId", "maybeAddBrowseAction", "maybeAddCancelAction", "maybeAddDownloadAction", "maybeAddOpenAction", "maybeAddUserActions", "maybeCreateNotificationChannel", "group", "priority", "maybeCreateNotificationGroup", "id", "name", "maybeDeleteNotificationChannel", "maybeDeleteNotificationGroup", "maybePlayInsistentSound", "insistent", "maybeSetDeleteIntent", "maybeSetProgress", "maybeSetSound", "setClickAction", "setStyleAndText", "subscriptionGroupId", "subscriptionGroupName", "toChannelId", "Companion", "DeleteBroadcastReceiver", "UserActionBroadcastReceiver", "ViewActionWithClearActivity", "app_fdroidDebug"})
public final class NotificationService {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    private final android.app.NotificationManager notificationManager = null;
    private final io.heckel.ntfy.db.Repository repository = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.msg.NotificationService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_VIEW = "view";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_HTTP = "http";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_BROADCAST = "broadcast";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_EXTRA_TYPE = "type";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_EXTRA_NOTIFICATION_ID = "notificationId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_EXTRA_ACTION_ID = "actionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_TYPE_DOWNLOAD_START = "io.heckel.ntfy.DOWNLOAD_ACTION_START";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_TYPE_DOWNLOAD_CANCEL = "io.heckel.ntfy.DOWNLOAD_ACTION_CANCEL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BROADCAST_TYPE_USER_ACTION = "io.heckel.ntfy.USER_ACTION_RUN";
    private static final java.lang.String TAG = "NtfyNotifService";
    private static final java.lang.String DEFAULT_GROUP = "ntfy";
    private static final java.lang.String SUBSCRIPTION_GROUP_PREFIX = "ntfy-subscription-";
    private static final java.lang.String GROUP_SUFFIX_PRIORITY_MIN = "-min";
    private static final java.lang.String GROUP_SUFFIX_PRIORITY_LOW = "-low";
    private static final java.lang.String GROUP_SUFFIX_PRIORITY_DEFAULT = "";
    private static final java.lang.String GROUP_SUFFIX_PRIORITY_HIGH = "-high";
    private static final java.lang.String GROUP_SUFFIX_PRIORITY_MAX = "-max";
    private static final java.lang.String VIEW_ACTION_EXTRA_URL = "url";
    private static final java.lang.String VIEW_ACTION_EXTRA_NOTIFICATION_ID = "notificationId";
    
    public NotificationService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void display(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
    }
    
    public final void cancel(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
    }
    
    public final void cancel(int notificationId) {
    }
    
    public final void createDefaultNotificationChannels() {
    }
    
    public final void createSubscriptionNotificationChannels(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription) {
    }
    
    public final void deleteSubscriptionNotificationChannels(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription) {
    }
    
    public final boolean channelsSupported() {
        return false;
    }
    
    private final java.lang.String subscriptionGroupId(io.heckel.ntfy.db.Subscription subscription) {
        return null;
    }
    
    private final java.lang.String subscriptionGroupName(io.heckel.ntfy.db.Subscription subscription) {
        return null;
    }
    
    private final void displayInternal(io.heckel.ntfy.db.Subscription subscription, io.heckel.ntfy.db.Notification notification, boolean update) {
    }
    
    private final void maybeSetDeleteIntent(androidx.core.app.NotificationCompat.Builder builder, boolean insistent) {
    }
    
    private final void maybeSetSound(androidx.core.app.NotificationCompat.Builder builder, boolean insistent, boolean update) {
    }
    
    private final void setStyleAndText(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Subscription subscription, io.heckel.ntfy.db.Notification notification) {
    }
    
    private final java.lang.String formatMessageMaybeWithAttachmentInfos(io.heckel.ntfy.db.Notification notification) {
        return null;
    }
    
    private final void setClickAction(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Subscription subscription, io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void maybeSetProgress(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void maybeAddOpenAction(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void maybeAddBrowseAction(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void maybeAddDownloadAction(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void maybeAddCancelAction(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void maybeAddUserActions(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Notification notification) {
    }
    
    /**
     * Open the URL and do NOT cancel the notification (clear=false). This uses a normal Intent with the given URL.
     * The other case is much more interesting.
     */
    private final void addViewUserActionWithoutClear(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Action action) {
    }
    
    /**
     * HACK: Open the URL and CANCEL the notification (clear=true). This is a SPECIAL case with a horrible workaround.
     * We call our own activity ViewActionWithClearActivity and open the URL from there.
     */
    private final void addViewUserActionWithClear(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.db.Action action) {
    }
    
    private final void addHttpOrBroadcastUserAction(androidx.core.app.NotificationCompat.Builder builder, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.db.Action action) {
    }
    
    private final android.app.PendingIntent detailActivityIntent(io.heckel.ntfy.db.Subscription subscription) {
        return null;
    }
    
    private final void maybeCreateNotificationChannel(java.lang.String group, int priority) {
    }
    
    private final void maybeDeleteNotificationChannel(java.lang.String group, int priority) {
    }
    
    private final void maybeCreateNotificationGroup(java.lang.String id, java.lang.String name) {
    }
    
    private final void maybeDeleteNotificationGroup(java.lang.String id) {
    }
    
    private final java.lang.String toChannelId(java.lang.String groupId, int priority) {
        return null;
    }
    
    private final void maybePlayInsistentSound(java.lang.String groupId, boolean insistent) {
    }
    
    private final android.net.Uri getInsistentSound(java.lang.String groupId) {
        return null;
    }
    
    /**
     * Receives the broadcast from
     * - the "http" and "broadcast" action button (the "view" action is handled differently)
     * - the "download"/"cancel" action button
     *
     * Then queues a Worker via WorkManager to execute the action in the background
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lio/heckel/ntfy/msg/NotificationService$UserActionBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_fdroidDebug"})
    public static final class UserActionBroadcastReceiver extends android.content.BroadcastReceiver {
        
        public UserActionBroadcastReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    /**
     * Receives a broadcast when a notification is swiped away. This is currently
     * only called for notifications with an insistent sound.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lio/heckel/ntfy/msg/NotificationService$DeleteBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_fdroidDebug"})
    public static final class DeleteBroadcastReceiver extends android.content.BroadcastReceiver {
        
        public DeleteBroadcastReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    /**
     * Activity used to launch a URL.
     * .
     * Horrible hack: Action "view" with "clear=true" is a special case, because it's apparently impossible to start a
     * URL activity from PendingIntent.getActivity() and also close the notification. To clear it, we
     * launch this activity which then calls the actual activity.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014\u00a8\u0006\u0007"}, d2 = {"Lio/heckel/ntfy/msg/NotificationService$ViewActionWithClearActivity;", "Landroid/app/Activity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_fdroidDebug"})
    public static final class ViewActionWithClearActivity extends android.app.Activity {
        
        public ViewActionWithClearActivity() {
            super();
        }
        
        @java.lang.Override()
        protected void onCreate(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lio/heckel/ntfy/msg/NotificationService$Companion;", "", "()V", "ACTION_BROADCAST", "", "ACTION_HTTP", "ACTION_VIEW", "BROADCAST_EXTRA_ACTION_ID", "BROADCAST_EXTRA_NOTIFICATION_ID", "BROADCAST_EXTRA_TYPE", "BROADCAST_TYPE_DOWNLOAD_CANCEL", "BROADCAST_TYPE_DOWNLOAD_START", "BROADCAST_TYPE_USER_ACTION", "DEFAULT_GROUP", "GROUP_SUFFIX_PRIORITY_DEFAULT", "GROUP_SUFFIX_PRIORITY_HIGH", "GROUP_SUFFIX_PRIORITY_LOW", "GROUP_SUFFIX_PRIORITY_MAX", "GROUP_SUFFIX_PRIORITY_MIN", "SUBSCRIPTION_GROUP_PREFIX", "TAG", "VIEW_ACTION_EXTRA_NOTIFICATION_ID", "VIEW_ACTION_EXTRA_URL", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}