package com.example.admin.dongtv.http;

import com.example.admin.dongtv.bean.greenbean.LiveCategory;
import com.example.admin.dongtv.bean.httpbean.AppStart;
import com.example.admin.dongtv.bean.httpbean.LiveListResult;
import com.example.admin.dongtv.bean.httpbean.Recommend;
import com.example.admin.dongtv.bean.httpbean.Room;
import com.example.admin.dongtv.bean.httpbean.SearchRequestBody;
import com.example.admin.dongtv.bean.httpbean.SearchResult;


import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by admin on 2017/9/22.
 */

public interface APIService {

    /**
     * 获取App启动页信息
     * @return
     */
    @GET("json/page/app-data/info.json?v=3.0&os=1&ver=4")
    Observable<AppStart> getAppStartInfo();

    /**
     * 获取分类列表
     * @return
     */
    @GET("json/app/index/category/info-android.json?v=3.0&os=1&ver=4")
    Observable<List<LiveCategory>> getAllCategory();

    /**
     * 获取推荐列表
     * @return
     */
    @GET("json/app/index/recommend/list-android.json?v=3.0.1&os=1&ver=4")
    Observable<Recommend> getRecommend();

    /**
     * 获取直播列表
     * @return
     */
    @GET("json/play/list.json?v=3.0.1&os=1&ver=4")
    Observable<LiveListResult> getLiveListResult();

    /**
     * 通过类别获取直播列表
     * @param slug
     * @return
     */
    @GET("json/categories/{slug}/list.json?v=3.0.1&os=1&ver=4")
    Observable<LiveListResult> getLiveListResultByCategories(@Path("slug") String slug);


    /**
     * 进入房间
     * @param uid
     * @return
     */
    @GET("json/rooms/{uid}/info.json?v=3.0.1&os=1&ver=4")
    Observable<Room> enterRoom(@Path("uid") String uid);


    /**
     * 搜索
     * @param searchRequestBody
     * @return
     */
    @POST("site/search")
    Observable<SearchResult> search(@Body SearchRequestBody searchRequestBody);


}
