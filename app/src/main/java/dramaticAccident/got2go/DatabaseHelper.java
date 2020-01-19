package dramaticAccident.got2go;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*
 *  this is a class to help manage database
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String ToiletDB = "Toilet.db";
    public static final String ToiletTB = "Toilet_table";
    public static final String ToiletID = "ToiletID";
    public static final String ToiletName = "NAME";
    public static final String TableCoor = "COORDINATE";

    public static final String RatingDB = "Rating.db";
    public static final String RatingTB = "Rating_table";
    public static final String RatingID = "RATINGID";
    public static final String Comment = "COMMENT";
    public static final String Rating = "RATING";


    public DatabaseHelper(Context context) {
        super(context, ToiletDB, null, 1);

        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + ToiletTB +" (ToiletID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT, COORDINATES TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ToiletDB);
        onCreate(db);
    }
}
