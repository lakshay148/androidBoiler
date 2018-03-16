package com.lakshay148.androidboiler.ui.base;

/**
 * Created by Lakshay .
 * since 3/16/18
 */

public interface MvpPresenter<V extends BaseMvpView> {

    void onAttach(V mvpView);
    void onDetach();
}
