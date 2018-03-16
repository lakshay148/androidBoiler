package com.lakshay148.androidboiler.ui.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Lakshay .
 * since 3/15/18
 */

public abstract class BaseActivity extends AppCompatActivity {

    ProgressDialog mProgressDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
