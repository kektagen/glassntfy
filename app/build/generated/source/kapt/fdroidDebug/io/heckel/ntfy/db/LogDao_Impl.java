package io.heckel.ntfy.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
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
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LogDao_Impl implements LogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LogEntry> __insertionAdapterOfLogEntry;

  private final SharedSQLiteStatement __preparedStmtOfPrune;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public LogDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLogEntry = new EntityInsertionAdapter<LogEntry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Log` (`id`,`timestamp`,`tag`,`level`,`message`,`exception`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LogEntry value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getTimestamp());
        if (value.getTag() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTag());
        }
        stmt.bindLong(4, value.getLevel());
        if (value.getMessage() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getMessage());
        }
        if (value.getException() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getException());
        }
      }
    };
    this.__preparedStmtOfPrune = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM log WHERE id NOT IN (SELECT id FROM log ORDER BY timestamp DESC, id DESC LIMIT ?)";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM log";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final LogEntry entry, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLogEntry.insert(entry);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object prune(final int keepCount, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfPrune.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, keepCount);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfPrune.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<LogEntry> getAll() {
    final String _sql = "SELECT * FROM log ORDER BY timestamp ASC, id ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfTag = CursorUtil.getColumnIndexOrThrow(_cursor, "tag");
      final int _cursorIndexOfLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "level");
      final int _cursorIndexOfMessage = CursorUtil.getColumnIndexOrThrow(_cursor, "message");
      final int _cursorIndexOfException = CursorUtil.getColumnIndexOrThrow(_cursor, "exception");
      final List<LogEntry> _result = new ArrayList<LogEntry>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LogEntry _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpTimestamp;
        _tmpTimestamp = _cursor.getLong(_cursorIndexOfTimestamp);
        final String _tmpTag;
        if (_cursor.isNull(_cursorIndexOfTag)) {
          _tmpTag = null;
        } else {
          _tmpTag = _cursor.getString(_cursorIndexOfTag);
        }
        final int _tmpLevel;
        _tmpLevel = _cursor.getInt(_cursorIndexOfLevel);
        final String _tmpMessage;
        if (_cursor.isNull(_cursorIndexOfMessage)) {
          _tmpMessage = null;
        } else {
          _tmpMessage = _cursor.getString(_cursorIndexOfMessage);
        }
        final String _tmpException;
        if (_cursor.isNull(_cursorIndexOfException)) {
          _tmpException = null;
        } else {
          _tmpException = _cursor.getString(_cursorIndexOfException);
        }
        _item = new LogEntry(_tmpId,_tmpTimestamp,_tmpTag,_tmpLevel,_tmpMessage,_tmpException);
        _result.add(_item);
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
