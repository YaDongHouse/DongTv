package com.example.admin.dongtv.dagger.module;

import android.content.Context;

import com.example.admin.dongtv.http.APIService;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by admin on 2017/9/22.
 */


@Singleton
@Module
public class AppModule {


    private static final int DEFAULT_TIME_OUT = 10;

    private Context context;

    private String baseUrl;

    @Singleton
    @Provides
    public Context providesContext(){
        return context;
    }

    @Singleton
    @Provides
    public OkHttpClient providesOkHttpClient(){
        return new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(DEFAULT_TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(DEFAULT_TIME_OUT,TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    public Retrofit providesRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(providesOkHttpClient())
                .build();
    }
    @Provides
    @Singleton
    public APIService providesPIService(){
        return providesRetrofit().create(APIService.class);
    }


















    public AppModule(Context context, String baseUrl) {
        this.context = context;
        this.baseUrl = baseUrl;
    }


}
