package io.heckel.ntfy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\""}, d2 = {"Lio/heckel/ntfy/ui/NotificationFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "muteFor1hButton", "Landroid/widget/RadioButton;", "muteFor2hButton", "muteFor30minButton", "muteFor8hButton", "muteForeverButton", "muteUntilTomorrowButton", "repository", "Lio/heckel/ntfy/db/Repository;", "settingsListener", "Lio/heckel/ntfy/ui/NotificationFragment$NotificationSettingsListener;", "getSettingsListener", "()Lio/heckel/ntfy/ui/NotificationFragment$NotificationSettingsListener;", "setSettingsListener", "(Lio/heckel/ntfy/ui/NotificationFragment$NotificationSettingsListener;)V", "onAttach", "", "context", "Landroid/content/Context;", "onClick", "mutedUntilTimestamp", "", "onClickMinutes", "minutes", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "NotificationSettingsListener", "app_fdroidRelease"})
public final class NotificationFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.Nullable()
    private io.heckel.ntfy.ui.NotificationFragment.NotificationSettingsListener settingsListener;
    private io.heckel.ntfy.db.Repository repository;
    private android.widget.RadioButton muteFor30minButton;
    private android.widget.RadioButton muteFor1hButton;
    private android.widget.RadioButton muteFor2hButton;
    private android.widget.RadioButton muteFor8hButton;
    private android.widget.RadioButton muteUntilTomorrowButton;
    private android.widget.RadioButton muteForeverButton;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.ui.NotificationFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfyNotificationFragment";
    
    public NotificationFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.heckel.ntfy.ui.NotificationFragment.NotificationSettingsListener getSettingsListener() {
        return null;
    }
    
    public final void setSettingsListener(@org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.ui.NotificationFragment.NotificationSettingsListener p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void onClickMinutes(int minutes) {
    }
    
    private final void onClick(long mutedUntilTimestamp) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006\u00c0\u0006\u0003"}, d2 = {"Lio/heckel/ntfy/ui/NotificationFragment$NotificationSettingsListener;", "", "onNotificationMutedUntilChanged", "", "mutedUntilTimestamp", "", "app_fdroidRelease"})
    public static abstract interface NotificationSettingsListener {
        
        public abstract void onNotificationMutedUntilChanged(long mutedUntilTimestamp);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/heckel/ntfy/ui/NotificationFragment$Companion;", "", "()V", "TAG", "", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}