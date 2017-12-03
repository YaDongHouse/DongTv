package com.example.admin.dongtv.mvp.view;

import com.example.admin.dongtv.bean.httpbean.Banner;
import com.example.admin.dongtv.bean.httpbean.Recommend;
import com.example.admin.dongtv.mvp.base.BaseView;

import java.util.List;

/**
 * Created by admin on 2017/11/27.
 */

public interface IRecommendView extends BaseView {

    void onGetRecommend(Recommend recommend);

    void onGetRooms(List<Recommend.RoomBean> list);

    void onGetBanner(List<Banner> list);

}
