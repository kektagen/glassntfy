package io.heckel.ntfy.ui;

import java.lang.System;

/**
 * Subscription settings
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/heckel/ntfy/ui/DetailSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "notificationService", "Lio/heckel/ntfy/msg/NotificationService;", "repository", "Lio/heckel/ntfy/db/Repository;", "serviceManager", "Lio/heckel/ntfy/service/SubscriberServiceManager;", "settingsFragment", "Lio/heckel/ntfy/ui/DetailSettingsActivity$SettingsFragment;", "subscriptionId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "Companion", "SettingsFragment", "app_fdroidDebug"})
public final class DetailSettingsActivity extends androidx.appcompat.app.AppCompatActivity {
    private io.heckel.ntfy.db.Repository repository;
    private io.heckel.ntfy.service.SubscriberServiceManager serviceManager;
    private io.heckel.ntfy.ui.DetailSettingsActivity.SettingsFragment settingsFragment;
    private io.heckel.ntfy.msg.NotificationService notificationService;
    private long subscriptionId = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.ui.DetailSettingsActivity.Companion Companion = null;
    private static final java.lang.String TAG = "NtfyDetailSettingsActiv";
    private static final java.lang.String SUBSCRIPTION_ICONS = "subscriptionIcons";
    private static final int SUBSCRIPTION_ICON_MAX_SIZE_BYTES = 4194304;
    private static final int SUBSCRIPTION_ICON_MAX_WIDTH = 2048;
    private static final int SUBSCRIPTION_ICON_MAX_HEIGHT = 2048;
    
    public DetailSettingsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\b\u0010\"\u001a\u00020\u0018H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020)H\u0002J\u001c\u0010*\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00132\b\b\u0002\u00100\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lio/heckel/ntfy/ui/DetailSettingsActivity$SettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "iconRemovePref", "Landroidx/preference/Preference;", "iconSetLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "iconSetPref", "notificationService", "Lio/heckel/ntfy/msg/NotificationService;", "openChannelsPref", "repository", "Lio/heckel/ntfy/db/Repository;", "resolver", "Landroid/content/ContentResolver;", "serviceManager", "Lio/heckel/ntfy/service/SubscriberServiceManager;", "subscription", "Lio/heckel/ntfy/db/Subscription;", "createIconPickLauncher", "createUri", "Landroid/net/Uri;", "deleteIcon", "", "uri", "loadAutoDeletePref", "loadDedicatedChannelsPrefs", "loadDisplayNamePref", "loadIconRemovePref", "loadIconSetPref", "loadInsistentMaxPriorityPref", "loadInstantPref", "loadMinPriorityPref", "loadMutedUntilPref", "loadOpenChannelsPrefs", "loadTopicUrlPref", "loadView", "maybeAppendGlobal", "summary", "global", "", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "save", "newSubscription", "refresh", "app_fdroidDebug"})
    public static final class SettingsFragment extends androidx.preference.PreferenceFragmentCompat {
        private android.content.ContentResolver resolver;
        private io.heckel.ntfy.db.Repository repository;
        private io.heckel.ntfy.service.SubscriberServiceManager serviceManager;
        private io.heckel.ntfy.msg.NotificationService notificationService;
        private io.heckel.ntfy.db.Subscription subscription;
        private androidx.preference.Preference iconSetPref;
        private androidx.preference.Preference openChannelsPref;
        private androidx.activity.result.ActivityResultLauncher<java.lang.String> iconSetLauncher;
        private androidx.preference.Preference iconRemovePref;
        
        public SettingsFragment() {
            super();
        }
        
        @java.lang.Override()
        public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
        java.lang.String rootKey) {
        }
        
        private final void loadView() {
        }
        
        private final void loadInstantPref() {
        }
        
        private final void loadDedicatedChannelsPrefs() {
        }
        
        private final void loadOpenChannelsPrefs() {
        }
        
        private final void loadMutedUntilPref() {
        }
        
        private final void loadMinPriorityPref() {
        }
        
        private final void loadAutoDeletePref() {
        }
        
        private final void loadInsistentMaxPriorityPref() {
        }
        
        private final void loadIconSetPref() {
        }
        
        private final void loadIconRemovePref() {
        }
        
        private final void loadDisplayNamePref() {
        }
        
        private final void loadTopicUrlPref() {
        }
        
        private final androidx.activity.result.ActivityResultLauncher<java.lang.String> createIconPickLauncher() {
            return null;
        }
        
        private final android.net.Uri createUri() {
            return null;
        }
        
        private final void deleteIcon(java.lang.String uri) {
        }
        
        private final void save(io.heckel.ntfy.db.Subscription newSubscription, boolean refresh) {
        }
        
        private final java.lang.String maybeAppendGlobal(java.lang.String summary, boolean global) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lio/heckel/ntfy/ui/DetailSettingsActivity$Companion;", "", "()V", "SUBSCRIPTION_ICONS", "", "SUBSCRIPTION_ICON_MAX_HEIGHT", "", "SUBSCRIPTION_ICON_MAX_SIZE_BYTES", "SUBSCRIPTION_ICON_MAX_WIDTH", "TAG", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}