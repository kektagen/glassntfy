package io.heckel.ntfy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001ZB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020+H\u0002J\b\u00100\u001a\u00020+H\u0002J\u0010\u00101\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u00102\u001a\u00020+H\u0002J\u0016\u00103\u001a\u00020+2\f\u00104\u001a\b\u0012\u0004\u0012\u00020-05H\u0002J\u0010\u00106\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0002J\u001c\u00109\u001a\u00020\"2\b\u0010:\u001a\u0004\u0018\u00010\u00062\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020+H\u0002J\b\u0010>\u001a\u00020+H\u0002J\u0012\u0010?\u001a\u00020+2\b\u0010@\u001a\u0004\u0018\u00010AH\u0014J\u001c\u0010B\u001a\u00020\"2\b\u0010:\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010C\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010D\u001a\u00020+H\u0002J\u0012\u0010E\u001a\u00020+2\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010F\u001a\u00020+2\u0006\u0010G\u001a\u00020\"H\u0002J\b\u0010H\u001a\u00020+H\u0002J\b\u0010I\u001a\u00020+H\u0002J\u0010\u0010J\u001a\u00020+2\u0006\u0010G\u001a\u00020\"H\u0002J\u0010\u0010K\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010L\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010M\u001a\u00020+2\u0006\u0010N\u001a\u00020 H\u0016J\u0010\u0010O\u001a\u00020\"2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010P\u001a\u00020+H\u0014J\u001c\u0010Q\u001a\u00020\"2\b\u0010:\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010R\u001a\u00020+H\u0014J\b\u0010S\u001a\u00020+H\u0002J\b\u0010T\u001a\u00020+H\u0002J\b\u0010U\u001a\u00020+H\u0002J\u0010\u0010V\u001a\u00020+2\u0006\u0010G\u001a\u00020\"H\u0002J\u0010\u0010W\u001a\u00020+2\u0006\u0010N\u001a\u00020 H\u0002J\b\u0010X\u001a\u00020+H\u0002J\u0010\u0010Y\u001a\u00020+2\u0006\u0010\u001e\u001a\u00020\fH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b\'\u0010(\u00a8\u0006["}, d2 = {"Lio/heckel/ntfy/ui/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/ActionMode$Callback;", "Lio/heckel/ntfy/ui/NotificationFragment$NotificationSettingsListener;", "()V", "actionMode", "Landroid/view/ActionMode;", "adapter", "Lio/heckel/ntfy/ui/DetailAdapter;", "api", "Lio/heckel/ntfy/msg/ApiService;", "appBaseUrl", "", "mainList", "Landroidx/recyclerview/widget/RecyclerView;", "mainListContainer", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "menu", "Landroid/view/Menu;", "messenger", "Lio/heckel/ntfy/firebase/FirebaseMessenger;", "notifier", "Lio/heckel/ntfy/msg/NotificationService;", "repository", "Lio/heckel/ntfy/db/Repository;", "getRepository", "()Lio/heckel/ntfy/db/Repository;", "repository$delegate", "Lkotlin/Lazy;", "subscriptionBaseUrl", "subscriptionDisplayName", "subscriptionId", "", "subscriptionInstant", "", "subscriptionMutedUntil", "subscriptionTopic", "viewModel", "Lio/heckel/ntfy/ui/DetailViewModel;", "getViewModel", "()Lio/heckel/ntfy/ui/DetailViewModel;", "viewModel$delegate", "beginActionMode", "", "notification", "Lio/heckel/ntfy/db/Notification;", "copyToClipboard", "endActionModeAndRedraw", "finishActionMode", "handleActionModeClick", "loadView", "maybeCancelNotificationPopups", "notifications", "", "maybeSubscribeAndLoadView", "url", "Landroid/net/Uri;", "onActionItemClicked", "mode", "item", "Landroid/view/MenuItem;", "onClearClick", "onCopyUrlClick", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateActionMode", "onCreateOptionsMenu", "onDeleteClick", "onDestroyActionMode", "onInstantEnableClick", "enable", "onMultiCopyClick", "onMultiDeleteClick", "onMutedUntilClick", "onNotificationClick", "onNotificationLongClick", "onNotificationMutedUntilChanged", "mutedUntilTimestamp", "onOptionsItemSelected", "onPause", "onPrepareActionMode", "onResume", "onSettingsClick", "onTestClick", "refresh", "showHideInstantMenuItems", "showHideMutedUntilMenuItems", "startNotificationMutedChecker", "updateTitle", "Companion", "app_fdroidDebug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.ActionMode.Callback, io.heckel.ntfy.ui.NotificationFragment.NotificationSettingsListener {
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy repository$delegate = null;
    private final io.heckel.ntfy.msg.ApiService api = null;
    private final io.heckel.ntfy.firebase.FirebaseMessenger messenger = null;
    private io.heckel.ntfy.msg.NotificationService notifier;
    private java.lang.String appBaseUrl;
    private long subscriptionId = 0L;
    private java.lang.String subscriptionBaseUrl = "";
    private java.lang.String subscriptionTopic = "";
    private java.lang.String subscriptionDisplayName = "";
    private boolean subscriptionInstant = false;
    private long subscriptionMutedUntil = 0L;
    private io.heckel.ntfy.ui.DetailAdapter adapter;
    private androidx.recyclerview.widget.RecyclerView mainList;
    private androidx.swiperefreshlayout.widget.SwipeRefreshLayout mainListContainer;
    private android.view.Menu menu;
    private android.view.ActionMode actionMode;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.ui.DetailActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfyDetailActivity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_ID = "subscriptionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_BASE_URL = "baseUrl";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_TOPIC = "topic";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_SUBSCRIPTION_DISPLAY_NAME = "displayName";
    
    public DetailActivity() {
        super();
    }
    
    private final io.heckel.ntfy.ui.DetailViewModel getViewModel() {
        return null;
    }
    
    private final io.heckel.ntfy.db.Repository getRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void maybeSubscribeAndLoadView(android.net.Uri url) {
    }
    
    private final void loadView() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    private final void maybeCancelNotificationPopups(java.util.List<io.heckel.ntfy.db.Notification> notifications) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    private final void startNotificationMutedChecker() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void onTestClick() {
    }
    
    private final void onMutedUntilClick(boolean enable) {
    }
    
    @java.lang.Override()
    public void onNotificationMutedUntilChanged(long mutedUntilTimestamp) {
    }
    
    private final void onCopyUrlClick() {
    }
    
    private final void refresh() {
    }
    
    private final void onInstantEnableClick(boolean enable) {
    }
    
    private final void showHideInstantMenuItems(boolean enable) {
    }
    
    private final void showHideMutedUntilMenuItems(long mutedUntilTimestamp) {
    }
    
    private final void updateTitle(java.lang.String subscriptionDisplayName) {
    }
    
    private final void onClearClick() {
    }
    
    private final void onSettingsClick() {
    }
    
    private final void onDeleteClick() {
    }
    
    private final void onNotificationClick(io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void copyToClipboard(io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void onNotificationLongClick(io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void handleActionModeClick(io.heckel.ntfy.db.Notification notification) {
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
    
    private final void onMultiCopyClick() {
    }
    
    private final void onMultiDeleteClick() {
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode mode) {
    }
    
    private final void beginActionMode(io.heckel.ntfy.db.Notification notification) {
    }
    
    private final void finishActionMode() {
    }
    
    private final void endActionModeAndRedraw() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lio/heckel/ntfy/ui/DetailActivity$Companion;", "", "()V", "EXTRA_SUBSCRIPTION_BASE_URL", "", "EXTRA_SUBSCRIPTION_DISPLAY_NAME", "EXTRA_SUBSCRIPTION_ID", "EXTRA_SUBSCRIPTION_TOPIC", "TAG", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}