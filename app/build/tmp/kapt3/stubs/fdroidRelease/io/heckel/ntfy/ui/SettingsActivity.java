package io.heckel.ntfy.ui;

import java.lang.System;

/**
 * Main settings
 *
 * The "nested screen" navigation stuff (for user management) has been taken from
 * https://github.com/googlearchive/android-preferences/blob/master/app/src/main/java/com/example/androidx/preference/sample/MainActivity.kt
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003,-.B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J+\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180#2\u0006\u0010$\u001a\u00020%H\u0016\u00a2\u0006\u0002\u0010&J\u0010\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0015H\u0014J\b\u0010)\u001a\u00020\u001aH\u0016J\u0018\u0010*\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010+\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lio/heckel/ntfy/ui/SettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/preference/PreferenceFragmentCompat$OnPreferenceStartFragmentCallback;", "Lio/heckel/ntfy/ui/UserFragment$UserDialogListener;", "()V", "repository", "Lio/heckel/ntfy/db/Repository;", "serviceManager", "Lio/heckel/ntfy/service/SubscriberServiceManager;", "settingsFragment", "Lio/heckel/ntfy/ui/SettingsActivity$SettingsFragment;", "userSettingsFragment", "Lio/heckel/ntfy/ui/SettingsActivity$UserSettingsFragment;", "onAddUser", "", "dialog", "Landroidx/fragment/app/DialogFragment;", "user", "Lio/heckel/ntfy/db/User;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteUser", "baseUrl", "", "onPreferenceStartFragment", "", "caller", "Landroidx/preference/PreferenceFragmentCompat;", "pref", "Landroidx/preference/Preference;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSaveInstanceState", "outState", "onSupportNavigateUp", "onUpdateUser", "setAutoDownload", "Companion", "SettingsFragment", "UserSettingsFragment", "app_fdroidRelease"})
public final class SettingsActivity extends androidx.appcompat.app.AppCompatActivity implements androidx.preference.PreferenceFragmentCompat.OnPreferenceStartFragmentCallback, io.heckel.ntfy.ui.UserFragment.UserDialogListener {
    private io.heckel.ntfy.ui.SettingsActivity.SettingsFragment settingsFragment;
    private io.heckel.ntfy.ui.SettingsActivity.UserSettingsFragment userSettingsFragment;
    private io.heckel.ntfy.db.Repository repository;
    private io.heckel.ntfy.service.SubscriberServiceManager serviceManager;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.ui.SettingsActivity.Companion Companion = null;
    private static final java.lang.String TAG = "NtfySettingsActivity";
    private static final java.lang.String TITLE_TAG = "title";
    private static final int REQUEST_CODE_WRITE_EXTERNAL_STORAGE_PERMISSION_FOR_AUTO_DOWNLOAD = 2586;
    private static final long AUTO_DOWNLOAD_SELECTION_NOT_SET = -99L;
    private static final java.lang.String BACKUP_EVERYTHING = "everything";
    private static final java.lang.String BACKUP_EVERYTHING_NO_USERS = "everything_no_users";
    private static final java.lang.String BACKUP_SETTINGS_ONLY = "settings_only";
    private static final java.lang.String EXPORT_LOGS_COPY_ORIGINAL = "copy_original";
    private static final java.lang.String EXPORT_LOGS_COPY_SCRUBBED = "copy_scrubbed";
    private static final java.lang.String EXPORT_LOGS_UPLOAD_ORIGINAL = "upload_original";
    private static final java.lang.String EXPORT_LOGS_UPLOAD_SCRUBBED = "upload_scrubbed";
    private static final java.lang.String EXPORT_LOGS_UPLOAD_URL = "https://nopaste.net/?f=json";
    private static final int EXPORT_LOGS_UPLOAD_NOTIFY_SIZE_THRESHOLD = 102400;
    
    public SettingsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPreferenceStartFragment(@org.jetbrains.annotations.NotNull()
    androidx.preference.PreferenceFragmentCompat caller, @org.jetbrains.annotations.NotNull()
    androidx.preference.Preference pref) {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onAddUser(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment dialog, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.User user) {
    }
    
    @java.lang.Override()
    public void onUpdateUser(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment dialog, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.User user) {
    }
    
    @java.lang.Override()
    public void onDeleteUser(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment dialog, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl) {
    }
    
    private final void setAutoDownload() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u001c\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0002J\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lio/heckel/ntfy/ui/SettingsActivity$SettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "autoDownloadSelection", "", "repository", "Lio/heckel/ntfy/db/Repository;", "serviceManager", "Lio/heckel/ntfy/service/SubscriberServiceManager;", "copyLogsToClipboard", "", "scrub", "", "deleteLogs", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "", "restartService", "setAutoDownload", "showScrubDialog", "title", "uploadLogsToNopaste", "NopasteResponse", "app_fdroidRelease"})
    public static final class SettingsFragment extends androidx.preference.PreferenceFragmentCompat {
        private io.heckel.ntfy.db.Repository repository;
        private io.heckel.ntfy.service.SubscriberServiceManager serviceManager;
        private long autoDownloadSelection = -99L;
        
        public SettingsFragment() {
            super();
        }
        
        @java.lang.Override()
        public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
        java.lang.String rootKey) {
        }
        
        public final void setAutoDownload() {
        }
        
        private final void restartService() {
        }
        
        private final void copyLogsToClipboard(boolean scrub) {
        }
        
        private final void uploadLogsToNopaste(boolean scrub) {
        }
        
        private final void showScrubDialog(java.lang.String title) {
        }
        
        private final void deleteLogs() {
        }
        
        @androidx.annotation.Keep()
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lio/heckel/ntfy/ui/SettingsActivity$SettingsFragment$NopasteResponse;", "", "url", "", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_fdroidRelease"})
        public static final class NopasteResponse {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String url = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.heckel.ntfy.ui.SettingsActivity.SettingsFragment.NopasteResponse copy(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public NopasteResponse(@org.jetbrains.annotations.NotNull()
            java.lang.String url) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUrl() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016J\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lio/heckel/ntfy/ui/SettingsActivity$UserSettingsFragment;", "Landroidx/preference/PreferenceFragmentCompat;", "()V", "repository", "Lio/heckel/ntfy/db/Repository;", "addUserPreferences", "", "usersByBaseUrl", "", "", "", "Lio/heckel/ntfy/ui/SettingsActivity$UserSettingsFragment$UserWithMetadata;", "onCreatePreferences", "savedInstanceState", "Landroid/os/Bundle;", "rootKey", "reload", "UserWithMetadata", "app_fdroidRelease"})
    public static final class UserSettingsFragment extends androidx.preference.PreferenceFragmentCompat {
        private io.heckel.ntfy.db.Repository repository;
        
        public UserSettingsFragment() {
            super();
        }
        
        @java.lang.Override()
        public void onCreatePreferences(@org.jetbrains.annotations.Nullable()
        android.os.Bundle savedInstanceState, @org.jetbrains.annotations.Nullable()
        java.lang.String rootKey) {
        }
        
        public final void reload() {
        }
        
        private final void addUserPreferences(java.util.Map<java.lang.String, ? extends java.util.List<io.heckel.ntfy.ui.SettingsActivity.UserSettingsFragment.UserWithMetadata>> usersByBaseUrl) {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lio/heckel/ntfy/ui/SettingsActivity$UserSettingsFragment$UserWithMetadata;", "", "user", "Lio/heckel/ntfy/db/User;", "topics", "", "", "(Lio/heckel/ntfy/db/User;Ljava/util/List;)V", "getTopics", "()Ljava/util/List;", "getUser", "()Lio/heckel/ntfy/db/User;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_fdroidRelease"})
        public static final class UserWithMetadata {
            @org.jetbrains.annotations.NotNull()
            private final io.heckel.ntfy.db.User user = null;
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<java.lang.String> topics = null;
            
            @org.jetbrains.annotations.NotNull()
            public final io.heckel.ntfy.ui.SettingsActivity.UserSettingsFragment.UserWithMetadata copy(@org.jetbrains.annotations.NotNull()
            io.heckel.ntfy.db.User user, @org.jetbrains.annotations.NotNull()
            java.util.List<java.lang.String> topics) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public UserWithMetadata(@org.jetbrains.annotations.NotNull()
            io.heckel.ntfy.db.User user, @org.jetbrains.annotations.NotNull()
            java.util.List<java.lang.String> topics) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.heckel.ntfy.db.User component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final io.heckel.ntfy.db.User getUser() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.String> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<java.lang.String> getTopics() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lio/heckel/ntfy/ui/SettingsActivity$Companion;", "", "()V", "AUTO_DOWNLOAD_SELECTION_NOT_SET", "", "BACKUP_EVERYTHING", "", "BACKUP_EVERYTHING_NO_USERS", "BACKUP_SETTINGS_ONLY", "EXPORT_LOGS_COPY_ORIGINAL", "EXPORT_LOGS_COPY_SCRUBBED", "EXPORT_LOGS_UPLOAD_NOTIFY_SIZE_THRESHOLD", "", "EXPORT_LOGS_UPLOAD_ORIGINAL", "EXPORT_LOGS_UPLOAD_SCRUBBED", "EXPORT_LOGS_UPLOAD_URL", "REQUEST_CODE_WRITE_EXTERNAL_STORAGE_PERMISSION_FOR_AUTO_DOWNLOAD", "TAG", "TITLE_TAG", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}