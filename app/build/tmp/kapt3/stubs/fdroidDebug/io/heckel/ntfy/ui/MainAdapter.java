package io.heckel.ntfy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001a\u001b\u001cB5\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\rR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lio/heckel/ntfy/ui/MainAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/heckel/ntfy/db/Subscription;", "Lio/heckel/ntfy/ui/MainAdapter$SubscriptionViewHolder;", "repository", "Lio/heckel/ntfy/db/Repository;", "onClick", "Lkotlin/Function1;", "", "onLongClick", "(Lio/heckel/ntfy/db/Repository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "selected", "", "", "getSelected", "()Ljava/util/Set;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "toggleSelection", "subscriptionId", "Companion", "SubscriptionViewHolder", "TopicDiffCallback", "app_fdroidDebug"})
public final class MainAdapter extends androidx.recyclerview.widget.ListAdapter<io.heckel.ntfy.db.Subscription, io.heckel.ntfy.ui.MainAdapter.SubscriptionViewHolder> {
    private final io.heckel.ntfy.db.Repository repository = null;
    private final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Subscription, kotlin.Unit> onClick = null;
    private final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Subscription, kotlin.Unit> onLongClick = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.Long> selected = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.ui.MainAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfyMainAdapter";
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Repository repository, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.heckel.ntfy.db.Subscription, kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.heckel.ntfy.db.Subscription, kotlin.Unit> onLongClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Long> getSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.heckel.ntfy.ui.MainAdapter.SubscriptionViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.ui.MainAdapter.SubscriptionViewHolder holder, int position) {
    }
    
    public final void toggleSelection(long subscriptionId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u000bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lio/heckel/ntfy/ui/MainAdapter$SubscriptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "repository", "Lio/heckel/ntfy/db/Repository;", "selected", "", "", "onClick", "Lkotlin/Function1;", "Lio/heckel/ntfy/db/Subscription;", "", "onLongClick", "(Landroid/view/View;Lio/heckel/ntfy/db/Repository;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "context", "Landroid/content/Context;", "dateView", "Landroid/widget/TextView;", "imageView", "Landroid/widget/ImageView;", "instantImageView", "nameView", "newItemsView", "notificationDisabledForeverImageView", "notificationDisabledUntilImageView", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "getOnLongClick", "statusView", "subscription", "bind", "app_fdroidDebug"})
    public static final class SubscriptionViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final io.heckel.ntfy.db.Repository repository = null;
        private final java.util.Set<java.lang.Long> selected = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Subscription, kotlin.Unit> onClick = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Subscription, kotlin.Unit> onLongClick = null;
        private io.heckel.ntfy.db.Subscription subscription;
        private final android.content.Context context = null;
        private final android.widget.ImageView imageView = null;
        private final android.widget.TextView nameView = null;
        private final android.widget.TextView statusView = null;
        private final android.widget.TextView dateView = null;
        private final android.view.View notificationDisabledUntilImageView = null;
        private final android.view.View notificationDisabledForeverImageView = null;
        private final android.view.View instantImageView = null;
        private final android.widget.TextView newItemsView = null;
        
        public SubscriptionViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Repository repository, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.Long> selected, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super io.heckel.ntfy.db.Subscription, kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super io.heckel.ntfy.db.Subscription, kotlin.Unit> onLongClick) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Subscription, kotlin.Unit> getOnClick() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Subscription, kotlin.Unit> getOnLongClick() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Subscription subscription) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lio/heckel/ntfy/ui/MainAdapter$TopicDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lio/heckel/ntfy/db/Subscription;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_fdroidDebug"})
    public static final class TopicDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<io.heckel.ntfy.db.Subscription> {
        @org.jetbrains.annotations.NotNull()
        public static final io.heckel.ntfy.ui.MainAdapter.TopicDiffCallback INSTANCE = null;
        
        private TopicDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Subscription oldItem, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Subscription newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Subscription oldItem, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Subscription newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lio/heckel/ntfy/ui/MainAdapter$Companion;", "", "()V", "TAG", "", "app_fdroidDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}