package com.example.admin.dongtv.mvp.presenter;

import android.util.Log;

import com.example.admin.dongtv.App;
import com.example.admin.dongtv.bean.httpbean.AppStart;
import com.example.admin.dongtv.bean.httpbean.Recommend;
import com.example.admin.dongtv.mvp.base.BasePresenter;
import com.example.admin.dongtv.mvp.view.IRecommendView;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 2017/11/28.
 */

public class RecommendPresenter extends BasePresenter<IRecommendView> {

    private static final String TAG = "RecommendPresenter";
    public RecommendPresenter(App app) {
        super(app);
    }

    public void getRecommend(){
        if (isViewAttached()){
            getView().showProgress();
        }
        getmAppComponent().getApiService()
                .getRecommend()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Recommend>() {
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
                    public void onNext(Recommend recommend) {
                        Log.d(TAG, "Response: "+recommend);
                        if (isViewAttached()){
                            getView().onGetRecommend(recommend);
                        }
                        if (recommend!= null){
                            if (isViewAttached()){
                                getView().onGetRooms(recommend.getRoom());
                            }
                        }
                    }
                });
    }


    public void getBanner(){
        getmAppComponent().getApiService()
                .getAppStartInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<AppStart>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(AppStart appStart) {
                        if (appStart!= null){
                            if (isViewAttached()){
                                getView().onGetBanner(appStart.getBanners());
                            }
                        }
                    }
                });
    }


}
