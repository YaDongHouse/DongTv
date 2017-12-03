package com.example.admin.dongtv.mvp.presenter;

import android.util.Log;

import com.example.admin.dongtv.App;
import com.example.admin.dongtv.bean.httpbean.LiveInfo;
import com.example.admin.dongtv.bean.httpbean.LiveListResult;
import com.example.admin.dongtv.bean.httpbean.P;
import com.example.admin.dongtv.bean.httpbean.SearchRequestBody;
import com.example.admin.dongtv.bean.httpbean.SearchResult;
import com.example.admin.dongtv.mvp.base.BasePresenter;
import com.example.admin.dongtv.mvp.view.ILiveListView;
import com.example.admin.dongtv.util.StringUtils;

import java.util.List;

import javax.inject.Inject;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by admin on 2017/12/2.
 */

public class LiveListPresent extends BasePresenter<ILiveListView> {

    private static final String TAG = "LiveListPresent";
    @Inject
    public LiveListPresent(App app) {
        super(app);
    }

    public void getLiveList(String slug){
        if (StringUtils.isBlank(slug)){
            getLiveList();
        }else {
            getLiveBySlug(slug);
        }
    }

    public void getLiveBySlug(String slug) {
        if (isViewAttached()){
            getView().showProgress();
        }
        getmAppComponent().getApiService()
                .getLiveListResultByCategories(slug)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LiveListResult>() {
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
                    public void onNext(LiveListResult liveListResult) {
                        Log.d(TAG, "onNext: "+liveListResult);
                        List<LiveInfo> list = null;
                        if (liveListResult!=null){
                            list = liveListResult.getData();
                        }
                        if (isViewAttached()){
                            getView().onGetLiveList(list);
                        }
                    }
                });
    }

    public void getLiveList(){
        if (isViewAttached()){
            getView().showProgress();
        }
        getmAppComponent().getApiService()
                .getLiveListResult()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<LiveListResult>() {
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
                    public void onNext(LiveListResult liveListResult) {
                        Log.d(TAG, "onNext: "+liveListResult);
                        List<LiveInfo> list = null;
                        if (liveListResult!=null){
                            list = liveListResult.getData();
                        }
                        if (isViewAttached()){
                            getView().onGetLiveList(list);
                        }
                    }
                });

    }

    public void getLiveListByKey(String key,int page){
        getLiveListByKey(key,page, P.DEFAULT_SIZE);
    }
    public void getLiveListByKey(String key, final int page, int pageSize){
        if (isViewAttached()){
            getView().showProgress();
        }
        getmAppComponent().getApiService()
                .search(SearchRequestBody.getInstance(new P(page,key,pageSize)))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<SearchResult, List<LiveInfo>>() {
                    @Override
                    public List<LiveInfo> call(SearchResult searchResult) {
                        Log.d(TAG, "call: "+searchResult);
                        if (searchResult!=null){
                            if (searchResult.getData()!=null){
                                return searchResult.getData().getItems();
                            }else {
                                Log.d(TAG, "call: "+searchResult.toString());
                            }
                        }

                        return null;
                    }
                })
                .onErrorReturn(new Func1<Throwable, List<LiveInfo>>() {
                    @Override
                    public List<LiveInfo> call(Throwable throwable) {
                        throwable.printStackTrace();
                        return null;
                    }
                })
                .subscribe(new Action1<List<LiveInfo>>() {
                    @Override
                    public void call(List<LiveInfo> list) {
                        if (isViewAttached()){
                            if (page>0){
                                getView().onGetMoreLiveList(list);
                            }else {
                                getView().onGetLiveList(list);
                            }
                        }
                    }
                });

    }


}
