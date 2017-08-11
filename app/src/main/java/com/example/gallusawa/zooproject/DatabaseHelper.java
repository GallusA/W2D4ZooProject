package com.example.gallusawa.zooproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gallusawa on 8/10/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final int DATABSE_VERSION = 1;
    private static final String DATABASE_NAME = "MyDatabase";

    public static final String TABLE_NAME = "ZooAnimals";
    public static final String ANIMAL_NAME = "Name";
    public static final String ANIMAL_CATEGORY = "Category";
    public static final String ANIMAL_FOOD = "Category";
    public static final String ANIMAL_HABITAT = "Category";

    private static final String TAG = "MyDBTag";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABSE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "(" +
                ANIMAL_NAME + " TEXT," +  ANIMAL_CATEGORY + " TEXT," +  ANIMAL_NAME + " TEXT," +  ANIMAL_HABITAT + " TEXT,"
               + " TadEXT PRIMARY KEY" +
                ")";

        sqLiteDatabase.execSQL(CREATE_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void saveNewAnimal(MyAnimal animal) {
        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(ANIMAL_NAME, animal.getAnimalName());
        contentValues.put(ANIMAL_CATEGORY, animal.getAnimalCategory());
        contentValues.put(ANIMAL_FOOD, animal.getAnimalFood());
        contentValues.put(ANIMAL_HABITAT, animal.getAnimalHabitat());
        int hadsaved  = (int) database.insert(TABLE_NAME, null, contentValues);

        Log.d(TAG, "saveNewContact: " + hadsaved);

    }


    public List<MyAnimal> getAnimals() {

        SQLiteDatabase database = this.getWritableDatabase();
        String query = "Select * from " + TABLE_NAME;

        Cursor cursor = database.rawQuery(query, null);

        List<MyAnimal> contacts = new ArrayList<>();
        if (cursor.moveToFirst()) {
            do {
                MyAnimal contact = new MyAnimal(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
                contacts.add(contact);
            } while (cursor.moveToNext());
        }


        return contacts;
    }

    public void checkSingleton() {

        Context context = null;
        ClassicSingleton singleton = ClassicSingleton.getInstance(context);


    }

}