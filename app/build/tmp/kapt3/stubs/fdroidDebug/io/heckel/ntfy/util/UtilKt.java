package io.heckel.ntfy.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 2, d1 = {"\u0000\u00ac\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r\u001a\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019\u001a \u0010\u001b\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001d\u001a\u00020\r\u001a\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010 \u001a\u000e\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#\u001a\u0018\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\'\u001a\u00020\u0019\u001a\u000e\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020&\u001a\u000e\u0010*\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010+\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t\u001a\u0016\u0010+\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t\u001a\u000e\u0010,\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u000e\u0010-\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0016\u0010.\u001a\u00020\r2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000100\u001a\u0016\u00101\u001a\u00020\r2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u000100\u001a\u0016\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t\u001a\u001a\u00104\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\r\u001a\u001c\u00105\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0018\u0001062\u0006\u00107\u001a\u00020\r\u001a\u0010\u00108\u001a\u00020\u00192\b\u00109\u001a\u0004\u0018\u00010\r\u001a\u000e\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\u0019\u001a\u0006\u0010<\u001a\u00020&\u001aa\u0010=\u001a\u0004\u0018\u0001H>\"\b\b\u0000\u0010?*\u00020@\"\b\b\u0001\u0010A*\u00020@\"\b\b\u0002\u0010>*\u00020@2\b\u0010B\u001a\u0004\u0018\u0001H?2\b\u0010C\u001a\u0004\u0018\u0001HA2\u001a\u0010D\u001a\u0016\u0012\u0004\u0012\u0002H?\u0012\u0004\u0012\u0002HA\u0012\u0006\u0012\u0004\u0018\u0001H>0EH\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010F\u001a\u000e\u0010G\u001a\u00020\r2\u0006\u0010H\u001a\u00020\r\u001a\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020\r002\b\u0010/\u001a\u0004\u0018\u00010\r\u001a\u001a\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r062\u0006\u00107\u001a\u00020\r\u001a\u000e\u0010K\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\u0010\u0010L\u001a\u00020\u00012\b\u00109\u001a\u0004\u0018\u00010\r\u001a\u0010\u0010M\u001a\u0004\u0018\u00010\r2\u0006\u0010N\u001a\u00020\r\u001a\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020\r002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\r00\u001a\u0015\u0010P\u001a\u00020\u00192\b\u0010Q\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010R\u001a\u0016\u0010S\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0019\u001a\u0016\u0010T\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r\u001a\u0016\u00107\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r\u001a\u0016\u0010W\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r\u001a\u001e\u0010X\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r\u001a\u001e\u0010Z\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r\u001a\u0016\u0010[\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r\u001a\u001e\u0010\\\u001a\u00020\r2\u0006\u0010U\u001a\u00020\r2\u0006\u0010V\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r\u001a\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\r002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\r00\u001a\u000e\u0010^\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\r\u001a\u000e\u0010_\u001a\u00020\u00012\u0006\u0010H\u001a\u00020\r\u001a\u0012\u0010`\u001a\u00020\u0005*\u00020a2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\n\u0010b\u001a\u00020\u0005*\u00020c\u001a\u0012\u0010d\u001a\u00020\u0005*\u00020c2\u0006\u0010e\u001a\u00020f\u001a\u0011\u0010g\u001a\u0004\u0018\u00010&*\u00020&\u00a2\u0006\u0002\u0010h\u001a\u0012\u0010i\u001a\u00020j*\u00020 2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010i\u001a\u00020j*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0014\u0010k\u001a\u0004\u0018\u00010j*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0012\u0010l\u001a\u00020\u0005*\u00020c2\u0006\u0010m\u001a\u00020n\u001a\n\u0010o\u001a\u00020\r*\u00020\r\u001a\n\u0010p\u001a\u00020\u0005*\u00020c\u001a\n\u0010q\u001a\u00020\u0001*\u00020\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006r"}, d2 = {"canOpenAttachment", "", "attachment", "Lio/heckel/ntfy/db/Attachment;", "copyToClipboard", "", "context", "Landroid/content/Context;", "notification", "Lio/heckel/ntfy/db/Notification;", "decodeBytesMessage", "", "decodeMessage", "", "displayName", "subscription", "Lio/heckel/ntfy/db/Subscription;", "ensureSafeNewFile", "Ljava/io/File;", "dir", "name", "fadeStatusBarColor", "window", "Landroid/view/Window;", "fromColor", "", "toColor", "fileName", "contentUri", "fallbackName", "fileStat", "Lio/heckel/ntfy/util/FileInfo;", "Landroid/net/Uri;", "formatActionLabel", "action", "Lio/heckel/ntfy/db/Action;", "formatBytes", "bytes", "", "decimals", "formatDateShort", "timestampSecs", "formatMessage", "formatTitle", "isDarkThemeOn", "isIgnoringBatteryOptimizations", "joinTags", "tags", "", "joinTagsMap", "maybeAppendActionErrors", "message", "maybeFileStat", "maybeSplitTopicUrl", "Lkotlin/Pair;", "topicUrl", "mimeTypeToIconResource", "mimeType", "randomString", "len", "randomSubscriptionId", "safeLet", "R", "T1", "", "T2", "p1", "p2", "block", "Lkotlin/Function2;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "shortUrl", "url", "splitTags", "splitTopicUrl", "subscriptionTopicShortUrl", "supportedImage", "toEmoji", "tag", "toEmojis", "toPriority", "priority", "(Ljava/lang/Integer;)I", "toPriorityString", "topicShortUrl", "baseUrl", "topic", "topicUrlAuth", "topicUrlJson", "since", "topicUrlJsonPoll", "topicUrlUp", "topicUrlWs", "unmatchedTags", "validTopic", "validUrl", "dangerButton", "Landroid/widget/Button;", "hideRipple", "Landroid/view/View;", "makeEndIconSmaller", "resources", "Landroid/content/res/Resources;", "nullIfZero", "(J)Ljava/lang/Long;", "readBitmapFromUri", "Landroid/graphics/Bitmap;", "readBitmapFromUriOrNull", "ripple", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sha256", "showRipple", "systemDarkThemeOn", "app_fdroidDebug"})
public final class UtilKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String topicUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String topicUrlUp(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String topicUrlJson(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.lang.String since) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String topicUrlWs(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.lang.String since) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String topicUrlAuth(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String topicUrlJsonPoll(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic, @org.jetbrains.annotations.NotNull()
    java.lang.String since) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String topicShortUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String subscriptionTopicShortUrl(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String displayName(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String shortUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.Pair<java.lang.String, java.lang.String> splitTopicUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String topicUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Pair<java.lang.String, java.lang.String> maybeSplitTopicUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String topicUrl) {
        return null;
    }
    
    public static final boolean validTopic(@org.jetbrains.annotations.NotNull()
    java.lang.String topic) {
        return false;
    }
    
    public static final boolean validUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatDateShort(long timestampSecs) {
        return null;
    }
    
    public static final int toPriority(@org.jetbrains.annotations.Nullable()
    java.lang.Integer priority) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toPriorityString(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int priority) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String joinTags(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> tags) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String joinTagsMap(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> tags) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> splitTags(@org.jetbrains.annotations.Nullable()
    java.lang.String tags) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> toEmojis(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tags) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String toEmoji(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<java.lang.String> unmatchedTags(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> tags) {
        return null;
    }
    
    /**
     * Prepend tags/emojis to message, but only if there is a non-empty title.
     * Otherwise, the tags will be prepended to the title.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatMessage(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String decodeMessage(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final byte[] decodeBytesMessage(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
        return null;
    }
    
    /**
     * See above; prepend emojis to title if the title is non-empty.
     * Otherwise, they are prepended to the message.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatTitle(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Subscription subscription, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatTitle(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatActionLabel(@org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Action action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String maybeAppendActionErrors(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String fileName(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String contentUri, @org.jetbrains.annotations.NotNull()
    java.lang.String fallbackName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.util.FileInfo fileStat(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.net.Uri contentUri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final io.heckel.ntfy.util.FileInfo maybeFileStat(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String contentUri) {
        return null;
    }
    
    public static final void fadeStatusBarColor(@org.jetbrains.annotations.NotNull()
    android.view.Window window, int fromColor, int toColor) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String randomString(int len) {
        return null;
    }
    
    public static final long randomSubscriptionId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T1 extends java.lang.Object, T2 extends java.lang.Object, R extends java.lang.Object>R safeLet(@org.jetbrains.annotations.Nullable()
    T1 p1, @org.jetbrains.annotations.Nullable()
    T2 p2, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T1, ? super T2, ? extends R> block) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String formatBytes(long bytes, int decimals) {
        return null;
    }
    
    public static final int mimeTypeToIconResource(@org.jetbrains.annotations.Nullable()
    java.lang.String mimeType) {
        return 0;
    }
    
    public static final boolean supportedImage(@org.jetbrains.annotations.Nullable()
    java.lang.String mimeType) {
        return false;
    }
    
    public static final boolean canOpenAttachment(@org.jetbrains.annotations.Nullable()
    io.heckel.ntfy.db.Attachment attachment) {
        return false;
    }
    
    public static final boolean isIgnoringBatteryOptimizations(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public static final boolean systemDarkThemeOn(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$systemDarkThemeOn) {
        return false;
    }
    
    public static final boolean isDarkThemeOn(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public static final void makeEndIconSmaller(@org.jetbrains.annotations.NotNull()
    android.view.View $this$makeEndIconSmaller, @org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources) {
    }
    
    public static final void showRipple(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showRipple) {
    }
    
    public static final void hideRipple(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideRipple) {
    }
    
    public static final void ripple(@org.jetbrains.annotations.NotNull()
    android.view.View $this$ripple, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap readBitmapFromUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri $this$readBitmapFromUri, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap readBitmapFromUri(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$readBitmapFromUri, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap readBitmapFromUriOrNull(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$readBitmapFromUriOrNull, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File ensureSafeNewFile(@org.jetbrains.annotations.NotNull()
    java.io.File dir, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    public static final void copyToClipboard(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    io.heckel.ntfy.db.Notification notification) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String sha256(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$sha256) {
        return null;
    }
    
    public static final void dangerButton(@org.jetbrains.annotations.NotNull()
    android.widget.Button $this$dangerButton, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Long nullIfZero(long $this$nullIfZero) {
        return null;
    }
}