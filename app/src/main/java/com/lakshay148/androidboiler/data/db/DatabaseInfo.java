package com.lakshay148.androidboiler.data.db;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Lakshay .
 * since 3/15/18
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface DatabaseInfo {
}
