package com.nextbit.yassin.stg.infrastructure.cache;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import com.nextbit.yassin.stg.domain.entity.Sheet;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SHEET".
*/
public class SheetDao extends AbstractDao<Sheet, Long> {

    public static final String TABLENAME = "SHEET";

    /**
     * Properties of entity Sheet.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property SheetDate = new Property(1, java.util.Date.class, "sheetDate", false, "SHEET_DATE");
        public final static Property RunnerId = new Property(2, long.class, "runnerId", false, "RUNNER_ID");
    }

    private DaoSession daoSession;

    private Query<Sheet> runner_RunnerSheetQuery;

    public SheetDao(DaoConfig config) {
        super(config);
    }
    
    public SheetDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHEET\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"SHEET_DATE\" INTEGER NOT NULL ," + // 1: sheetDate
                "\"RUNNER_ID\" INTEGER NOT NULL );"); // 2: runnerId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHEET\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Sheet entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getSheetDate().getTime());
        stmt.bindLong(3, entity.getRunnerId());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Sheet entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getSheetDate().getTime());
        stmt.bindLong(3, entity.getRunnerId());
    }

    @Override
    protected final void attachEntity(Sheet entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Sheet readEntity(Cursor cursor, int offset) {
        Sheet entity = new Sheet( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            new java.util.Date(cursor.getLong(offset + 1)), // sheetDate
            cursor.getLong(offset + 2) // runnerId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Sheet entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setSheetDate(new java.util.Date(cursor.getLong(offset + 1)));
        entity.setRunnerId(cursor.getLong(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Sheet entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Sheet entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Sheet entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "runnerSheet" to-many relationship of Runner. */
    public List<Sheet> _queryRunner_RunnerSheet(long runnerId) {
        synchronized (this) {
            if (runner_RunnerSheetQuery == null) {
                QueryBuilder<Sheet> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.RunnerId.eq(null));
                runner_RunnerSheetQuery = queryBuilder.build();
            }
        }
        Query<Sheet> query = runner_RunnerSheetQuery.forCurrentThread();
        query.setParameter(0, runnerId);
        return query.list();
    }

}
