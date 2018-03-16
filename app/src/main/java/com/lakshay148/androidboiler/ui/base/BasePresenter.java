package com.lakshay148.androidboiler.ui.base;

/**
 * Created by Lakshay .
 * since 3/16/18
 */

public class BasePresenter <V extends BaseMvpView> implements MvpPresenter<V> {

    BaseMvpView mvpView;

    @Override
    public void onAttach(V mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach() {
        this.mvpView = null;
    }
}
