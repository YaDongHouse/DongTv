package com.example.admin.dongtv.mvp.base;

import android.util.Log;

import com.example.admin.dongtv.App;
import com.example.admin.dongtv.dagger.component.AppComponent;
import com.example.admin.dongtv.greendao.DaoSession;
import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

import javax.inject.Inject;

/**
 * Created by admin on 2017/9/19.
 */

public class BasePresenter<V extends BaseView> extends MvpBasePresenter<V> {

    private static final String TAG = "BasePresenter";
    private App app;

    private DaoSession mDaoSession;

    private AppComponent mAppComponent;

    @Inject
    public BasePresenter(App app){
        super();
        this.app = app;
        mDaoSession = app.getmDaoSession();
        mAppComponent = app.getmAppComponent();
    }

    public App getApp() {
        return app;
    }

    public DaoSession getmDaoSession() {
        return mDaoSession;
    }

    public AppComponent getmAppComponent() {
        return mAppComponent;
    }

    @Override
    public boolean isViewAttached() {
        Log.d(TAG, "isViewAttached: "+super.isViewAttached());
        return super.isViewAttached();
    }
}
