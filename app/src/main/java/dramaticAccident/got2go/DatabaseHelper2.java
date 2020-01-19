package dramaticAccident.got2go;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*
 *  this is a class to help manage database
 */

public class DatabaseHelper2 extends SQLiteOpenHelper {

    public static final String RatingDB = "Rating.db";
    public static final String RatingTB = "Rating_table";
    public static final String ToiletID = "TOILETID";
    public static final String RatingID = "RATINGID";
    public static final String Comment = "COMMENT";
    public static final String Rating = "RATING";


    public DatabaseHelper2(Context context) {
        super(context, RatingDB, null, 1);

        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + RatingDB +" (RatingID INTEGER PRIMARY KEY AUTOINCREMENT, ToiletID String, Comment TEXT, Rating INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+RatingDB);
        onCreate(db);
    }

    public boolean addRating(String comment, Integer rating){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put(Comment, comment);
        contentvalues.put(Rating, rating);
        long result = db.insert(RatingTB, null, contentvalues);
        return !(result == -1);
    }
}
