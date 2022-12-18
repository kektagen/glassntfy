package io.heckel.ntfy.up;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"ACTION_MESSAGE", "", "ACTION_NEW_ENDPOINT", "ACTION_REGISTER", "ACTION_REGISTRATION_FAILED", "ACTION_UNREGISTER", "ACTION_UNREGISTERED", "EXTRA_APPLICATION", "EXTRA_BYTES_MESSAGE", "EXTRA_ENDPOINT", "EXTRA_MESSAGE", "EXTRA_TOKEN", "FEATURE_BYTES_MESSAGE", "app_fdroidRelease"})
public final class ConstantsKt {
    
    /**
     * Constants as defined on the specs
     * https://github.com/UnifiedPush/UP-spec/blob/main/specifications.md
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_NEW_ENDPOINT = "org.unifiedpush.android.connector.NEW_ENDPOINT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_REGISTRATION_FAILED = "org.unifiedpush.android.connector.REGISTRATION_FAILED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_UNREGISTERED = "org.unifiedpush.android.connector.UNREGISTERED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MESSAGE = "org.unifiedpush.android.connector.MESSAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_REGISTER = "org.unifiedpush.android.distributor.REGISTER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_UNREGISTER = "org.unifiedpush.android.distributor.UNREGISTER";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FEATURE_BYTES_MESSAGE = "org.unifiedpush.android.distributor.feature.BYTES_MESSAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_APPLICATION = "application";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TOKEN = "token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ENDPOINT = "endpoint";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MESSAGE = "message";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_BYTES_MESSAGE = "bytesMessage";
}