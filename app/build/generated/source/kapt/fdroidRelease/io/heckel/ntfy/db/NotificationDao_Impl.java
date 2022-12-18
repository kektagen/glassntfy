package io.heckel.ntfy.db;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
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
public final class NotificationDao_Impl implements NotificationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Notification> __insertionAdapterOfNotification;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter<Notification> __updateAdapterOfNotification;

  private final SharedSQLiteStatement __preparedStmtOfClearIconUri;

  private final SharedSQLiteStatement __preparedStmtOfClearAllNotificationIds;

  private final SharedSQLiteStatement __preparedStmtOfMarkAsDeleted;

  private final SharedSQLiteStatement __preparedStmtOfMarkAllAsDeleted;

  private final SharedSQLiteStatement __preparedStmtOfMarkAsDeletedIfOlderThan;

  private final SharedSQLiteStatement __preparedStmtOfUndelete;

  private final SharedSQLiteStatement __preparedStmtOfRemoveIfOlderThan;

  private final SharedSQLiteStatement __preparedStmtOfRemoveAll;

  public NotificationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNotification = new EntityInsertionAdapter<Notification>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Notification` (`id`,`subscriptionId`,`timestamp`,`title`,`message`,`encoding`,`notificationId`,`priority`,`tags`,`click`,`actions`,`deleted`,`icon_url`,`icon_contentUri`,`attachment_name`,`attachment_type`,`attachment_size`,`attachment_expires`,`attachment_url`,`attachment_contentUri`,`attachment_progress`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Notification value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getSubscriptionId());
        stmt.bindLong(3, value.getTimestamp());
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getMessage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMessage());
        }
        if (value.getEncoding() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEncoding());
        }
        stmt.bindLong(7, value.getNotificationId());
        stmt.bindLong(8, value.getPriority());
        if (value.getTags() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTags());
        }
        if (value.getClick() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getClick());
        }
        final String _tmp = __converters.fromActionList(value.getActions());
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp);
        }
        final int _tmp_1 = value.getDeleted() ? 1 : 0;
        stmt.bindLong(12, _tmp_1);
        final Icon _tmpIcon = value.getIcon();
        if(_tmpIcon != null) {
          if (_tmpIcon.getUrl() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpIcon.getUrl());
          }
          if (_tmpIcon.getContentUri() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpIcon.getContentUri());
          }
        } else {
          stmt.bindNull(13);
          stmt.bindNull(14);
        }
        final Attachment _tmpAttachment = value.getAttachment();
        if(_tmpAttachment != null) {
          if (_tmpAttachment.getName() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpAttachment.getName());
          }
          if (_tmpAttachment.getType() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpAttachment.getType());
          }
          if (_tmpAttachment.getSize() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindLong(17, _tmpAttachment.getSize());
          }
          if (_tmpAttachment.getExpires() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindLong(18, _tmpAttachment.getExpires());
          }
          if (_tmpAttachment.getUrl() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindString(19, _tmpAttachment.getUrl());
          }
          if (_tmpAttachment.getContentUri() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpAttachment.getContentUri());
          }
          stmt.bindLong(21, _tmpAttachment.getProgress());
        } else {
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
          stmt.bindNull(21);
        }
      }
    };
    this.__updateAdapterOfNotification = new EntityDeletionOrUpdateAdapter<Notification>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR IGNORE `Notification` SET `id` = ?,`subscriptionId` = ?,`timestamp` = ?,`title` = ?,`message` = ?,`encoding` = ?,`notificationId` = ?,`priority` = ?,`tags` = ?,`click` = ?,`actions` = ?,`deleted` = ?,`icon_url` = ?,`icon_contentUri` = ?,`attachment_name` = ?,`attachment_type` = ?,`attachment_size` = ?,`attachment_expires` = ?,`attachment_url` = ?,`attachment_contentUri` = ?,`attachment_progress` = ? WHERE `id` = ? AND `subscriptionId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Notification value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getSubscriptionId());
        stmt.bindLong(3, value.getTimestamp());
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
        if (value.getMessage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMessage());
        }
        if (value.getEncoding() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getEncoding());
        }
        stmt.bindLong(7, value.getNotificationId());
        stmt.bindLong(8, value.getPriority());
        if (value.getTags() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getTags());
        }
        if (value.getClick() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getClick());
        }
        final String _tmp = __converters.fromActionList(value.getActions());
        if (_tmp == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp);
        }
        final int _tmp_1 = value.getDeleted() ? 1 : 0;
        stmt.bindLong(12, _tmp_1);
        final Icon _tmpIcon = value.getIcon();
        if(_tmpIcon != null) {
          if (_tmpIcon.getUrl() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpIcon.getUrl());
          }
          if (_tmpIcon.getContentUri() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpIcon.getContentUri());
          }
        } else {
          stmt.bindNull(13);
          stmt.bindNull(14);
        }
        final Attachment _tmpAttachment = value.getAttachment();
        if(_tmpAttachment != null) {
          if (_tmpAttachment.getName() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpAttachment.getName());
          }
          if (_tmpAttachment.getType() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpAttachment.getType());
          }
          if (_tmpAttachment.getSize() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindLong(17, _tmpAttachment.getSize());
          }
          if (_tmpAttachment.getExpires() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindLong(18, _tmpAttachment.getExpires());
          }
          if (_tmpAttachment.getUrl() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindString(19, _tmpAttachment.getUrl());
          }
          if (_tmpAttachment.getContentUri() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpAttachment.getContentUri());
          }
          stmt.bindLong(21, _tmpAttachment.getProgress());
        } else {
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
          stmt.bindNull(20);
          stmt.bindNull(21);
        }
        if (value.getId() == null) {
          stmt.bindNull(22);
        } else {
          stmt.bindString(22, value.getId());
        }
        stmt.bindLong(23, value.getSubscriptionId());
      }
    };
    this.__preparedStmtOfClearIconUri = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE notification SET icon_contentUri = null WHERE icon_contentUri = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearAllNotificationIds = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE notification SET notificationId = 0 WHERE subscriptionId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAsDeleted = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE notification SET deleted = 1 WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAllAsDeleted = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE notification SET deleted = 1 WHERE subscriptionId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAsDeletedIfOlderThan = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE notification SET deleted = 1 WHERE subscriptionId = ? AND timestamp < ?";
        return _query;
      }
    };
    this.__preparedStmtOfUndelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE notification SET deleted = 0 WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveIfOlderThan = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM notification WHERE subscriptionId = ? AND timestamp < ?";
        return _query;
      }
    };
    this.__preparedStmtOfRemoveAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM notification WHERE subscriptionId = ?";
        return _query;
      }
    };
  }

  @Override
  public void add(final Notification notification) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNotification.insert(notification);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final Notification notification) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNotification.handle(notification);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clearIconUri(final String uri) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearIconUri.acquire();
    int _argIndex = 1;
    if (uri == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, uri);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearIconUri.release(_stmt);
    }
  }

  @Override
  public void clearAllNotificationIds(final long subscriptionId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllNotificationIds.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, subscriptionId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClearAllNotificationIds.release(_stmt);
    }
  }

  @Override
  public void markAsDeleted(final String notificationId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAsDeleted.acquire();
    int _argIndex = 1;
    if (notificationId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, notificationId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAsDeleted.release(_stmt);
    }
  }

  @Override
  public void markAllAsDeleted(final long subscriptionId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAllAsDeleted.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, subscriptionId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAllAsDeleted.release(_stmt);
    }
  }

  @Override
  public void markAsDeletedIfOlderThan(final long subscriptionId, final long olderThanTimestamp) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAsDeletedIfOlderThan.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, subscriptionId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, olderThanTimestamp);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAsDeletedIfOlderThan.release(_stmt);
    }
  }

  @Override
  public void undelete(final String notificationId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUndelete.acquire();
    int _argIndex = 1;
    if (notificationId == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, notificationId);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUndelete.release(_stmt);
    }
  }

  @Override
  public void removeIfOlderThan(final long subscriptionId, final long olderThanTimestamp) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveIfOlderThan.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, subscriptionId);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, olderThanTimestamp);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveIfOlderThan.release(_stmt);
    }
  }

  @Override
  public void removeAll(final long subscriptionId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfRemoveAll.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, subscriptionId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfRemoveAll.release(_stmt);
    }
  }

  @Override
  public Object list(final Continuation<? super List<Notification>> continuation) {
    final String _sql = "SELECT * FROM notification";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Notification>>() {
      @Override
      public List<Notification> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSubscriptionId = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriptionId");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final int _cursorIndexOfEncoding = CursorUtil.getColumnIndexOrThrow(_cursor, "encoding");
          final int _cursorIndexOfNotificationId = CursorUtil.getColumnIndexOrThrow(_cursor, "notificationId");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
          final int _cursorIndexOfClick = CursorUtil.getColumnIndexOrThrow(_cursor, "click");
          final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(_cursor, "actions");
          final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
          final int _cursorIndexOfContentUri = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_contentUri");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_name");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_type");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_size");
          final int _cursorIndexOfExpires = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_expires");
          final int _cursorIndexOfUrl_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_url");
          final int _cursorIndexOfContentUri_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_contentUri");
          final int _cursorIndexOfProgress = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_progress");
          final List<Notification> _result = new ArrayList<Notification>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Notification _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final long _tmpSubscriptionId;
            _tmpSubscriptionId = _cursor.getLong(_cursorIndexOfSubscriptionId);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpMessage;
            if (_cursor.isNull(_cursorIndexOfMessage)) {
              _tmpMessage = null;
            } else {
              _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
            }
            final String _tmpEncoding;
            if (_cursor.isNull(_cursorIndexOfEncoding)) {
              _tmpEncoding = null;
            } else {
              _tmpEncoding = _cursor.getString(_cursorIndexOfEncoding);
            }
            final int _tmpNotificationId;
            _tmpNotificationId = _cursor.getInt(_cursorIndexOfNotificationId);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            final String _tmpTags;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmpTags = null;
            } else {
              _tmpTags = _cursor.getString(_cursorIndexOfTags);
            }
            final String _tmpClick;
            if (_cursor.isNull(_cursorIndexOfClick)) {
              _tmpClick = null;
            } else {
              _tmpClick = _cursor.getString(_cursorIndexOfClick);
            }
            final List<Action> _tmpActions;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfActions)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfActions);
            }
            _tmpActions = __converters.toActionList(_tmp);
            final boolean _tmpDeleted;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDeleted);
            _tmpDeleted = _tmp_1 != 0;
            final Icon _tmpIcon;
            if (! (_cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfContentUri))) {
              final String _tmpUrl;
              if (_cursor.isNull(_cursorIndexOfUrl)) {
                _tmpUrl = null;
              } else {
                _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              }
              final String _tmpContentUri;
              if (_cursor.isNull(_cursorIndexOfContentUri)) {
                _tmpContentUri = null;
              } else {
                _tmpContentUri = _cursor.getString(_cursorIndexOfContentUri);
              }
              _tmpIcon = new Icon(_tmpUrl,_tmpContentUri);
            }  else  {
              _tmpIcon = null;
            }
            final Attachment _tmpAttachment;
            if (! (_cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfSize) && _cursor.isNull(_cursorIndexOfExpires) && _cursor.isNull(_cursorIndexOfUrl_1) && _cursor.isNull(_cursorIndexOfContentUri_1) && _cursor.isNull(_cursorIndexOfProgress))) {
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              final String _tmpType;
              if (_cursor.isNull(_cursorIndexOfType)) {
                _tmpType = null;
              } else {
                _tmpType = _cursor.getString(_cursorIndexOfType);
              }
              final Long _tmpSize;
              if (_cursor.isNull(_cursorIndexOfSize)) {
                _tmpSize = null;
              } else {
                _tmpSize = _cursor.getLong(_cursorIndexOfSize);
              }
              final Long _tmpExpires;
              if (_cursor.isNull(_cursorIndexOfExpires)) {
                _tmpExpires = null;
              } else {
                _tmpExpires = _cursor.getLong(_cursorIndexOfExpires);
              }
              final String _tmpUrl_1;
              if (_cursor.isNull(_cursorIndexOfUrl_1)) {
                _tmpUrl_1 = null;
              } else {
                _tmpUrl_1 = _cursor.getString(_cursorIndexOfUrl_1);
              }
              final String _tmpContentUri_1;
              if (_cursor.isNull(_cursorIndexOfContentUri_1)) {
                _tmpContentUri_1 = null;
              } else {
                _tmpContentUri_1 = _cursor.getString(_cursorIndexOfContentUri_1);
              }
              final int _tmpProgress;
              _tmpProgress = _cursor.getInt(_cursorIndexOfProgress);
              _tmpAttachment = new Attachment(_tmpName,_tmpType,_tmpSize,_tmpExpires,_tmpUrl_1,_tmpContentUri_1,_tmpProgress);
            }  else  {
              _tmpAttachment = null;
            }
            _item = new Notification(_tmpId,_tmpSubscriptionId,_tmpTimestamp,_tmpTitle,_tmpMessage,_tmpEncoding,_tmpNotificationId,_tmpPriority,_tmpTags,_tmpClick,_tmpIcon,_tmpActions,_tmpAttachment,_tmpDeleted);
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
  public Flow<List<Notification>> listFlow(final long subscriptionId) {
    final String _sql = "SELECT * FROM notification WHERE subscriptionId = ? AND deleted != 1 ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, subscriptionId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"notification"}, new Callable<List<Notification>>() {
      @Override
      public List<Notification> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSubscriptionId = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriptionId");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
          final int _cursorIndexOfEncoding = CursorUtil.getColumnIndexOrThrow(_cursor, "encoding");
          final int _cursorIndexOfNotificationId = CursorUtil.getColumnIndexOrThrow(_cursor, "notificationId");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
          final int _cursorIndexOfClick = CursorUtil.getColumnIndexOrThrow(_cursor, "click");
          final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(_cursor, "actions");
          final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
          final int _cursorIndexOfContentUri = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_contentUri");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_name");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_type");
          final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_size");
          final int _cursorIndexOfExpires = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_expires");
          final int _cursorIndexOfUrl_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_url");
          final int _cursorIndexOfContentUri_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_contentUri");
          final int _cursorIndexOfProgress = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_progress");
          final List<Notification> _result = new ArrayList<Notification>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Notification _item;
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            final long _tmpSubscriptionId;
            _tmpSubscriptionId = _cursor.getLong(_cursorIndexOfSubscriptionId);
            final long _tmpTimestamp;
            _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpMessage;
            if (_cursor.isNull(_cursorIndexOfMessage)) {
              _tmpMessage = null;
            } else {
              _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
            }
            final String _tmpEncoding;
            if (_cursor.isNull(_cursorIndexOfEncoding)) {
              _tmpEncoding = null;
            } else {
              _tmpEncoding = _cursor.getString(_cursorIndexOfEncoding);
            }
            final int _tmpNotificationId;
            _tmpNotificationId = _cursor.getInt(_cursorIndexOfNotificationId);
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            final String _tmpTags;
            if (_cursor.isNull(_cursorIndexOfTags)) {
              _tmpTags = null;
            } else {
              _tmpTags = _cursor.getString(_cursorIndexOfTags);
            }
            final String _tmpClick;
            if (_cursor.isNull(_cursorIndexOfClick)) {
              _tmpClick = null;
            } else {
              _tmpClick = _cursor.getString(_cursorIndexOfClick);
            }
            final List<Action> _tmpActions;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfActions)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfActions);
            }
            _tmpActions = __converters.toActionList(_tmp);
            final boolean _tmpDeleted;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfDeleted);
            _tmpDeleted = _tmp_1 != 0;
            final Icon _tmpIcon;
            if (! (_cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfContentUri))) {
              final String _tmpUrl;
              if (_cursor.isNull(_cursorIndexOfUrl)) {
                _tmpUrl = null;
              } else {
                _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
              }
              final String _tmpContentUri;
              if (_cursor.isNull(_cursorIndexOfContentUri)) {
                _tmpContentUri = null;
              } else {
                _tmpContentUri = _cursor.getString(_cursorIndexOfContentUri);
              }
              _tmpIcon = new Icon(_tmpUrl,_tmpContentUri);
            }  else  {
              _tmpIcon = null;
            }
            final Attachment _tmpAttachment;
            if (! (_cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfSize) && _cursor.isNull(_cursorIndexOfExpires) && _cursor.isNull(_cursorIndexOfUrl_1) && _cursor.isNull(_cursorIndexOfContentUri_1) && _cursor.isNull(_cursorIndexOfProgress))) {
              final String _tmpName;
              if (_cursor.isNull(_cursorIndexOfName)) {
                _tmpName = null;
              } else {
                _tmpName = _cursor.getString(_cursorIndexOfName);
              }
              final String _tmpType;
              if (_cursor.isNull(_cursorIndexOfType)) {
                _tmpType = null;
              } else {
                _tmpType = _cursor.getString(_cursorIndexOfType);
              }
              final Long _tmpSize;
              if (_cursor.isNull(_cursorIndexOfSize)) {
                _tmpSize = null;
              } else {
                _tmpSize = _cursor.getLong(_cursorIndexOfSize);
              }
              final Long _tmpExpires;
              if (_cursor.isNull(_cursorIndexOfExpires)) {
                _tmpExpires = null;
              } else {
                _tmpExpires = _cursor.getLong(_cursorIndexOfExpires);
              }
              final String _tmpUrl_1;
              if (_cursor.isNull(_cursorIndexOfUrl_1)) {
                _tmpUrl_1 = null;
              } else {
                _tmpUrl_1 = _cursor.getString(_cursorIndexOfUrl_1);
              }
              final String _tmpContentUri_1;
              if (_cursor.isNull(_cursorIndexOfContentUri_1)) {
                _tmpContentUri_1 = null;
              } else {
                _tmpContentUri_1 = _cursor.getString(_cursorIndexOfContentUri_1);
              }
              final int _tmpProgress;
              _tmpProgress = _cursor.getInt(_cursorIndexOfProgress);
              _tmpAttachment = new Attachment(_tmpName,_tmpType,_tmpSize,_tmpExpires,_tmpUrl_1,_tmpContentUri_1,_tmpProgress);
            }  else  {
              _tmpAttachment = null;
            }
            _item = new Notification(_tmpId,_tmpSubscriptionId,_tmpTimestamp,_tmpTitle,_tmpMessage,_tmpEncoding,_tmpNotificationId,_tmpPriority,_tmpTags,_tmpClick,_tmpIcon,_tmpActions,_tmpAttachment,_tmpDeleted);
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
  public List<String> listIds(final long subscriptionId) {
    final String _sql = "SELECT id FROM notification WHERE subscriptionId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, subscriptionId);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Notification> listDeletedWithAttachments() {
    final String _sql = "SELECT * FROM notification WHERE deleted = 1 AND attachment_contentUri <> ''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSubscriptionId = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriptionId");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfEncoding = CursorUtil.getColumnIndexOrThrow(_cursor, "encoding");
      final int _cursorIndexOfNotificationId = CursorUtil.getColumnIndexOrThrow(_cursor, "notificationId");
      final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
      final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
      final int _cursorIndexOfClick = CursorUtil.getColumnIndexOrThrow(_cursor, "click");
      final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(_cursor, "actions");
      final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
      final int _cursorIndexOfContentUri = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_contentUri");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_name");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_type");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_size");
      final int _cursorIndexOfExpires = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_expires");
      final int _cursorIndexOfUrl_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_url");
      final int _cursorIndexOfContentUri_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_contentUri");
      final int _cursorIndexOfProgress = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_progress");
      final List<Notification> _result = new ArrayList<Notification>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Notification _item;
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final long _tmpSubscriptionId;
        _tmpSubscriptionId = _cursor.getLong(_cursorIndexOfSubscriptionId);
        final long _tmpTimestamp;
        _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpMessage;
        if (_cursor.isNull(_cursorIndexOfMessage)) {
          _tmpMessage = null;
        } else {
          _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        }
        final String _tmpEncoding;
        if (_cursor.isNull(_cursorIndexOfEncoding)) {
          _tmpEncoding = null;
        } else {
          _tmpEncoding = _cursor.getString(_cursorIndexOfEncoding);
        }
        final int _tmpNotificationId;
        _tmpNotificationId = _cursor.getInt(_cursorIndexOfNotificationId);
        final int _tmpPriority;
        _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
        final String _tmpTags;
        if (_cursor.isNull(_cursorIndexOfTags)) {
          _tmpTags = null;
        } else {
          _tmpTags = _cursor.getString(_cursorIndexOfTags);
        }
        final String _tmpClick;
        if (_cursor.isNull(_cursorIndexOfClick)) {
          _tmpClick = null;
        } else {
          _tmpClick = _cursor.getString(_cursorIndexOfClick);
        }
        final List<Action> _tmpActions;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfActions)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfActions);
        }
        _tmpActions = __converters.toActionList(_tmp);
        final boolean _tmpDeleted;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDeleted);
        _tmpDeleted = _tmp_1 != 0;
        final Icon _tmpIcon;
        if (! (_cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfContentUri))) {
          final String _tmpUrl;
          if (_cursor.isNull(_cursorIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
          }
          final String _tmpContentUri;
          if (_cursor.isNull(_cursorIndexOfContentUri)) {
            _tmpContentUri = null;
          } else {
            _tmpContentUri = _cursor.getString(_cursorIndexOfContentUri);
          }
          _tmpIcon = new Icon(_tmpUrl,_tmpContentUri);
        }  else  {
          _tmpIcon = null;
        }
        final Attachment _tmpAttachment;
        if (! (_cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfSize) && _cursor.isNull(_cursorIndexOfExpires) && _cursor.isNull(_cursorIndexOfUrl_1) && _cursor.isNull(_cursorIndexOfContentUri_1) && _cursor.isNull(_cursorIndexOfProgress))) {
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final String _tmpType;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getString(_cursorIndexOfType);
          }
          final Long _tmpSize;
          if (_cursor.isNull(_cursorIndexOfSize)) {
            _tmpSize = null;
          } else {
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
          }
          final Long _tmpExpires;
          if (_cursor.isNull(_cursorIndexOfExpires)) {
            _tmpExpires = null;
          } else {
            _tmpExpires = _cursor.getLong(_cursorIndexOfExpires);
          }
          final String _tmpUrl_1;
          if (_cursor.isNull(_cursorIndexOfUrl_1)) {
            _tmpUrl_1 = null;
          } else {
            _tmpUrl_1 = _cursor.getString(_cursorIndexOfUrl_1);
          }
          final String _tmpContentUri_1;
          if (_cursor.isNull(_cursorIndexOfContentUri_1)) {
            _tmpContentUri_1 = null;
          } else {
            _tmpContentUri_1 = _cursor.getString(_cursorIndexOfContentUri_1);
          }
          final int _tmpProgress;
          _tmpProgress = _cursor.getInt(_cursorIndexOfProgress);
          _tmpAttachment = new Attachment(_tmpName,_tmpType,_tmpSize,_tmpExpires,_tmpUrl_1,_tmpContentUri_1,_tmpProgress);
        }  else  {
          _tmpAttachment = null;
        }
        _item = new Notification(_tmpId,_tmpSubscriptionId,_tmpTimestamp,_tmpTitle,_tmpMessage,_tmpEncoding,_tmpNotificationId,_tmpPriority,_tmpTags,_tmpClick,_tmpIcon,_tmpActions,_tmpAttachment,_tmpDeleted);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> listActiveIconUris() {
    final String _sql = "SELECT DISTINCT icon_contentUri FROM notification WHERE deleted != 1 AND icon_contentUri <> ''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        if (_cursor.isNull(0)) {
          _item = null;
        } else {
          _item = _cursor.getString(0);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Notification get(final String notificationId) {
    final String _sql = "SELECT * FROM notification WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (notificationId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, notificationId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSubscriptionId = CursorUtil.getColumnIndexOrThrow(_cursor, "subscriptionId");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfEncoding = CursorUtil.getColumnIndexOrThrow(_cursor, "encoding");
      final int _cursorIndexOfNotificationId = CursorUtil.getColumnIndexOrThrow(_cursor, "notificationId");
      final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
      final int _cursorIndexOfTags = CursorUtil.getColumnIndexOrThrow(_cursor, "tags");
      final int _cursorIndexOfClick = CursorUtil.getColumnIndexOrThrow(_cursor, "click");
      final int _cursorIndexOfActions = CursorUtil.getColumnIndexOrThrow(_cursor, "actions");
      final int _cursorIndexOfDeleted = CursorUtil.getColumnIndexOrThrow(_cursor, "deleted");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_url");
      final int _cursorIndexOfContentUri = CursorUtil.getColumnIndexOrThrow(_cursor, "icon_contentUri");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_name");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_type");
      final int _cursorIndexOfSize = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_size");
      final int _cursorIndexOfExpires = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_expires");
      final int _cursorIndexOfUrl_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_url");
      final int _cursorIndexOfContentUri_1 = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_contentUri");
      final int _cursorIndexOfProgress = CursorUtil.getColumnIndexOrThrow(_cursor, "attachment_progress");
      final Notification _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final long _tmpSubscriptionId;
        _tmpSubscriptionId = _cursor.getLong(_cursorIndexOfSubscriptionId);
        final long _tmpTimestamp;
        _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpMessage;
        if (_cursor.isNull(_cursorIndexOfMessage)) {
          _tmpMessage = null;
        } else {
          _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        }
        final String _tmpEncoding;
        if (_cursor.isNull(_cursorIndexOfEncoding)) {
          _tmpEncoding = null;
        } else {
          _tmpEncoding = _cursor.getString(_cursorIndexOfEncoding);
        }
        final int _tmpNotificationId;
        _tmpNotificationId = _cursor.getInt(_cursorIndexOfNotificationId);
        final int _tmpPriority;
        _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
        final String _tmpTags;
        if (_cursor.isNull(_cursorIndexOfTags)) {
          _tmpTags = null;
        } else {
          _tmpTags = _cursor.getString(_cursorIndexOfTags);
        }
        final String _tmpClick;
        if (_cursor.isNull(_cursorIndexOfClick)) {
          _tmpClick = null;
        } else {
          _tmpClick = _cursor.getString(_cursorIndexOfClick);
        }
        final List<Action> _tmpActions;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfActions)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfActions);
        }
        _tmpActions = __converters.toActionList(_tmp);
        final boolean _tmpDeleted;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfDeleted);
        _tmpDeleted = _tmp_1 != 0;
        final Icon _tmpIcon;
        if (! (_cursor.isNull(_cursorIndexOfUrl) && _cursor.isNull(_cursorIndexOfContentUri))) {
          final String _tmpUrl;
          if (_cursor.isNull(_cursorIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
          }
          final String _tmpContentUri;
          if (_cursor.isNull(_cursorIndexOfContentUri)) {
            _tmpContentUri = null;
          } else {
            _tmpContentUri = _cursor.getString(_cursorIndexOfContentUri);
          }
          _tmpIcon = new Icon(_tmpUrl,_tmpContentUri);
        }  else  {
          _tmpIcon = null;
        }
        final Attachment _tmpAttachment;
        if (! (_cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfType) && _cursor.isNull(_cursorIndexOfSize) && _cursor.isNull(_cursorIndexOfExpires) && _cursor.isNull(_cursorIndexOfUrl_1) && _cursor.isNull(_cursorIndexOfContentUri_1) && _cursor.isNull(_cursorIndexOfProgress))) {
          final String _tmpName;
          if (_cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final String _tmpType;
          if (_cursor.isNull(_cursorIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getString(_cursorIndexOfType);
          }
          final Long _tmpSize;
          if (_cursor.isNull(_cursorIndexOfSize)) {
            _tmpSize = null;
          } else {
            _tmpSize = _cursor.getLong(_cursorIndexOfSize);
          }
          final Long _tmpExpires;
          if (_cursor.isNull(_cursorIndexOfExpires)) {
            _tmpExpires = null;
          } else {
            _tmpExpires = _cursor.getLong(_cursorIndexOfExpires);
          }
          final String _tmpUrl_1;
          if (_cursor.isNull(_cursorIndexOfUrl_1)) {
            _tmpUrl_1 = null;
          } else {
            _tmpUrl_1 = _cursor.getString(_cursorIndexOfUrl_1);
          }
          final String _tmpContentUri_1;
          if (_cursor.isNull(_cursorIndexOfContentUri_1)) {
            _tmpContentUri_1 = null;
          } else {
            _tmpContentUri_1 = _cursor.getString(_cursorIndexOfContentUri_1);
          }
          final int _tmpProgress;
          _tmpProgress = _cursor.getInt(_cursorIndexOfProgress);
          _tmpAttachment = new Attachment(_tmpName,_tmpType,_tmpSize,_tmpExpires,_tmpUrl_1,_tmpContentUri_1,_tmpProgress);
        }  else  {
          _tmpAttachment = null;
        }
        _result = new Notification(_tmpId,_tmpSubscriptionId,_tmpTimestamp,_tmpTitle,_tmpMessage,_tmpEncoding,_tmpNotificationId,_tmpPriority,_tmpTags,_tmpClick,_tmpIcon,_tmpActions,_tmpAttachment,_tmpDeleted);
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
