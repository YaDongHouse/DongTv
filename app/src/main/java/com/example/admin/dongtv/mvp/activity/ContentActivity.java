package com.example.admin.dongtv.mvp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.admin.dongtv.Constants;
import com.example.admin.dongtv.R;
import com.example.admin.dongtv.mvp.fragment.SearchFragment;

/**
 * Created by admin on 2017/12/4.
 */

public class ContentActivity extends AppCompatActivity {

    private static final String TAG = "ContentActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.centent);

        switchFragment(getIntent());

    }

    private void switchFragment(Intent intent) {

        int fragmentKey = intent.getIntExtra(Constants.KEY_FRAGMENT, 0);
        switch (fragmentKey){
            case Constants.ROOM_FRAGMENT:
                break;
            case Constants.LIVE_FRAGMENT:
                break;
            case Constants.WEB_FRAGMENT:
                break;
            case Constants.LOGIN_FRAGMENT:
                break;
            case Constants.ABOUT_FRAGMENT:
                break;
            case Constants.FULL_ROOM_FRAGMENT:
                break;
            case Constants.SEARCH_FRAGMENT:
                replaceFragment(SearchFragment.newInstance());
                break;
            default:
                Log.d(TAG, "Not found fragment : "+Integer.toHexString(fragmentKey));
                break;
        }
    }

    public void replaceFragment(Fragment fragment){
        replaceFragment(R.id.fragmentContent,fragment);
    }

    public void replaceFragment(@IdRes int id,Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(id,fragment).commit();
    }

}
