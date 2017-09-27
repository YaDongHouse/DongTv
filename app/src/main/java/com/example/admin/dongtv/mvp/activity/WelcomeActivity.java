package com.example.admin.dongtv.mvp.activity;

import android.view.animation.Animation;

import com.example.admin.dongtv.R;
import com.king.base.SplashActivity;

/**
 * Created by admin on 2017/9/14.
 */

public class WelcomeActivity extends SplashActivity {
    @Override
    public int getContentViewId() {
        return R.layout.activity_welcome;
    }

    @Override
    public Animation.AnimationListener getAnimationListener() {
        return new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivityFinish(MainActivity.class);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        };
    }
}
