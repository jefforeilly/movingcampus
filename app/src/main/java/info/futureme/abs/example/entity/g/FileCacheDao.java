package info.futureme.abs.example.entity.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "filecache".
*/
public class FileCacheDao extends AbstractDao<FileCache, Long> {

    public static final String TABLENAME = "filecache";

    /**
     * Properties of entity FileCache.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Url = new Property(1, String.class, "url", false, "URL");
        public final static Property Path = new Property(2, String.class, "path", false, "PATH");
        public final static Property Source_type = new Property(3, String.class, "source_type", false, "SOURCE_TYPE");
        public final static Property Content_type = new Property(4, String.class, "content_type", false, "CONTENT_TYPE");
        public final static Property Timestamp = new Property(5, Long.class, "timestamp", false, "TIMESTAMP");
    };


    public FileCacheDao(DaoConfig config) {
        super(config);
    }
    
    public FileCacheDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"filecache\" (" + //
                "\"ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"URL\" TEXT," + // 1: url
                "\"PATH\" TEXT," + // 2: path
                "\"SOURCE_TYPE\" TEXT," + // 3: source_type
                "\"CONTENT_TYPE\" TEXT," + // 4: content_type
                "\"TIMESTAMP\" INTEGER);"); // 5: timestamp
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_filecache_ID ON filecache" +
                " (\"ID\");");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"filecache\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, FileCache entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(2, url);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(3, path);
        }
 
        String source_type = entity.getSource_type();
        if (source_type != null) {
            stmt.bindString(4, source_type);
        }
 
        String content_type = entity.getContent_type();
        if (content_type != null) {
            stmt.bindString(5, content_type);
        }
 
        Long timestamp = entity.getTimestamp();
        if (timestamp != null) {
            stmt.bindLong(6, timestamp);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public FileCache readEntity(Cursor cursor, int offset) {
        FileCache entity = new FileCache( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // url
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // path
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // source_type
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // content_type
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5) // timestamp
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, FileCache entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUrl(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPath(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSource_type(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setContent_type(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setTimestamp(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(FileCache entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(FileCache entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
