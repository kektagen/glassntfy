package io.heckel.ntfy.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B*\u0012#\u0010\u0002\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J*\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J*\u0010\u0013\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R.\u0010\u0002\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lio/heckel/ntfy/util/AfterChangedTextWatcher;", "Landroid/text/TextWatcher;", "afterTextChangedFn", "Lkotlin/Function1;", "Landroid/text/Editable;", "Lkotlin/ParameterName;", "name", "s", "", "(Lkotlin/jvm/functions/Function1;)V", "getAfterTextChangedFn", "()Lkotlin/jvm/functions/Function1;", "afterTextChanged", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_fdroidRelease"})
public final class AfterChangedTextWatcher implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit> afterTextChangedFn = null;
    
    public AfterChangedTextWatcher(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.text.Editable, kotlin.Unit> afterTextChangedFn) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<android.text.Editable, kotlin.Unit> getAfterTextChangedFn() {
        return null;
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
}