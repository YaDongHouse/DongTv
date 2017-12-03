package com.example.admin.dongtv.mvp.presenter;

import android.util.Log;

import com.example.admin.dongtv.App;
import com.example.admin.dongtv.bean.greenbean.LiveCategory;
import com.example.admin.dongtv.mvp.base.BasePresenter;
import com.example.admin.dongtv.mvp.view.ICategoryView;
import com.example.admin.dongtv.thread.ThreadPoolManager;

import java.util.List;

import javax.inject.Inject;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 2017/9/23.
 */

public class CategoryPresenter  extends BasePresenter<ICategoryView>{

    private static final String TAG = "CategoryPresenter";

    @Inject
    public CategoryPresenter(App app){
        super(app);
    }

    //网络获取
    public void getAllCategories(){
        getView().showProgress();
        getmAppComponent().getApiService()
                .getAllCategory()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<LiveCategory>>() {
                    @Override
                    public void onCompleted() {
                        if (isViewAttached()){
                            getView().onCompleted();
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (isViewAttached()){
                            getView().onError(e);
                        }
                    }

                    @Override
                    public void onNext(final List<LiveCategory> liveCategories) {
                        Log.d(TAG, "Response:"+liveCategories);
                        ThreadPoolManager.getInstance().execute(new Runnable() {
                            @Override
                            public void run() {
                                getmDaoSession().getLiveCategoryDao().insertOrReplaceInTx(liveCategories);
                            }
                        });
                        if (isViewAttached()){
                            getView().onGetLiveCategory(liveCategories);
                        }
                    }
                });
    }

    //获取数据库中所有的分类
    public void getAllCategoriesByDB(){
        List<LiveCategory> listt = getmDaoSession().getLiveCategoryDao().loadAll();
        Log.d(TAG, "getAllCategoriesByDB: "+listt);
        if (listt!= null && listt.size()>0){
            if (isViewAttached()){
                getView().onGetLiveCategory(listt);
            }
        }
    }






}
