package io.heckel.ntfy.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {io.heckel.ntfy.db.Converters.class})
@androidx.room.Database(entities = {io.heckel.ntfy.db.Subscription.class, io.heckel.ntfy.db.Notification.class, io.heckel.ntfy.db.User.class, io.heckel.ntfy.db.LogEntry.class}, version = 13)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lio/heckel/ntfy/db/Database;", "Landroidx/room/RoomDatabase;", "()V", "logDao", "Lio/heckel/ntfy/db/LogDao;", "notificationDao", "Lio/heckel/ntfy/db/NotificationDao;", "subscriptionDao", "Lio/heckel/ntfy/db/SubscriptionDao;", "userDao", "Lio/heckel/ntfy/db/UserDao;", "Companion", "app_fdroidRelease"})
public abstract class Database extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final io.heckel.ntfy.db.Database.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile io.heckel.ntfy.db.Database instance;
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    private static final androidx.room.migration.Migration MIGRATION_3_4 = null;
    private static final androidx.room.migration.Migration MIGRATION_4_5 = null;
    private static final androidx.room.migration.Migration MIGRATION_5_6 = null;
    private static final androidx.room.migration.Migration MIGRATION_6_7 = null;
    private static final androidx.room.migration.Migration MIGRATION_7_8 = null;
    private static final androidx.room.migration.Migration MIGRATION_8_9 = null;
    private static final androidx.room.migration.Migration MIGRATION_9_10 = null;
    private static final androidx.room.migration.Migration MIGRATION_10_11 = null;
    private static final androidx.room.migration.Migration MIGRATION_11_12 = null;
    private static final androidx.room.migration.Migration MIGRATION_12_13 = null;
    
    public Database() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.heckel.ntfy.db.SubscriptionDao subscriptionDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.heckel.ntfy.db.NotificationDao notificationDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.heckel.ntfy.db.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.heckel.ntfy.db.LogDao logDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lio/heckel/ntfy/db/Database$Companion;", "", "()V", "MIGRATION_10_11", "Landroidx/room/migration/Migration;", "MIGRATION_11_12", "MIGRATION_12_13", "MIGRATION_1_2", "MIGRATION_2_3", "MIGRATION_3_4", "MIGRATION_4_5", "MIGRATION_5_6", "MIGRATION_6_7", "MIGRATION_7_8", "MIGRATION_8_9", "MIGRATION_9_10", "instance", "Lio/heckel/ntfy/db/Database;", "getInstance", "context", "Landroid/content/Context;", "app_fdroidRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final io.heckel.ntfy.db.Database getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}