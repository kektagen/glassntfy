package io.heckel.ntfy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/heckel/ntfy/ui/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lio/heckel/ntfy/db/Repository;", "(Lio/heckel/ntfy/db/Repository;)V", "list", "Landroidx/lifecycle/LiveData;", "", "Lio/heckel/ntfy/db/Notification;", "subscriptionId", "", "markAsDeleted", "Lkotlinx/coroutines/Job;", "notificationId", "", "app_fdroidDebug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final io.heckel.ntfy.db.Repository repository = null;
    
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<io.heckel.ntfy.db.Notification>> list(long subscriptionId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job markAsDeleted(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationId) {
        return null;
    }
}