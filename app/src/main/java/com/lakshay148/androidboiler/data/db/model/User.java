package com.lakshay148.androidboiler.data.db.model;

/**
 * Created by Lakshay .
 * since 3/15/18
 */

public class User {

    private int id;
    private String name;
    private String email;
    private String accessToken;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
