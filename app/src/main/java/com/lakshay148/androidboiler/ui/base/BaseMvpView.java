package com.lakshay148.androidboiler.ui.base;

/**
 * Created by Lakshay .
 * since 3/16/18
 */

public interface BaseMvpView {

    void showLoading();
    void hideLoading();
    void onError(String erro);
    void showMessage(String message);
}
