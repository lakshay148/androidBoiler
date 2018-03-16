package com.lakshay148.androidboiler.data.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.lakshay148.androidboiler.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Lakshay .
 * since 3/15/18
 */

@Singleton
public class AppSqliteHelper extends SQLiteOpenHelper {

    private static final String TAG = "AppSqliteHelper";

    @Inject
    public AppSqliteHelper(@ApplicationContext  Context context, @DatabaseInfo String name, @DatabaseInfo int version) {
        super(context, name, null, version);
        Log.d(TAG, "AppSqliteHelper: " + version + " name " + name);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table if not exists user (id integer primary key, name text, email text, accessToken text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists user");
        onCreate(sqLiteDatabase);
    }
}
