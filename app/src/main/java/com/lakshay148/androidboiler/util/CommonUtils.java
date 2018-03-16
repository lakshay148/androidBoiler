package com.lakshay148.androidboiler.util;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import com.lakshay148.androidboiler.R;

/**
 * Created by Lakshay .
 * since 3/15/18
 */

public class CommonUtils {

    public static ProgressDialog showLoadingDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.show();
        if (progressDialog.getWindow() != null) {
            progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        }
        progressDialog.setContentView(R.layout.progress_layout);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        return progressDialog;
    }
}
