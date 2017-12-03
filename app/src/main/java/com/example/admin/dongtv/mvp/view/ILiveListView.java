package com.example.admin.dongtv.mvp.view;

import com.example.admin.dongtv.bean.httpbean.LiveInfo;
import com.example.admin.dongtv.mvp.base.BaseView;

import java.util.List;

/**
 * Created by admin on 2017/12/2.
 */

public interface ILiveListView extends BaseView{

    void onGetLiveList(List<LiveInfo> list);
    void onGetMoreLiveList(List<LiveInfo> list);
}
