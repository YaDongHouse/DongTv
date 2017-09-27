package com.example.admin.dongtv.mvp.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.admin.dongtv.R;
import com.example.admin.dongtv.bean.greenbean.LiveCategory;
import com.example.admin.dongtv.mvp.base.BaseFragment;
import com.example.admin.dongtv.mvp.presenter.CategoryPresenter;
import com.example.admin.dongtv.mvp.view.ICategoryView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by admin on 2017/9/26.
 */

public class HomeFragment extends BaseFragment<ICategoryView, CategoryPresenter> implements ICategoryView {


    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.ivTitle)
    ImageView ivTitle;
    @BindView(R.id.ivRight)
    ImageView ivRight;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.btnMore)
    ImageView btnMore;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.fab)
    FloatingActionButton fab;


    public static HomeFragment newInstance() {
        Bundle args = new Bundle();
        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void showProgress() {

    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {

    }

    /**
     * 获取到分类列表时
     * @param list
     */
    @Override
    public void onGetLiveCategory(List<LiveCategory> list) {

    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initUI() {

    }

    @Override
    public void initData() {

    }

    @Override
    public CategoryPresenter createPresenter() {
        return null;
    }

}
