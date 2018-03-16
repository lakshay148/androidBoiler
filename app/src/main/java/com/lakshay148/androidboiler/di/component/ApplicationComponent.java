package com.lakshay148.androidboiler.di.component;

import com.lakshay148.androidboiler.MainApplication;
import com.lakshay148.androidboiler.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Lakshay .
 * since 3/15/18
 */
@Singleton
@Component(modules = AppModule.class)
public interface ApplicationComponent {

    void inject(MainApplication application);
}
