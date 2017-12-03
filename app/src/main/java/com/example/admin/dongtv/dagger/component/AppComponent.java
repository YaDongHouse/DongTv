package com.example.admin.dongtv.dagger.component;

import android.content.Context;

import com.example.admin.dongtv.App;
import com.example.admin.dongtv.dagger.module.AppModule;
import com.example.admin.dongtv.http.APIService;

import javax.inject.Singleton;

import dagger.Component;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Created by admin on 2017/9/22.
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);

    Context getContext();

    Retrofit getRetrofit();

    OkHttpClient getOkHttpClient();

    APIService getApiService();


}
