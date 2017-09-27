package com.example.admin.dongtv.mvp.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.example.admin.dongtv.R;

/**
 * Created by admin on 2017/9/14.
 */

public abstract class PureActivity extends AppCompatActivity {

    private static final int INVALID_VAL = -1;
    private static final int COLOR_DEFAULT = Color.parseColor("#7f000000");

    protected Context context;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        context = this;
        //设置xml文件
        setContentView(getRootViewId());
        //UI初始化
        initUI();
        //设置状态栏颜色
        setStatusViewColor(getResources().getColor(R.color.colorPrimaryDark));
    }
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public  void setStatusViewColor(int statusColor){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            if (statusColor != INVALID_VAL) {
                getWindow().setStatusBarColor(statusColor);
            }
            return;
        }
//
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            int color = COLOR_DEFAULT;
            ViewGroup contentView = (ViewGroup) findViewById(android.R.id.content);
            if (statusColor != INVALID_VAL) {
                color = statusColor;
            }
            View statusBarView = new View(this);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    getStatusBarHeight(this));
            statusBarView.setBackgroundColor(color);
            contentView.addView(statusBarView, lp);
        }
    }

    public int getStatusBarHeight(Context context) {
        int result = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = context.getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public abstract int getRootViewId();

    public abstract void initUI();
}
