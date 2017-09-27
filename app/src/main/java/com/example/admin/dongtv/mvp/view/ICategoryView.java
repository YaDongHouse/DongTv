package com.example.admin.dongtv.mvp.view;

import com.example.admin.dongtv.bean.greenbean.LiveCategory;
import com.example.admin.dongtv.mvp.base.BaseView;

import java.util.List;

/**
 * Created by admin on 2017/9/23.
 */

public interface ICategoryView extends BaseView {

    /**
     * 获取到分类列表是的展示View
     * @param list
     */
    void onGetLiveCategory(List<LiveCategory> list);
}
