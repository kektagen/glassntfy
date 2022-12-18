package io.heckel.ntfy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000fJ\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u00120\u000fJ\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lio/heckel/ntfy/ui/SubscriptionsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lio/heckel/ntfy/db/Repository;", "(Lio/heckel/ntfy/db/Repository;)V", "add", "Lkotlinx/coroutines/Job;", "subscription", "Lio/heckel/ntfy/db/Subscription;", "get", "baseUrl", "", "topic", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "Landroidx/lifecycle/LiveData;", "", "listIdsWithInstantStatus", "", "Lkotlin/Pair;", "", "", "remove", "context", "Landroid/content/Context;", "subscriptionId", "app_fdroidDebug"})
public final class SubscriptionsViewModel extends androidx.lifecycle.ViewModel {
    private final io.heckel.ntfy.db.Repository repository = null;
    
    public SubscriptionsViewModel(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.heckel.ntfy.db.Subscription>> list() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Set<kotlin.Pair<java.lang.Long, java.lang.Boolean>>> listIdsWithInstantStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job add(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job remove(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long subscriptionId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super io.heckel.ntfy.db.Subscription> continuation) {
        return null;
    }
}