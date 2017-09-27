package com.example.admin.dongtv.mvp.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;

import com.example.admin.dongtv.App;
import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by admin on 2017/9/26.
 */

public abstract class BaseActivity<V extends MvpView,P extends MvpPresenter<V>> extends MvpActivity<V,P>{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getRootViewId());
        initUI();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    public <T> void toSetList(List<T> list,List<T> newList,boolean isMore){

        if (list!= null&&newList!=null){
            synchronized (BaseActivity.class) {
                if (!isMore){
                    list.clear();
                }
                list.addAll(newList);
            }
        }
    }

    public App getApp(){
        return (App) getApplication();
    }


    public abstract int getRootViewId();

    public abstract void initUI();

    public abstract void initData();
}
