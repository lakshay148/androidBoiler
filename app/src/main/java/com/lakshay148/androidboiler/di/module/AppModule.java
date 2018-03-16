package com.lakshay148.androidboiler.di.module;

import android.app.Application;
import android.content.Context;

import com.lakshay148.androidboiler.data.db.AppDbHelper;
import com.lakshay148.androidboiler.data.db.AppSqliteHelper;
import com.lakshay148.androidboiler.data.db.DatabaseInfo;
import com.lakshay148.androidboiler.data.db.DbHelper;
import com.lakshay148.androidboiler.di.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Lakshay .
 * since 3/15/18
 */

@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application application){
        this.mApplication = application;
    }

    @Provides
    @DatabaseInfo
    public int getDatabaseVersion(){
        return 1;
    }

    @Provides
    @ApplicationContext
    Context getApplicationContext(){
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    public String getDatabaseName(){
        return "defaultapp.db";
    }

    @Provides
    public DbHelper getSqliteHelper(AppDbHelper sqliteHelper){
        return sqliteHelper;
    }

}
