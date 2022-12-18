package io.heckel.ntfy.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class SubscriptionDao_Impl implements SubscriptionDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Subscription> __insertionAdapterOfSubscription;

  private final EntityDeletionOrUpdateAdapter<Subscription> __updateAdapterOfSubscription;

  private final SharedSQLiteStatement __preparedStmtOfUpdateLastNotificationId;

  private final SharedSQLiteStatement __preparedStmtOfRemove;

  public SubscriptionDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfSubscription = new EntityInsertionAdapter<Subscription>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Subscription` (`id`,`baseUrl`,`topic`,`instant`,`mutedUntil`,`minPriority`,`autoDelete`,`insistent`,`lastNotificationId`,`icon`,`upAppId`,`upConnectorToken`,`displayName`,`dedicatedChannels`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subscription value) {
        stmt.bindLong(1, value.getId());
        if (value.getBaseUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBaseUrl());
        }
        if (value.getTopic() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTopic());
        }
        final int _tmp = value.getInstant() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getMutedUntil());
        stmt.bindLong(6, value.getMinPriority());
        stmt.bindLong(7, value.getAutoDelete());
        stmt.bindLong(8, value.getInsistent());
        if (value.getLastNotificationId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLastNotificationId());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getIcon());
        }
        if (value.getUpAppId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUpAppId());
        }
        if (value.getUpConnectorToken() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getUpConnectorToken());
        }
        if (value.getDisplayName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDisplayName());
        }
        final int _tmp_1 = value.getDedicatedChannels() ? 1 : 0;
        stmt.bindLong(14, _tmp_1);
      }
    };
    this.__updateAdapterOfSubscription = new EntityDeletionOrUpdateAdapter<Subscription>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Subscription` SET `id` = ?,`baseUrl` = ?,`topic` = ?,`instant` = ?,`mutedUntil` = ?,`minPriority` = ?,`autoDelete` = ?,`insistent` = ?,`lastNotificationId` = ?,`icon` = ?,`upAppId` = ?,`upConnectorToken` = ?,`displayName` = ?,`dedicatedChannels` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Subscription value) {
        stmt.bindLong(1, value.getId());
        if (value.getBaseUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getBaseUrl());
        }
        if (value.getTopic() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTopic());
        }
        final int _tmp = value.getInstant() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getMutedUntil());
        stmt.bindLong(6, value.getMinPriority());
        stmt.bindLong(7, value.getAutoDelete());
        stmt.bindLong(8, value.getInsistent());
        if (value.getLastNotificationId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getLastNotificationId());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getIcon());
        }
        if (value.getUpAppId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getUpAppId());
        }
        if (value.getUpConnectorToken() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getUpConnectorToken());
        }
        if (value.getDisplayName() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDisplayName());
        }
        final int _tmp_1 = value.getDedicatedChannels() ? 1 : 0;
        stmt.bindLong(14, _tmp_1);
        stmt.bindLong(15, value.getId());
      }
    };
    this.__preparedStmtOfUpdateLastNotificationId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE subscription SET lastNotificationId = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemove = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM subscription WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public void add(final Subscription subscription) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfSubscription.insert(subscription);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Subscription subscription) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfSubscription.handle(subscription);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLastNotificationId(final long subscriptionId, final String lastNotificationId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateLastNotificationId.acquire();
    int _argIndex = 1;
    if (lastNotificationId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, lastNotificationId);
    }
    _argIndex = 2;
    _stmt.bindLong(_argIndex, subscriptionId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateLastNotificationId.release(_stmt);
    }
  }

  @Override
  public void remove(final long subscriptionId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemove.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, subscriptionId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemove.release(_stmt);
    }
  }

  @Override
  public Flow<List<SubscriptionWithMetadata>> listFlow() {
    final String _sql = "\n"
            + "        SELECT \n"
            + "          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n"
            + "          COUNT(n.id) totalCount, \n"
            + "          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n"
            + "          IFNULL(MAX(n.timestamp),0) AS lastActive\n"
            + "        FROM Subscription AS s\n"
            + "        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n"
            + "        GROUP BY s.id\n"
            + "        ORDER BY s.upAppId ASC, MAX(n.timestamp) DESC\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Subscription","Notification"}, new Callable<List<SubscriptionWithMetadata>>() {
      @Override
      public List<SubscriptionWithMetadata> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfBaseUrl = 1;
          final int _cursorIndexOfTopic = 2;
          final int _cursorIndexOfInstant = 3;
          final int _cursorIndexOfMutedUntil = 4;
          final int _cursorIndexOfMinPriority = 5;
          final int _cursorIndexOfAutoDelete = 6;
          final int _cursorIndexOfInsistent = 7;
          final int _cursorIndexOfLastNotificationId = 8;
          final int _cursorIndexOfIcon = 9;
          final int _cursorIndexOfUpAppId = 10;
          final int _cursorIndexOfUpConnectorToken = 11;
          final int _cursorIndexOfDisplayName = 12;
          final int _cursorIndexOfDedicatedChannels = 13;
          final int _cursorIndexOfTotalCount = 14;
          final int _cursorIndexOfNewCount = 15;
          final int _cursorIndexOfLastActive = 16;
          final List<SubscriptionWithMetadata> _result = new ArrayList<SubscriptionWithMetadata>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubscriptionWithMetadata _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpBaseUrl;
            if (_cursor.isNull(_cursorIndexOfBaseUrl)) {
              _tmpBaseUrl = null;
            } else {
              _tmpBaseUrl = _cursor.getString(_cursorIndexOfBaseUrl);
            }
            final String _tmpTopic;
            if (_cursor.isNull(_cursorIndexOfTopic)) {
              _tmpTopic = null;
            } else {
              _tmpTopic = _cursor.getString(_cursorIndexOfTopic);
            }
            final boolean _tmpInstant;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfInstant);
            _tmpInstant = _tmp != 0;
            final long _tmpMutedUntil;
            _tmpMutedUntil = _cursor.getLong(_cursorIndexOfMutedUntil);
            final int _tmpMinPriority;
            _tmpMinPriority = _cursor.getInt(_cursorIndexOfMinPriority);
            final long _tmpAutoDelete;
            _tmpAutoDelete = _cursor.getLong(_cursorIndexOfAutoDelete);
            final int _tmpInsistent;
            _tmpInsistent = _cursor.getInt(_cursorIndexOfInsistent);
            final String _tmpLastNotificationId;
            if (_cursor.isNull(_cursorIndexOfLastNotificationId)) {
              _tmpLastNotificationId = null;
            } else {
              _tmpLastNotificationId = _cursor.getString(_cursorIndexOfLastNotificationId);
            }
            final String _tmpIcon;
            if (_cursor.isNull(_cursorIndexOfIcon)) {
              _tmpIcon = null;
            } else {
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            }
            final String _tmpUpAppId;
            if (_cursor.isNull(_cursorIndexOfUpAppId)) {
              _tmpUpAppId = null;
            } else {
              _tmpUpAppId = _cursor.getString(_cursorIndexOfUpAppId);
            }
            final String _tmpUpConnectorToken;
            if (_cursor.isNull(_cursorIndexOfUpConnectorToken)) {
              _tmpUpConnectorToken = null;
            } else {
              _tmpUpConnectorToken = _cursor.getString(_cursorIndexOfUpConnectorToken);
            }
            final String _tmpDisplayName;
            if (_cursor.isNull(_cursorIndexOfDisplayName)) {
              _tmpDisplayName = null;
            } else {
              _tmpDisplayName = _cursor.getString(_cursorIndexOfDisplayName);
            }
            final boolean _tmpDedicatedChannels;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDedicatedChannels);
            _tmpDedicatedChannels = _tmp_1 != 0;
            final int _tmpTotalCount;
            _tmpTotalCount = _cursor.getInt(_cursorIndexOfTotalCount);
            final int _tmpNewCount;
            _tmpNewCount = _cursor.getInt(_cursorIndexOfNewCount);
            final long _tmpLastActive;
            _tmpLastActive = _cursor.getLong(_cursorIndexOfLastActive);
            _item = new SubscriptionWithMetadata(_tmpId,_tmpBaseUrl,_tmpTopic,_tmpInstant,_tmpMutedUntil,_tmpAutoDelete,_tmpMinPriority,_tmpInsistent,_tmpLastNotificationId,_tmpIcon,_tmpUpAppId,_tmpUpConnectorToken,_tmpDisplayName,_tmpDedicatedChannels,_tmpTotalCount,_tmpNewCount,_tmpLastActive);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object list(final Continuation<? super List<SubscriptionWithMetadata>> continuation) {
    final String _sql = "\n"
            + "        SELECT \n"
            + "          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n"
            + "          COUNT(n.id) totalCount, \n"
            + "          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n"
            + "          IFNULL(MAX(n.timestamp),0) AS lastActive\n"
            + "        FROM Subscription AS s\n"
            + "        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n"
            + "        GROUP BY s.id\n"
            + "        ORDER BY s.upAppId ASC, MAX(n.timestamp) DESC\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<SubscriptionWithMetadata>>() {
      @Override
      public List<SubscriptionWithMetadata> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = 0;
          final int _cursorIndexOfBaseUrl = 1;
          final int _cursorIndexOfTopic = 2;
          final int _cursorIndexOfInstant = 3;
          final int _cursorIndexOfMutedUntil = 4;
          final int _cursorIndexOfMinPriority = 5;
          final int _cursorIndexOfAutoDelete = 6;
          final int _cursorIndexOfInsistent = 7;
          final int _cursorIndexOfLastNotificationId = 8;
          final int _cursorIndexOfIcon = 9;
          final int _cursorIndexOfUpAppId = 10;
          final int _cursorIndexOfUpConnectorToken = 11;
          final int _cursorIndexOfDisplayName = 12;
          final int _cursorIndexOfDedicatedChannels = 13;
          final int _cursorIndexOfTotalCount = 14;
          final int _cursorIndexOfNewCount = 15;
          final int _cursorIndexOfLastActive = 16;
          final List<SubscriptionWithMetadata> _result = new ArrayList<SubscriptionWithMetadata>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final SubscriptionWithMetadata _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpBaseUrl;
            if (_cursor.isNull(_cursorIndexOfBaseUrl)) {
              _tmpBaseUrl = null;
            } else {
              _tmpBaseUrl = _cursor.getString(_cursorIndexOfBaseUrl);
            }
            final String _tmpTopic;
            if (_cursor.isNull(_cursorIndexOfTopic)) {
              _tmpTopic = null;
            } else {
              _tmpTopic = _cursor.getString(_cursorIndexOfTopic);
            }
            final boolean _tmpInstant;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfInstant);
            _tmpInstant = _tmp != 0;
            final long _tmpMutedUntil;
            _tmpMutedUntil = _cursor.getLong(_cursorIndexOfMutedUntil);
            final int _tmpMinPriority;
            _tmpMinPriority = _cursor.getInt(_cursorIndexOfMinPriority);
            final long _tmpAutoDelete;
            _tmpAutoDelete = _cursor.getLong(_cursorIndexOfAutoDelete);
            final int _tmpInsistent;
            _tmpInsistent = _cursor.getInt(_cursorIndexOfInsistent);
            final String _tmpLastNotificationId;
            if (_cursor.isNull(_cursorIndexOfLastNotificationId)) {
              _tmpLastNotificationId = null;
            } else {
              _tmpLastNotificationId = _cursor.getString(_cursorIndexOfLastNotificationId);
            }
            final String _tmpIcon;
            if (_cursor.isNull(_cursorIndexOfIcon)) {
              _tmpIcon = null;
            } else {
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            }
            final String _tmpUpAppId;
            if (_cursor.isNull(_cursorIndexOfUpAppId)) {
              _tmpUpAppId = null;
            } else {
              _tmpUpAppId = _cursor.getString(_cursorIndexOfUpAppId);
            }
            final String _tmpUpConnectorToken;
            if (_cursor.isNull(_cursorIndexOfUpConnectorToken)) {
              _tmpUpConnectorToken = null;
            } else {
              _tmpUpConnectorToken = _cursor.getString(_cursorIndexOfUpConnectorToken);
            }
            final String _tmpDisplayName;
            if (_cursor.isNull(_cursorIndexOfDisplayName)) {
              _tmpDisplayName = null;
            } else {
              _tmpDisplayName = _cursor.getString(_cursorIndexOfDisplayName);
            }
            final boolean _tmpDedicatedChannels;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDedicatedChannels);
            _tmpDedicatedChannels = _tmp_1 != 0;
            final int _tmpTotalCount;
            _tmpTotalCount = _cursor.getInt(_cursorIndexOfTotalCount);
            final int _tmpNewCount;
            _tmpNewCount = _cursor.getInt(_cursorIndexOfNewCount);
            final long _tmpLastActive;
            _tmpLastActive = _cursor.getLong(_cursorIndexOfLastActive);
            _item = new SubscriptionWithMetadata(_tmpId,_tmpBaseUrl,_tmpTopic,_tmpInstant,_tmpMutedUntil,_tmpAutoDelete,_tmpMinPriority,_tmpInsistent,_tmpLastNotificationId,_tmpIcon,_tmpUpAppId,_tmpUpConnectorToken,_tmpDisplayName,_tmpDedicatedChannels,_tmpTotalCount,_tmpNewCount,_tmpLastActive);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public SubscriptionWithMetadata get(final String baseUrl, final String topic) {
    final String _sql = "\n"
            + "        SELECT \n"
            + "          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n"
            + "          COUNT(n.id) totalCount, \n"
            + "          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n"
            + "          IFNULL(MAX(n.timestamp),0) AS lastActive\n"
            + "        FROM Subscription AS s\n"
            + "        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n"
            + "        WHERE s.baseUrl = ? AND s.topic = ?\n"
            + "        GROUP BY s.id\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (baseUrl == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, baseUrl);
    }
    _argIndex = 2;
    if (topic == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, topic);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfBaseUrl = 1;
      final int _cursorIndexOfTopic = 2;
      final int _cursorIndexOfInstant = 3;
      final int _cursorIndexOfMutedUntil = 4;
      final int _cursorIndexOfMinPriority = 5;
      final int _cursorIndexOfAutoDelete = 6;
      final int _cursorIndexOfInsistent = 7;
      final int _cursorIndexOfLastNotificationId = 8;
      final int _cursorIndexOfIcon = 9;
      final int _cursorIndexOfUpAppId = 10;
      final int _cursorIndexOfUpConnectorToken = 11;
      final int _cursorIndexOfDisplayName = 12;
      final int _cursorIndexOfDedicatedChannels = 13;
      final int _cursorIndexOfTotalCount = 14;
      final int _cursorIndexOfNewCount = 15;
      final int _cursorIndexOfLastActive = 16;
      final SubscriptionWithMetadata _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpBaseUrl;
        if (_cursor.isNull(_cursorIndexOfBaseUrl)) {
          _tmpBaseUrl = null;
        } else {
          _tmpBaseUrl = _cursor.getString(_cursorIndexOfBaseUrl);
        }
        final String _tmpTopic;
        if (_cursor.isNull(_cursorIndexOfTopic)) {
          _tmpTopic = null;
        } else {
          _tmpTopic = _cursor.getString(_cursorIndexOfTopic);
        }
        final boolean _tmpInstant;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfInstant);
        _tmpInstant = _tmp != 0;
        final long _tmpMutedUntil;
        _tmpMutedUntil = _cursor.getLong(_cursorIndexOfMutedUntil);
        final int _tmpMinPriority;
        _tmpMinPriority = _cursor.getInt(_cursorIndexOfMinPriority);
        final long _tmpAutoDelete;
        _tmpAutoDelete = _cursor.getLong(_cursorIndexOfAutoDelete);
        final int _tmpInsistent;
        _tmpInsistent = _cursor.getInt(_cursorIndexOfInsistent);
        final String _tmpLastNotificationId;
        if (_cursor.isNull(_cursorIndexOfLastNotificationId)) {
          _tmpLastNotificationId = null;
        } else {
          _tmpLastNotificationId = _cursor.getString(_cursorIndexOfLastNotificationId);
        }
        final String _tmpIcon;
        if (_cursor.isNull(_cursorIndexOfIcon)) {
          _tmpIcon = null;
        } else {
          _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
        }
        final String _tmpUpAppId;
        if (_cursor.isNull(_cursorIndexOfUpAppId)) {
          _tmpUpAppId = null;
        } else {
          _tmpUpAppId = _cursor.getString(_cursorIndexOfUpAppId);
        }
        final String _tmpUpConnectorToken;
        if (_cursor.isNull(_cursorIndexOfUpConnectorToken)) {
          _tmpUpConnectorToken = null;
        } else {
          _tmpUpConnectorToken = _cursor.getString(_cursorIndexOfUpConnectorToken);
        }
        final String _tmpDisplayName;
        if (_cursor.isNull(_cursorIndexOfDisplayName)) {
          _tmpDisplayName = null;
        } else {
          _tmpDisplayName = _cursor.getString(_cursorIndexOfDisplayName);
        }
        final boolean _tmpDedicatedChannels;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDedicatedChannels);
        _tmpDedicatedChannels = _tmp_1 != 0;
        final int _tmpTotalCount;
        _tmpTotalCount = _cursor.getInt(_cursorIndexOfTotalCount);
        final int _tmpNewCount;
        _tmpNewCount = _cursor.getInt(_cursorIndexOfNewCount);
        final long _tmpLastActive;
        _tmpLastActive = _cursor.getLong(_cursorIndexOfLastActive);
        _result = new SubscriptionWithMetadata(_tmpId,_tmpBaseUrl,_tmpTopic,_tmpInstant,_tmpMutedUntil,_tmpAutoDelete,_tmpMinPriority,_tmpInsistent,_tmpLastNotificationId,_tmpIcon,_tmpUpAppId,_tmpUpConnectorToken,_tmpDisplayName,_tmpDedicatedChannels,_tmpTotalCount,_tmpNewCount,_tmpLastActive);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SubscriptionWithMetadata get(final long subscriptionId) {
    final String _sql = "\n"
            + "        SELECT \n"
            + "          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n"
            + "          COUNT(n.id) totalCount, \n"
            + "          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n"
            + "          IFNULL(MAX(n.timestamp),0) AS lastActive\n"
            + "        FROM Subscription AS s\n"
            + "        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n"
            + "        WHERE s.id = ?\n"
            + "        GROUP BY s.id\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, subscriptionId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfBaseUrl = 1;
      final int _cursorIndexOfTopic = 2;
      final int _cursorIndexOfInstant = 3;
      final int _cursorIndexOfMutedUntil = 4;
      final int _cursorIndexOfMinPriority = 5;
      final int _cursorIndexOfAutoDelete = 6;
      final int _cursorIndexOfInsistent = 7;
      final int _cursorIndexOfLastNotificationId = 8;
      final int _cursorIndexOfIcon = 9;
      final int _cursorIndexOfUpAppId = 10;
      final int _cursorIndexOfUpConnectorToken = 11;
      final int _cursorIndexOfDisplayName = 12;
      final int _cursorIndexOfDedicatedChannels = 13;
      final int _cursorIndexOfTotalCount = 14;
      final int _cursorIndexOfNewCount = 15;
      final int _cursorIndexOfLastActive = 16;
      final SubscriptionWithMetadata _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpBaseUrl;
        if (_cursor.isNull(_cursorIndexOfBaseUrl)) {
          _tmpBaseUrl = null;
        } else {
          _tmpBaseUrl = _cursor.getString(_cursorIndexOfBaseUrl);
        }
        final String _tmpTopic;
        if (_cursor.isNull(_cursorIndexOfTopic)) {
          _tmpTopic = null;
        } else {
          _tmpTopic = _cursor.getString(_cursorIndexOfTopic);
        }
        final boolean _tmpInstant;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfInstant);
        _tmpInstant = _tmp != 0;
        final long _tmpMutedUntil;
        _tmpMutedUntil = _cursor.getLong(_cursorIndexOfMutedUntil);
        final int _tmpMinPriority;
        _tmpMinPriority = _cursor.getInt(_cursorIndexOfMinPriority);
        final long _tmpAutoDelete;
        _tmpAutoDelete = _cursor.getLong(_cursorIndexOfAutoDelete);
        final int _tmpInsistent;
        _tmpInsistent = _cursor.getInt(_cursorIndexOfInsistent);
        final String _tmpLastNotificationId;
        if (_cursor.isNull(_cursorIndexOfLastNotificationId)) {
          _tmpLastNotificationId = null;
        } else {
          _tmpLastNotificationId = _cursor.getString(_cursorIndexOfLastNotificationId);
        }
        final String _tmpIcon;
        if (_cursor.isNull(_cursorIndexOfIcon)) {
          _tmpIcon = null;
        } else {
          _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
        }
        final String _tmpUpAppId;
        if (_cursor.isNull(_cursorIndexOfUpAppId)) {
          _tmpUpAppId = null;
        } else {
          _tmpUpAppId = _cursor.getString(_cursorIndexOfUpAppId);
        }
        final String _tmpUpConnectorToken;
        if (_cursor.isNull(_cursorIndexOfUpConnectorToken)) {
          _tmpUpConnectorToken = null;
        } else {
          _tmpUpConnectorToken = _cursor.getString(_cursorIndexOfUpConnectorToken);
        }
        final String _tmpDisplayName;
        if (_cursor.isNull(_cursorIndexOfDisplayName)) {
          _tmpDisplayName = null;
        } else {
          _tmpDisplayName = _cursor.getString(_cursorIndexOfDisplayName);
        }
        final boolean _tmpDedicatedChannels;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDedicatedChannels);
        _tmpDedicatedChannels = _tmp_1 != 0;
        final int _tmpTotalCount;
        _tmpTotalCount = _cursor.getInt(_cursorIndexOfTotalCount);
        final int _tmpNewCount;
        _tmpNewCount = _cursor.getInt(_cursorIndexOfNewCount);
        final long _tmpLastActive;
        _tmpLastActive = _cursor.getLong(_cursorIndexOfLastActive);
        _result = new SubscriptionWithMetadata(_tmpId,_tmpBaseUrl,_tmpTopic,_tmpInstant,_tmpMutedUntil,_tmpAutoDelete,_tmpMinPriority,_tmpInsistent,_tmpLastNotificationId,_tmpIcon,_tmpUpAppId,_tmpUpConnectorToken,_tmpDisplayName,_tmpDedicatedChannels,_tmpTotalCount,_tmpNewCount,_tmpLastActive);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SubscriptionWithMetadata getByConnectorToken(final String connectorToken) {
    final String _sql = "\n"
            + "        SELECT \n"
            + "          s.id, s.baseUrl, s.topic, s.instant, s.mutedUntil, s.minPriority, s.autoDelete, s.insistent, s.lastNotificationId, s.icon, s.upAppId, s.upConnectorToken, s.displayName, s.dedicatedChannels,\n"
            + "          COUNT(n.id) totalCount, \n"
            + "          COUNT(CASE n.notificationId WHEN 0 THEN NULL ELSE n.id END) newCount, \n"
            + "          IFNULL(MAX(n.timestamp),0) AS lastActive\n"
            + "        FROM Subscription AS s\n"
            + "        LEFT JOIN Notification AS n ON s.id=n.subscriptionId AND n.deleted != 1\n"
            + "        WHERE s.upConnectorToken = ?\n"
            + "        GROUP BY s.id\n"
            + "    ";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (connectorToken == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, connectorToken);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = 0;
      final int _cursorIndexOfBaseUrl = 1;
      final int _cursorIndexOfTopic = 2;
      final int _cursorIndexOfInstant = 3;
      final int _cursorIndexOfMutedUntil = 4;
      final int _cursorIndexOfMinPriority = 5;
      final int _cursorIndexOfAutoDelete = 6;
      final int _cursorIndexOfInsistent = 7;
      final int _cursorIndexOfLastNotificationId = 8;
      final int _cursorIndexOfIcon = 9;
      final int _cursorIndexOfUpAppId = 10;
      final int _cursorIndexOfUpConnectorToken = 11;
      final int _cursorIndexOfDisplayName = 12;
      final int _cursorIndexOfDedicatedChannels = 13;
      final int _cursorIndexOfTotalCount = 14;
      final int _cursorIndexOfNewCount = 15;
      final int _cursorIndexOfLastActive = 16;
      final SubscriptionWithMetadata _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpBaseUrl;
        if (_cursor.isNull(_cursorIndexOfBaseUrl)) {
          _tmpBaseUrl = null;
        } else {
          _tmpBaseUrl = _cursor.getString(_cursorIndexOfBaseUrl);
        }
        final String _tmpTopic;
        if (_cursor.isNull(_cursorIndexOfTopic)) {
          _tmpTopic = null;
        } else {
          _tmpTopic = _cursor.getString(_cursorIndexOfTopic);
        }
        final boolean _tmpInstant;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfInstant);
        _tmpInstant = _tmp != 0;
        final long _tmpMutedUntil;
        _tmpMutedUntil = _cursor.getLong(_cursorIndexOfMutedUntil);
        final int _tmpMinPriority;
        _tmpMinPriority = _cursor.getInt(_cursorIndexOfMinPriority);
        final long _tmpAutoDelete;
        _tmpAutoDelete = _cursor.getLong(_cursorIndexOfAutoDelete);
        final int _tmpInsistent;
        _tmpInsistent = _cursor.getInt(_cursorIndexOfInsistent);
        final String _tmpLastNotificationId;
        if (_cursor.isNull(_cursorIndexOfLastNotificationId)) {
          _tmpLastNotificationId = null;
        } else {
          _tmpLastNotificationId = _cursor.getString(_cursorIndexOfLastNotificationId);
        }
        final String _tmpIcon;
        if (_cursor.isNull(_cursorIndexOfIcon)) {
          _tmpIcon = null;
        } else {
          _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
        }
        final String _tmpUpAppId;
        if (_cursor.isNull(_cursorIndexOfUpAppId)) {
          _tmpUpAppId = null;
        } else {
          _tmpUpAppId = _cursor.getString(_cursorIndexOfUpAppId);
        }
        final String _tmpUpConnectorToken;
        if (_cursor.isNull(_cursorIndexOfUpConnectorToken)) {
          _tmpUpConnectorToken = null;
        } else {
          _tmpUpConnectorToken = _cursor.getString(_cursorIndexOfUpConnectorToken);
        }
        final String _tmpDisplayName;
        if (_cursor.isNull(_cursorIndexOfDisplayName)) {
          _tmpDisplayName = null;
        } else {
          _tmpDisplayName = _cursor.getString(_cursorIndexOfDisplayName);
        }
        final boolean _tmpDedicatedChannels;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDedicatedChannels);
        _tmpDedicatedChannels = _tmp_1 != 0;
        final int _tmpTotalCount;
        _tmpTotalCount = _cursor.getInt(_cursorIndexOfTotalCount);
        final int _tmpNewCount;
        _tmpNewCount = _cursor.getInt(_cursorIndexOfNewCount);
        final long _tmpLastActive;
        _tmpLastActive = _cursor.getLong(_cursorIndexOfLastActive);
        _result = new SubscriptionWithMetadata(_tmpId,_tmpBaseUrl,_tmpTopic,_tmpInstant,_tmpMutedUntil,_tmpAutoDelete,_tmpMinPriority,_tmpInsistent,_tmpLastNotificationId,_tmpIcon,_tmpUpAppId,_tmpUpConnectorToken,_tmpDisplayName,_tmpDedicatedChannels,_tmpTotalCount,_tmpNewCount,_tmpLastActive);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
