package info.futureme.abs.example.entity.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "locationdetail".
*/
public class UploadLocationDao extends AbstractDao<UploadLocation, Long> {

    public static final String TABLENAME = "locationdetail";

    /**
     * Properties of entity UploadLocation.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "ID");
        public final static Property Location = new Property(1, String.class, "location", false, "LOCATION");
        public final static Property Latitude = new Property(2, Double.class, "latitude", false, "LATITUDE");
        public final static Property Longtitude = new Property(3, Double.class, "longtitude", false, "LONGTITUDE");
    };


    public UploadLocationDao(DaoConfig config) {
        super(config);
    }
    
    public UploadLocationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"locationdetail\" (" + //
                "\"ID\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"LOCATION\" TEXT," + // 1: location
                "\"LATITUDE\" REAL," + // 2: latitude
                "\"LONGTITUDE\" REAL);"); // 3: longtitude
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_locationdetail_ID ON locationdetail" +
                " (\"ID\");");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"locationdetail\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, UploadLocation entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(2, location);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(3, latitude);
        }
 
        Double longtitude = entity.getLongtitude();
        if (longtitude != null) {
            stmt.bindDouble(4, longtitude);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public UploadLocation readEntity(Cursor cursor, int offset) {
        UploadLocation entity = new UploadLocation( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // location
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // latitude
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3) // longtitude
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, UploadLocation entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLocation(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLatitude(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setLongtitude(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(UploadLocation entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(UploadLocation entity) {
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
