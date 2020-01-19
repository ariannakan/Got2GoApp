package dramaticAccident.got2go;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*
 *  this is a class to help manage database
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String ToiletDB = "Toilet.db";
    public static final String ToiletTB = "Toilet_table";
    public static final String ToiletID = "TOILETID";
    public static final String ToiletName = "NAME";
    public static final String ToiletCoor = "COORDINATE";


    public DatabaseHelper(Context context) {
        super(context, ToiletDB, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + ToiletTB +" (ToiletID INTEGER PRIMARY KEY AUTOINCREMENT, ToiletName TEXT, ToiletCoor TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ToiletDB);
        onCreate(db);
    }

    public boolean addToilet(String name, String coor){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(ToiletName, name);
        contentvalues.put(ToiletCoor, coor);
        long result = db.insert(ToiletTB, null, contentvalues);
        return !(result == -1);
    }
}
