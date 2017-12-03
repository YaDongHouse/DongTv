package com.example.admin.dongtv.mvp.fragment;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.admin.dongtv.Constants;
import com.example.admin.dongtv.R;
import com.example.admin.dongtv.bean.greenbean.LiveCategory;
import com.example.admin.dongtv.mvp.base.BaseFragment;
import com.example.admin.dongtv.mvp.presenter.CategoryPresenter;
import com.example.admin.dongtv.mvp.view.ICategoryView;
import com.king.base.adapter.ViewPagerFragmentAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

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

    private ViewPagerFragmentAdapter viewPagerFragmentAdapter;

    private List<LiveCategory> listCategory;

    private List<CharSequence> listTitle;

    private List<Fragment> listData;



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
        if (list!= null){
            toSetList(listCategory,list,false);
            List<CharSequence> listTemp = new ArrayList<>();
            //--------------------
            listTemp.add(getText(R.string.recommend));
            listData.add(RecommendFragment.newInstance());
            listTemp.add(getString(R.string.tab_all));
            listData.add(LiveListFragment.newInstance(null));

            for (int i = 0; i < list.size(); i++) {
                LiveCategory liveCategory = list.get(i);
                listTemp.add(liveCategory.getName());
                listData.add(LiveListFragment.newInstance(liveCategory.getSlug()));
            }
            toSetList(listTitle,listTemp,false);
        }
        if (viewPagerFragmentAdapter!=null){
            viewPagerFragmentAdapter.setListTitle(listTitle);
            viewPagerFragmentAdapter.setListData(listData);
            viewPagerFragmentAdapter.notifyDataSetChanged();
        }

    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initUI() {
        listCategory = new ArrayList<>();
        listTitle = new ArrayList<>();
        listData = new ArrayList<>();

        viewPagerFragmentAdapter = new ViewPagerFragmentAdapter(getChildFragmentManager(),listData,listTitle);

        viewPager.setAdapter(viewPagerFragmentAdapter);

        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void initData() {
        getPresenter().getAllCategories();
    }

    @Override
    public CategoryPresenter createPresenter() {
        return new CategoryPresenter(getApp());
    }

    @OnClick({R.id.ivLeft,R.id.ivRight,R.id.btnMore,R.id.fab})
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.ivLeft:
                startActivity(getFragmentIntent(Constants.SEARCH_FRAGMENT));
                break;
            case R.id.ivRight:
                startLogin();
                break;
            case R.id.btnMore:
                break;
            case R.id.fab:
                startAbout();
                break;
        }
    }

}
