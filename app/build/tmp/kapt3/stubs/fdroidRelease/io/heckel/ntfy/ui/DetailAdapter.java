package io.heckel.ntfy.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001f !BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0016H\u0016J\u000e\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lio/heckel/ntfy/ui/DetailAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lio/heckel/ntfy/db/Notification;", "Lio/heckel/ntfy/ui/DetailAdapter$DetailViewHolder;", "activity", "Landroid/app/Activity;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "repository", "Lio/heckel/ntfy/db/Repository;", "onClick", "Lkotlin/Function1;", "", "onLongClick", "(Landroid/app/Activity;Lkotlinx/coroutines/CoroutineScope;Lio/heckel/ntfy/db/Repository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "selected", "", "", "getSelected", "()Ljava/util/Set;", "get", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "toggleSelection", "notificationId", "Companion", "DetailViewHolder", "TopicDiffCallback", "app_fdroidRelease"})
public final class DetailAdapter extends androidx.recyclerview.widget.ListAdapter<io.heckel.ntfy.db.Notification, io.heckel.ntfy.ui.DetailAdapter.DetailViewHolder> {
    private final android.app.Activity activity = null;
    private final kotlinx.coroutines.CoroutineScope lifecycleScope = null;
    private final io.heckel.ntfy.db.Repository repository = null;
    private final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Notification, kotlin.Unit> onClick = null;
    private final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Notification, kotlin.Unit> onLongClick = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Set<java.lang.String> selected = null;
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.ui.DetailAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "NtfyDetailAdapter";
    public static final int REQUEST_CODE_WRITE_STORAGE_PERMISSION_FOR_DOWNLOAD = 9876;
    public static final int IMAGE_PREVIEW_MAX_BYTES = 5242880;
    
    public DetailAdapter(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Repository repository, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.heckel.ntfy.db.Notification, kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super io.heckel.ntfy.db.Notification, kotlin.Unit> onLongClick) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.heckel.ntfy.ui.DetailAdapter.DetailViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.ui.DetailAdapter.DetailViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.heckel.ntfy.db.Notification get(int position) {
        return null;
    }
    
    public final void toggleSelection(@org.jetbrains.annotations.NotNull()
    java.lang.String notificationId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\tH\u0002J\u000e\u0010/\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u000fJ\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000fH\u0002J\u0018\u00104\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000fH\u0002J\u0018\u00105\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u000207H\u0002J&\u00108\u001a\u00020\t2\u0006\u00102\u001a\u0002032\u0006\u00109\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002010:H\u0002J \u0010;\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000f2\u0006\u00106\u001a\u000207H\u0002J\u0018\u0010<\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000fH\u0002J\"\u0010=\u001a\u00020\f2\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u0002072\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J.\u0010@\u001a\u0004\u0018\u00010A2\u0006\u00102\u001a\u0002032\b\u0010B\u001a\u0004\u0018\u00010\t2\u0006\u0010&\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0018\u0010C\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000fH\u0002J\"\u0010D\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J4\u0010E\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000f2\u0006\u00106\u001a\u0002072\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\u001a\u0010H\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\b\u0010F\u001a\u0004\u0018\u00010GH\u0002J\"\u0010I\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000f2\b\u0010J\u001a\u0004\u0018\u00010?H\u0002J\"\u0010K\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0018\u0010L\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u000207H\u0002J\u0012\u0010M\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u00010?H\u0002J\u0018\u0010O\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000fH\u0002J\b\u0010P\u001a\u00020\u0010H\u0002J \u0010Q\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020SH\u0002J \u0010T\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020SH\u0002J\u0018\u0010U\u001a\u00020\u00102\u0006\u00102\u001a\u0002032\u0006\u0010R\u001a\u00020SH\u0002J\u0018\u0010V\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u000207H\u0002R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u000e\u0010*\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006W"}, d2 = {"Lio/heckel/ntfy/ui/DetailAdapter$DetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "activity", "Landroid/app/Activity;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "repository", "Lio/heckel/ntfy/db/Repository;", "itemView", "Landroid/view/View;", "selected", "", "", "onClick", "Lkotlin/Function1;", "Lio/heckel/ntfy/db/Notification;", "", "onLongClick", "(Landroid/app/Activity;Lkotlinx/coroutines/CoroutineScope;Lio/heckel/ntfy/db/Repository;Landroid/view/View;Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "actionsFlow", "Landroidx/constraintlayout/helper/widget/Flow;", "actionsWrapperView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "attachmentBoxView", "attachmentIconView", "Landroid/widget/ImageView;", "attachmentImageView", "attachmentInfoView", "Landroid/widget/TextView;", "cardView", "Landroidx/cardview/widget/CardView;", "dateView", "iconView", "layout", "menuButton", "Landroid/widget/ImageButton;", "messageView", "newDotImageView", "notification", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "getOnLongClick", "priorityImageView", "tagsView", "titleView", "addButtonToCard", "button", "bind", "cancelDownload", "", "context", "Landroid/content/Context;", "copyContents", "copyUrl", "attachment", "Lio/heckel/ntfy/db/Attachment;", "createCardButton", "label", "Lkotlin/Function0;", "deleteFile", "downloadFile", "formatAttachmentDetails", "attachmentFileStat", "Lio/heckel/ntfy/util/FileInfo;", "maybeCreateMenuPopup", "Landroid/widget/PopupMenu;", "anchor", "maybeRenderActions", "maybeRenderAttachment", "maybeRenderAttachmentBox", "bitmap", "Landroid/graphics/Bitmap;", "maybeRenderAttachmentImage", "maybeRenderIcon", "iconStat", "maybeRenderMenu", "openFile", "previewableImage", "fileStat", "renderPriority", "resetCardButtons", "runAction", "action", "Lio/heckel/ntfy/db/Action;", "runOtherUserAction", "runViewAction", "saveFile", "app_fdroidRelease"})
    public static final class DetailViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.app.Activity activity = null;
        private final kotlinx.coroutines.CoroutineScope lifecycleScope = null;
        private final io.heckel.ntfy.db.Repository repository = null;
        private final java.util.Set<java.lang.String> selected = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Notification, kotlin.Unit> onClick = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Notification, kotlin.Unit> onLongClick = null;
        private io.heckel.ntfy.db.Notification notification;
        private final android.view.View layout = null;
        private final androidx.cardview.widget.CardView cardView = null;
        private final android.widget.ImageView priorityImageView = null;
        private final android.widget.TextView dateView = null;
        private final android.widget.TextView titleView = null;
        private final android.widget.TextView messageView = null;
        private final android.widget.ImageView iconView = null;
        private final android.view.View newDotImageView = null;
        private final android.widget.TextView tagsView = null;
        private final android.widget.ImageButton menuButton = null;
        private final android.widget.ImageView attachmentImageView = null;
        private final android.view.View attachmentBoxView = null;
        private final android.widget.ImageView attachmentIconView = null;
        private final android.widget.TextView attachmentInfoView = null;
        private final androidx.constraintlayout.widget.ConstraintLayout actionsWrapperView = null;
        private final androidx.constraintlayout.helper.widget.Flow actionsFlow = null;
        
        public DetailViewHolder(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.CoroutineScope lifecycleScope, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Repository repository, @org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        java.util.Set<java.lang.String> selected, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super io.heckel.ntfy.db.Notification, kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super io.heckel.ntfy.db.Notification, kotlin.Unit> onLongClick) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Notification, kotlin.Unit> getOnClick() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<io.heckel.ntfy.db.Notification, kotlin.Unit> getOnLongClick() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Notification notification) {
        }
        
        private final void renderPriority(android.content.Context context, io.heckel.ntfy.db.Notification notification) {
        }
        
        private final void maybeRenderAttachment(android.content.Context context, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.util.FileInfo attachmentFileStat) {
        }
        
        private final void maybeRenderIcon(android.content.Context context, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.util.FileInfo iconStat) {
        }
        
        private final void maybeRenderMenu(android.content.Context context, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.util.FileInfo attachmentFileStat) {
        }
        
        private final void maybeRenderActions(android.content.Context context, io.heckel.ntfy.db.Notification notification) {
        }
        
        private final void resetCardButtons() {
        }
        
        private final void addButtonToCard(android.view.View button) {
        }
        
        private final android.view.View createCardButton(android.content.Context context, java.lang.String label, kotlin.jvm.functions.Function0<java.lang.Boolean> onClick) {
            return null;
        }
        
        private final void maybeRenderAttachmentBox(android.content.Context context, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.db.Attachment attachment, io.heckel.ntfy.util.FileInfo attachmentFileStat, android.graphics.Bitmap bitmap) {
        }
        
        private final android.widget.PopupMenu maybeCreateMenuPopup(android.content.Context context, android.view.View anchor, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.util.FileInfo attachmentFileStat) {
            return null;
        }
        
        private final java.lang.String formatAttachmentDetails(android.content.Context context, io.heckel.ntfy.db.Attachment attachment, io.heckel.ntfy.util.FileInfo attachmentFileStat) {
            return null;
        }
        
        private final void maybeRenderAttachmentImage(android.content.Context context, android.graphics.Bitmap bitmap) {
        }
        
        private final boolean openFile(android.content.Context context, io.heckel.ntfy.db.Attachment attachment) {
            return false;
        }
        
        private final boolean saveFile(android.content.Context context, io.heckel.ntfy.db.Attachment attachment) {
            return false;
        }
        
        private final boolean deleteFile(android.content.Context context, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.db.Attachment attachment) {
            return false;
        }
        
        private final boolean downloadFile(android.content.Context context, io.heckel.ntfy.db.Notification notification) {
            return false;
        }
        
        private final boolean cancelDownload(android.content.Context context, io.heckel.ntfy.db.Notification notification) {
            return false;
        }
        
        private final boolean copyUrl(android.content.Context context, io.heckel.ntfy.db.Attachment attachment) {
            return false;
        }
        
        private final boolean copyContents(android.content.Context context, io.heckel.ntfy.db.Notification notification) {
            return false;
        }
        
        private final boolean runAction(android.content.Context context, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.db.Action action) {
            return false;
        }
        
        private final void runViewAction(android.content.Context context, io.heckel.ntfy.db.Action action) {
        }
        
        private final void runOtherUserAction(android.content.Context context, io.heckel.ntfy.db.Notification notification, io.heckel.ntfy.db.Action action) {
        }
        
        private final boolean previewableImage(io.heckel.ntfy.util.FileInfo fileStat) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lio/heckel/ntfy/ui/DetailAdapter$TopicDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lio/heckel/ntfy/db/Notification;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_fdroidRelease"})
    public static final class TopicDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<io.heckel.ntfy.db.Notification> {
        @org.jetbrains.annotations.NotNull()
        public static final io.heckel.ntfy.ui.DetailAdapter.TopicDiffCallback INSTANCE = null;
        
        private TopicDiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Notification oldItem, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Notification newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Notification oldItem, @org.jetbrains.annotations.NotNull()
        io.heckel.ntfy.db.Notification newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lio/heckel/ntfy/ui/DetailAdapter$Companion;", "", "()V", "IMAGE_PREVIEW_MAX_BYTES", "", "REQUEST_CODE_WRITE_STORAGE_PERMISSION_FOR_DOWNLOAD", "TAG", "", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}