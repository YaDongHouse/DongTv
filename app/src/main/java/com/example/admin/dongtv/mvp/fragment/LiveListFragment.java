package com.example.admin.dongtv.mvp.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.admin.dongtv.R;
import com.example.admin.dongtv.bean.httpbean.LiveInfo;
import com.example.admin.dongtv.bean.httpbean.P;
import com.example.admin.dongtv.mvp.adapter.EasyLiveAdapter;
import com.example.admin.dongtv.mvp.base.BaseFragment;
import com.example.admin.dongtv.mvp.presenter.LiveListPresent;
import com.example.admin.dongtv.mvp.view.ILiveListView;
import com.example.admin.dongtv.util.DensityUtil;
import com.example.admin.dongtv.util.StringUtils;
import com.example.admin.dongtv.util.SystemUtils;
import com.jude.easyrecyclerview.EasyRecyclerView;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.SpaceDecoration;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * Created by admin on 2017/12/2.
 */

public class LiveListFragment extends BaseFragment<ILiveListView,LiveListPresent> implements ILiveListView{

    View loadMore;
    TextView tvEmpty;
    TextView tvTips;

    @BindView(R.id.easyRecyclerView)
    EasyRecyclerView easyRecyclerView;

    EasyLiveAdapter easyLiveAdapter;

    List<LiveInfo> listData;

    private String slug;

    private boolean isSearch;

    private int page;

    private String key;

    private boolean isMore;

    public static LiveListFragment newInstance(String slug) {
        return newInstance(slug,false);
    }

    public static LiveListFragment newInstance(String slug, boolean isSearch) {

        Bundle args = new Bundle();

        LiveListFragment fragment = new LiveListFragment();
        fragment.slug = slug;
        fragment.isSearch = isSearch;
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getRootViewId() {
        return R.layout.fragment_live_list;
    }

    @Override
    public void initUI() {

        tvTips = easyRecyclerView.findViewById(R.id.tvTips);
        tvEmpty = easyRecyclerView.findViewById(R.id.tvEmpty);

        SpaceDecoration spaceDecoration = new SpaceDecoration(DensityUtil.dp2px(context,6));
        easyRecyclerView.addItemDecoration(spaceDecoration);
        easyRecyclerView.setRefreshingColor(R.color.progress_color);
        listData = new ArrayList<>();
        easyLiveAdapter = new EasyLiveAdapter(context,listData,isSearch);
        easyLiveAdapter.setNotifyOnChange(false);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context,2);
        gridLayoutManager.setSpanSizeLookup(easyLiveAdapter.obtainGridSpanSizeLookUp(2));
        easyRecyclerView.setLayoutManager(gridLayoutManager);

        easyRecyclerView.setAdapter(easyLiveAdapter);
        easyRecyclerView.setRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (isSearch){
                    if (!StringUtils.isBlank(key)){
                        page = 0;
                        getPresenter().getLiveListByKey(key,page);
                    }
                }else {
                    getPresenter().getLiveList(slug);
                }
            }
        });

        if (isSearch){
            loadMore = LayoutInflater.from(context).inflate(R.layout.layout_more,null);
            easyLiveAdapter.setMore(loadMore, new RecyclerArrayAdapter.OnMoreListener() {
                @Override
                public void onMoreShow() {
                    if (isMore){
                        if (loadMore != null){
                            loadMore.setVisibility(View.VISIBLE);
                        }
                        getPresenter().getLiveListByKey(key,page);
                    }
                }

                @Override
                public void onMoreClick() {

                }
            });
        }

        easyLiveAdapter.setOnItemClickListener(new RecyclerArrayAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                startRoom(easyLiveAdapter.getItem(position));
            }
        });

    }

    public void search(String key,int page){
        this.key = key;
        this.page = page;
        getPresenter().getLiveListByKey(key,page);
    }


    @Override
    public void initData() {
        if (!isSearch){
            easyRecyclerView.showProgress();
            getPresenter().getLiveList(slug);
        }
    }

    @Override
    public LiveListPresent createPresenter() {
        return new LiveListPresent(getApp());
    }

    public void refreshView(){
        easyLiveAdapter.notifyDataSetChanged();
        easyRecyclerView.setRefreshing(false);
        if (easyLiveAdapter.getCount() == 0){
            if (isSearch){
                if (SystemUtils.isNetWorkActive(context)){
                    tvEmpty.setText(R.string.can_not_find_relevant_content);
                }else {
                    tvTips.setText(R.string.network_unavailable);
                }
            }else {
                tvEmpty.setText(R.string.swipe_down_to_refresh);
            }
            easyRecyclerView.showEmpty();
        }

        if (isSearch){
            if (easyLiveAdapter.getCount() >= (page+1)* P.DEFAULT_SIZE){
                page++;
                isMore = true;
            }else {
                if (loadMore!=null){
                    loadMore.setVisibility(View.GONE);
                }
                isMore = false;
            }
        }
    }

    @Override
    public void onGetLiveList(List<LiveInfo> list) {

        easyLiveAdapter.clear();
        easyLiveAdapter.addAll(list);
        refreshView();
    }

    @Override
    public void onGetMoreLiveList(List<LiveInfo> list) {
        easyLiveAdapter.addAll(list);
        refreshView();
    }



    @Override
    public void showProgress() {

    }

    @Override
    public void onCompleted() {
        easyRecyclerView.setRefreshing(false);
    }

    @Override
    public void onError(Throwable e) {
        Log.d(TAG, "onError: ");
        e.printStackTrace();
        if (SystemUtils.isNetWorkActive(context)){
            tvTips.setText(R.string.page_load_failed);
        }else {
            tvTips.setText(R.string.network_unavailable);
        }
        easyRecyclerView.showError();
    }

    private static final String TAG = "LiveListFragment";


}
