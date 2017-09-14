package com.nextbit.yassin.stg.infrastructure.cache;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.nextbit.yassin.stg.domain.entity.Runner;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "RUNNER".
*/
public class RunnerDao extends AbstractDao<Runner, Long> {

    public static final String TABLENAME = "RUNNER";

    /**
     * Properties of entity Runner.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property RunnerName = new Property(1, String.class, "runnerName", false, "RUNNER_NAME");
        public final static Property RunnerCode = new Property(2, String.class, "runnerCode", false, "RUNNER_CODE");
        public final static Property RunnerPassword = new Property(3, String.class, "runnerPassword", false, "RUNNER_PASSWORD");
    }

    private DaoSession daoSession;


    public RunnerDao(DaoConfig config) {
        super(config);
    }
    
    public RunnerDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"RUNNER\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"RUNNER_NAME\" TEXT NOT NULL ," + // 1: runnerName
                "\"RUNNER_CODE\" TEXT NOT NULL ," + // 2: runnerCode
                "\"RUNNER_PASSWORD\" TEXT NOT NULL );"); // 3: runnerPassword
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"RUNNER\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Runner entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getRunnerName());
        stmt.bindString(3, entity.getRunnerCode());
        stmt.bindString(4, entity.getRunnerPassword());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Runner entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getRunnerName());
        stmt.bindString(3, entity.getRunnerCode());
        stmt.bindString(4, entity.getRunnerPassword());
    }

    @Override
    protected final void attachEntity(Runner entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Runner readEntity(Cursor cursor, int offset) {
        Runner entity = new Runner( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // runnerName
            cursor.getString(offset + 2), // runnerCode
            cursor.getString(offset + 3) // runnerPassword
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Runner entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setRunnerName(cursor.getString(offset + 1));
        entity.setRunnerCode(cursor.getString(offset + 2));
        entity.setRunnerPassword(cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Runner entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Runner entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Runner entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
