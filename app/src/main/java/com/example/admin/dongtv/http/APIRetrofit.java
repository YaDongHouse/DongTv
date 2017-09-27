package com.example.admin.dongtv.http;

import com.example.admin.dongtv.Constants;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 2017/9/22.
 */

public class APIRetrofit {

    /**
     * 默认超时 时间
     */
    private static final int DEFAULT_TIME_OUT = 10;

    private static Retrofit sRetrofit;

    private static OkHttpClient sOkHttpClient;


    public static Retrofit getInstance() {
        if (sRetrofit == null) {
            synchronized (APIRetrofit.class) {
                if (sRetrofit == null) {
                    sRetrofit = new Retrofit.Builder()
                            .baseUrl(Constants.BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                            .client(getsOkHttpClient())
                            .build();
                }
            }
        }
        return sRetrofit;
    }

    public static OkHttpClient getsOkHttpClient() {
        if (null == sOkHttpClient) {
            synchronized (APIRetrofit.class) {
                if (null == sOkHttpClient) {
                    sOkHttpClient = new OkHttpClient.Builder()
                            .connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                            .readTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                            .writeTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                            .build();
                }
            }
        }
        return sOkHttpClient;
    }


}
