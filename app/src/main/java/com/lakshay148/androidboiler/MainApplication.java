package com.lakshay148.androidboiler;

import android.app.Application;

import com.lakshay148.androidboiler.di.component.ApplicationComponent;
import com.lakshay148.androidboiler.di.component.DaggerApplicationComponent;
import com.lakshay148.androidboiler.di.module.AppModule;

/**
 * Created by Lakshay .
 * since 3/15/18
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ApplicationComponent applicationComponent = DaggerApplicationComponent.builder().appModule(new AppModule(this)).build();
        applicationComponent.inject(this);

    }
}
