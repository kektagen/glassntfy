package io.heckel.ntfy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 X2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001XB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020(2\b\b\u0002\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020(H\u0002J\b\u0010/\u001a\u00020(H\u0002J\u0010\u00100\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u00101\u001a\u00020(H\u0002J\u001c\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u00072\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0012\u00107\u001a\u00020(2\b\u00108\u001a\u0004\u0018\u000109H\u0014J\u001c\u0010:\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010;\u001a\u0002032\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010<\u001a\u00020(2\b\u00104\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010=\u001a\u00020(H\u0002J\u0010\u0010>\u001a\u00020(2\u0006\u0010?\u001a\u00020-H\u0016J\u0010\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u000203H\u0002J\u0010\u0010B\u001a\u0002032\u0006\u00105\u001a\u000206H\u0016J\u001c\u0010C\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010D\u001a\u00020(H\u0014J \u0010E\u001a\u00020(2\u0006\u0010F\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u000203H\u0016J\b\u0010I\u001a\u00020(H\u0002J\u0010\u0010J\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010K\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010L\u001a\u00020(H\u0002J\b\u0010M\u001a\u00020(H\u0002J\b\u0010N\u001a\u00020(H\u0002J\b\u0010O\u001a\u00020(H\u0002J\b\u0010P\u001a\u00020(H\u0002J\u0016\u0010Q\u001a\u00020(2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020*0SH\u0002J\b\u0010T\u001a\u00020(H\u0002J\u0016\u0010U\u001a\u00020(2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020*0SH\u0002J\u0010\u0010V\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010W\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\"\u0010#R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lio/heckel/ntfy/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/ActionMode$Callback;", "Lio/heckel/ntfy/ui/AddFragment$SubscribeListener;", "Lio/heckel/ntfy/ui/NotificationFragment$NotificationSettingsListener;", "()V", "actionMode", "Landroid/view/ActionMode;", "adapter", "Lio/heckel/ntfy/ui/MainAdapter;", "api", "Lio/heckel/ntfy/msg/ApiService;", "appBaseUrl", "", "dispatcher", "Lio/heckel/ntfy/msg/NotificationDispatcher;", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "mainList", "Landroidx/recyclerview/widget/RecyclerView;", "mainListContainer", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "menu", "Landroid/view/Menu;", "messenger", "Lio/heckel/ntfy/firebase/FirebaseMessenger;", "repository", "Lio/heckel/ntfy/db/Repository;", "getRepository", "()Lio/heckel/ntfy/db/Repository;", "repository$delegate", "Lkotlin/Lazy;", "viewModel", "Lio/heckel/ntfy/ui/SubscriptionsViewModel;", "getViewModel", "()Lio/heckel/ntfy/ui/SubscriptionsViewModel;", "viewModel$delegate", "workManager", "Landroidx/work/WorkManager;", "beginActionMode", "", "subscription", "Lio/heckel/ntfy/db/Subscription;", "checkSubscriptionsMuted", "delayMillis", "", "endActionModeAndRedraw", "finishActionMode", "handleActionModeClick", "maybeRequestNotificationPermission", "onActionItemClicked", "", "mode", "item", "Landroid/view/MenuItem;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "onCreateOptionsMenu", "onDestroyActionMode", "onMultiDeleteClick", "onNotificationMutedUntilChanged", "mutedUntilTimestamp", "onNotificationSettingsClick", "enable", "onOptionsItemSelected", "onPrepareActionMode", "onResume", "onSubscribe", "topic", "baseUrl", "instant", "onSubscribeButtonClick", "onSubscriptionItemClick", "onSubscriptionItemLongClick", "redrawList", "refreshAllSubscriptions", "schedulePeriodicDeleteWorker", "schedulePeriodicPollWorker", "schedulePeriodicServiceRestartWorker", "showHideBatteryBanner", "subscriptions", "", "showHideNotificationMenuItems", "showHideWebSocketBanner", "startDetailSettingsView", "startDetailView", "Companion", "app_fdroidDebug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.ActionMode.Callback, io.heckel.ntfy.ui.AddFragment.SubscribeListener, io.heckel.ntfy.ui.NotificationFragment.NotificationSettingsListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy repository$delegate = null;
    private final io.heckel.ntfy.msg.ApiService api = null;
    private final io.heckel.ntfy.firebase.FirebaseMessenger messenger = null;
    private android.view.Menu menu;
    private androidx.recyclerview.widget.RecyclerView mainList;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout mainListContainer;
    private io.heckel.ntfy.ui.MainAdapter adapter;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    private android.view.ActionMode actionMode;
    private androidx.work.WorkManager workManager;
    private io.heckel.ntfy.msg.NotificationDispatcher dispatcher;
    private java.lang.String appBaseUrl;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.ui.MainActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfyMainActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_ID = "subscriptionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_BASE_URL = "subscriptionBaseUrl";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_TOPIC = "subscriptionTopic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_DISPLAY_NAME = "subscriptionDisplayName";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_INSTANT = "subscriptionInstant";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_MUTED_UNTIL = "subscriptionMutedUntil";
    public static final long ANIMATION_DURATION = 80L;
    public static final long ONE_DAY_MILLIS = 86400000L;
    public static final long POLL_WORKER_INTERVAL_MINUTES = 60L;
    public static final long DELETE_WORKER_INTERVAL_MINUTES = 480L;
    public static final long SERVICE_START_WORKER_INTERVAL_MINUTES = 180L;
    
    public MainActivity() {
        super();
    }
    
    private final io.heckel.ntfy.ui.SubscriptionsViewModel getViewModel() {
        return null;
    }
    
    private final io.heckel.ntfy.db.Repository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void maybeRequestNotificationPermission() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void showHideBatteryBanner(java.util.List<io.heckel.ntfy.db.Subscription> subscriptions) {
    }
    
    private final void showHideWebSocketBanner(java.util.List<io.heckel.ntfy.db.Subscription> subscriptions) {
    }
    
    private final void schedulePeriodicPollWorker() {
    }
    
    private final void schedulePeriodicDeleteWorker() {
    }
    
    private final void schedulePeriodicServiceRestartWorker() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void checkSubscriptionsMuted(long delayMillis) {
    }
    
    private final void showHideNotificationMenuItems() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void onNotificationSettingsClick(boolean enable) {
    }
    
    @java.lang.Override()
    public void onNotificationMutedUntilChanged(long mutedUntilTimestamp) {
    }
    
    private final void onSubscribeButtonClick() {
    }
    
    @java.lang.Override()
    public void onSubscribe(@org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, boolean instant) {
    }
    
    private final void onSubscriptionItemClick(io.heckel.ntfy.db.Subscription subscription) {
    }
    
    private final void onSubscriptionItemLongClick(io.heckel.ntfy.db.Subscription subscription) {
    }
    
    private final void refreshAllSubscriptions() {
    }
    
    private final void startDetailView(io.heckel.ntfy.db.Subscription subscription) {
    }
    
    private final void startDetailSettingsView(io.heckel.ntfy.db.Subscription subscription) {
    }
    
    private final void handleActionModeClick(io.heckel.ntfy.db.Subscription subscription) {
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode, @org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void onMultiDeleteClick() {
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode) {
    }
    
    private final void beginActionMode(io.heckel.ntfy.db.Subscription subscription) {
    }
    
    private final void finishActionMode() {
    }
    
    private final void endActionModeAndRedraw() {
    }
    
    private final void redrawList() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lio/heckel/ntfy/ui/MainActivity$Companion;", "", "()V", "ANIMATION_DURATION", "", "DELETE_WORKER_INTERVAL_MINUTES", "EXTRA_SUBSCRIPTION_BASE_URL", "", "EXTRA_SUBSCRIPTION_DISPLAY_NAME", "EXTRA_SUBSCRIPTION_ID", "EXTRA_SUBSCRIPTION_INSTANT", "EXTRA_SUBSCRIPTION_MUTED_UNTIL", "EXTRA_SUBSCRIPTION_TOPIC", "ONE_DAY_MILLIS", "POLL_WORKER_INTERVAL_MINUTES", "SERVICE_START_WORKER_INTERVAL_MINUTES", "TAG", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}