package io.heckel.ntfy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lio/heckel/ntfy/ui/UserFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "baseUrlView", "Lcom/google/android/material/textfield/TextInputEditText;", "baseUrlsInUse", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "listener", "Lio/heckel/ntfy/ui/UserFragment$UserDialogListener;", "passwordView", "positiveButton", "Landroid/widget/Button;", "user", "Lio/heckel/ntfy/db/User;", "usernameView", "onAttach", "", "context", "Landroid/content/Context;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "saveClicked", "validateInput", "Companion", "UserDialogListener", "app_fdroidDebug"})
public final class UserFragment extends androidx.fragment.app.DialogFragment {
    private io.heckel.ntfy.db.User user;
    private java.util.ArrayList<java.lang.String> baseUrlsInUse;
    private io.heckel.ntfy.ui.UserFragment.UserDialogListener listener;
    private com.google.android.material.textfield.TextInputEditText baseUrlView;
    private com.google.android.material.textfield.TextInputEditText usernameView;
    private com.google.android.material.textfield.TextInputEditText passwordView;
    private android.widget.Button positiveButton;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.ui.UserFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfyUserFragment";
    private static final java.lang.String BUNDLE_BASE_URL = "baseUrl";
    private static final java.lang.String BUNDLE_USERNAME = "username";
    private static final java.lang.String BUNDLE_PASSWORD = "password";
    private static final java.lang.String BUNDLE_BASE_URLS_IN_USE = "baseUrlsInUse";
    
    public UserFragment() {
        super();
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
    
    private final void saveClicked() {
    }
    
    private final void validateInput() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\f\u00c0\u0006\u0003"}, d2 = {"Lio/heckel/ntfy/ui/UserFragment$UserDialogListener;", "", "onAddUser", "", "dialog", "Landroidx/fragment/app/DialogFragment;", "user", "Lio/heckel/ntfy/db/User;", "onDeleteUser", "baseUrl", "", "onUpdateUser", "app_fdroidDebug"})
    public static abstract interface UserDialogListener {
        
        public abstract void onAddUser(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.DialogFragment dialog, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.User user);
        
        public abstract void onUpdateUser(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.DialogFragment dialog, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.User user);
        
        public abstract void onDeleteUser(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.DialogFragment dialog, @org.jetbrains.annotations.NotNull()
        java.lang.String baseUrl);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000ej\b\u0012\u0004\u0012\u00020\u0004`\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lio/heckel/ntfy/ui/UserFragment$Companion;", "", "()V", "BUNDLE_BASE_URL", "", "BUNDLE_BASE_URLS_IN_USE", "BUNDLE_PASSWORD", "BUNDLE_USERNAME", "TAG", "newInstance", "Lio/heckel/ntfy/ui/UserFragment;", "user", "Lio/heckel/ntfy/db/User;", "baseUrlsInUse", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.ui.UserFragment newInstance(@org.jetbrains.annotations.Nullable()
        io.heckel.ntfy.db.User user, @org.jetbrains.annotations.NotNull()
        java.util.ArrayList<java.lang.String> baseUrlsInUse) {
            return null;
        }
    }
}