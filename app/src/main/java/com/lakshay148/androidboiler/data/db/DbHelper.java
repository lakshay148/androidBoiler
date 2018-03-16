package com.lakshay148.androidboiler.data.db;

import com.lakshay148.androidboiler.data.db.model.User;

import java.util.List;

/**
 * Created by Lakshay .
 * since 3/15/18
 */

public interface DbHelper {

    void insertUser(User user);
    List<User> getUsers();
    User getUser(int id);

}
