package com.lakshay148.androidboiler.data.db;

import com.lakshay148.androidboiler.data.db.model.User;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Lakshay .
 * since 3/15/18
 *  This is a sqlitehelper for the application
 */

public class AppDbHelper implements DbHelper{

    @Inject
    public AppDbHelper(AppSqliteHelper sqliteHelper){

    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(int id) {
        return null;
    }
}
