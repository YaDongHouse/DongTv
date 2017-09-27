package com.example.admin.dongtv;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.example.admin.dongtv.dagger.component.AppComponent;
import com.example.admin.dongtv.dagger.component.DaggerAppComponent;
import com.example.admin.dongtv.dagger.module.AppModule;
import com.example.admin.dongtv.greendao.DaoMaster;
import com.example.admin.dongtv.greendao.DaoSession;

/**
 * Created by admin on 2017/9/14.
 */

public class App extends Application {

    private DaoMaster.DevOpenHelper mHelper;

    private DaoSession mDaoSession;

    private AppComponent mAppComponent;
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);

    }

    @Override
    public void onCreate() {
        super.onCreate();
        initDatabase();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this,Constants.BASE_URL)).build();
    }

    public void initDatabase(){
        mHelper = new DaoMaster.DevOpenHelper(this,"tv-db",null);

        DaoMaster daoMaster = new DaoMaster(mHelper.getWritableDatabase());

        mDaoSession = daoMaster.newSession();
    }

    public DaoSession getmDaoSession() {
        return mDaoSession;
    }

    public AppComponent getmAppComponent() {
        return mAppComponent;
    }
}
