package io.heckel.ntfy.db;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Database_Impl extends Database {
  private volatile SubscriptionDao _subscriptionDao;

  private volatile NotificationDao _notificationDao;

  private volatile UserDao _userDao;

  private volatile LogDao _logDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(13) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Subscription` (`id` INTEGER NOT NULL, `baseUrl` TEXT NOT NULL, `topic` TEXT NOT NULL, `instant` INTEGER NOT NULL, `mutedUntil` INTEGER NOT NULL, `minPriority` INTEGER NOT NULL, `autoDelete` INTEGER NOT NULL, `insistent` INTEGER NOT NULL, `lastNotificationId` TEXT, `icon` TEXT, `upAppId` TEXT, `upConnectorToken` TEXT, `displayName` TEXT, `dedicatedChannels` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Subscription_baseUrl_topic` ON `Subscription` (`baseUrl`, `topic`)");
        _db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Subscription_upConnectorToken` ON `Subscription` (`upConnectorToken`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Notification` (`id` TEXT NOT NULL, `subscriptionId` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `encoding` TEXT NOT NULL, `notificationId` INTEGER NOT NULL, `priority` INTEGER NOT NULL DEFAULT 3, `tags` TEXT NOT NULL, `click` TEXT NOT NULL, `actions` TEXT, `deleted` INTEGER NOT NULL, `icon_url` TEXT, `icon_contentUri` TEXT, `attachment_name` TEXT, `attachment_type` TEXT, `attachment_size` INTEGER, `attachment_expires` INTEGER, `attachment_url` TEXT, `attachment_contentUri` TEXT, `attachment_progress` INTEGER, PRIMARY KEY(`id`, `subscriptionId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `User` (`baseUrl` TEXT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL, PRIMARY KEY(`baseUrl`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Log` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `tag` TEXT NOT NULL, `level` INTEGER NOT NULL, `message` TEXT NOT NULL, `exception` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '44fc291d937fdf02b9bc2d0abb10d2e0')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Subscription`");
        _db.execSQL("DROP TABLE IF EXISTS `Notification`");
        _db.execSQL("DROP TABLE IF EXISTS `User`");
        _db.execSQL("DROP TABLE IF EXISTS `Log`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsSubscription = new HashMap<String, TableInfo.Column>(14);
        _columnsSubscription.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("baseUrl", new TableInfo.Column("baseUrl", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("topic", new TableInfo.Column("topic", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("instant", new TableInfo.Column("instant", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("mutedUntil", new TableInfo.Column("mutedUntil", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("minPriority", new TableInfo.Column("minPriority", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("autoDelete", new TableInfo.Column("autoDelete", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("insistent", new TableInfo.Column("insistent", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("lastNotificationId", new TableInfo.Column("lastNotificationId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("icon", new TableInfo.Column("icon", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("upAppId", new TableInfo.Column("upAppId", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("upConnectorToken", new TableInfo.Column("upConnectorToken", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("displayName", new TableInfo.Column("displayName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsSubscription.put("dedicatedChannels", new TableInfo.Column("dedicatedChannels", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysSubscription = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesSubscription = new HashSet<TableInfo.Index>(2);
        _indicesSubscription.add(new TableInfo.Index("index_Subscription_baseUrl_topic", true, Arrays.asList("baseUrl","topic"), Arrays.asList("ASC","ASC")));
        _indicesSubscription.add(new TableInfo.Index("index_Subscription_upConnectorToken", true, Arrays.asList("upConnectorToken"), Arrays.asList("ASC")));
        final TableInfo _infoSubscription = new TableInfo("Subscription", _columnsSubscription, _foreignKeysSubscription, _indicesSubscription);
        final TableInfo _existingSubscription = TableInfo.read(_db, "Subscription");
        if (! _infoSubscription.equals(_existingSubscription)) {
          return new RoomOpenHelper.ValidationResult(false, "Subscription(io.heckel.ntfy.db.Subscription).\n"
                  + " Expected:\n" + _infoSubscription + "\n"
                  + " Found:\n" + _existingSubscription);
        }
        final HashMap<String, TableInfo.Column> _columnsNotification = new HashMap<String, TableInfo.Column>(21);
        _columnsNotification.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("subscriptionId", new TableInfo.Column("subscriptionId", "INTEGER", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("encoding", new TableInfo.Column("encoding", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("notificationId", new TableInfo.Column("notificationId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, "3", TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("tags", new TableInfo.Column("tags", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("click", new TableInfo.Column("click", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("actions", new TableInfo.Column("actions", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("deleted", new TableInfo.Column("deleted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("icon_url", new TableInfo.Column("icon_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("icon_contentUri", new TableInfo.Column("icon_contentUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("attachment_name", new TableInfo.Column("attachment_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("attachment_type", new TableInfo.Column("attachment_type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("attachment_size", new TableInfo.Column("attachment_size", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("attachment_expires", new TableInfo.Column("attachment_expires", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("attachment_url", new TableInfo.Column("attachment_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("attachment_contentUri", new TableInfo.Column("attachment_contentUri", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("attachment_progress", new TableInfo.Column("attachment_progress", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNotification = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNotification = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNotification = new TableInfo("Notification", _columnsNotification, _foreignKeysNotification, _indicesNotification);
        final TableInfo _existingNotification = TableInfo.read(_db, "Notification");
        if (! _infoNotification.equals(_existingNotification)) {
          return new RoomOpenHelper.ValidationResult(false, "Notification(io.heckel.ntfy.db.Notification).\n"
                  + " Expected:\n" + _infoNotification + "\n"
                  + " Found:\n" + _existingNotification);
        }
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(3);
        _columnsUser.put("baseUrl", new TableInfo.Column("baseUrl", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("username", new TableInfo.Column("username", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("password", new TableInfo.Column("password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("User", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "User");
        if (! _infoUser.equals(_existingUser)) {
          return new RoomOpenHelper.ValidationResult(false, "User(io.heckel.ntfy.db.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        final HashMap<String, TableInfo.Column> _columnsLog = new HashMap<String, TableInfo.Column>(6);
        _columnsLog.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLog.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLog.put("tag", new TableInfo.Column("tag", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLog.put("level", new TableInfo.Column("level", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLog.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLog.put("exception", new TableInfo.Column("exception", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLog = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLog = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLog = new TableInfo("Log", _columnsLog, _foreignKeysLog, _indicesLog);
        final TableInfo _existingLog = TableInfo.read(_db, "Log");
        if (! _infoLog.equals(_existingLog)) {
          return new RoomOpenHelper.ValidationResult(false, "Log(io.heckel.ntfy.db.LogEntry).\n"
                  + " Expected:\n" + _infoLog + "\n"
                  + " Found:\n" + _existingLog);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "44fc291d937fdf02b9bc2d0abb10d2e0", "aa31a648b2d6eb6f23dfa4dbae1a71e8");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Subscription","Notification","User","Log");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Subscription`");
      _db.execSQL("DELETE FROM `Notification`");
      _db.execSQL("DELETE FROM `User`");
      _db.execSQL("DELETE FROM `Log`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(SubscriptionDao.class, SubscriptionDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(NotificationDao.class, NotificationDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(LogDao.class, LogDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public SubscriptionDao subscriptionDao() {
    if (_subscriptionDao != null) {
      return _subscriptionDao;
    } else {
      synchronized(this) {
        if(_subscriptionDao == null) {
          _subscriptionDao = new SubscriptionDao_Impl(this);
        }
        return _subscriptionDao;
      }
    }
  }

  @Override
  public NotificationDao notificationDao() {
    if (_notificationDao != null) {
      return _notificationDao;
    } else {
      synchronized(this) {
        if(_notificationDao == null) {
          _notificationDao = new NotificationDao_Impl(this);
        }
        return _notificationDao;
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public LogDao logDao() {
    if (_logDao != null) {
      return _logDao;
    } else {
      synchronized(this) {
        if(_logDao == null) {
          _logDao = new LogDao_Impl(this);
        }
        return _logDao;
      }
    }
  }
}
