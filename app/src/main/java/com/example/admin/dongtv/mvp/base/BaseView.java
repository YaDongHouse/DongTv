package com.example.admin.dongtv.mvp.base;

import com.hannesdorfmann.mosby3.mvp.MvpView;

/**
 * Created by admin on 2017/9/19.
 */

public interface BaseView extends MvpView {

    void showProgress();

    void onCompleted();

    void onError(Throwable e);

}
