package com.example.admin.dongtv.mvp.base;

import com.example.admin.dongtv.App;
import com.example.admin.dongtv.greendao.DaoSession;
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

/**
 * Created by admin on 2017/9/19.
 */

public class BasePresenter<V extends BaseView> extends MvpBasePresenter<V> {

    private App app;

    private DaoSession mDaoSession;


}
