package com.example.admin.dongtv.mvp.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;

import com.example.admin.dongtv.R;
import com.example.admin.dongtv.mvp.base.PureActivity;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends PureActivity {
    @BindView(R.id.rbHome)
    RadioButton rbHome;
    @BindView(R.id.rbLive)
    RadioButton rbLive;
    @BindView(R.id.rbFollw)
    RadioButton rbFollw;
    @BindView(R.id.rbMe)
    RadioButton rbMe;

//    private HomeFragment homeFragment;
//
//    private LiveFragment liveFragment;
//
//    private FollowFragment followFragment;
//
//    private MineFragment mineFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override
    public int getRootViewId() {
        return R.layout.activity_main;
    }

    @Override
    public void initUI() {
        showHomeFragment();
    }

    /**
     * 展示主Fragment
     */
    public void showHomeFragment() {
        //1-1开启事务
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        //1-2隐藏所有主Fragment
        hideAllFragment(fragmentTransaction);
        //1-3检查并把主页fragment添加到事务里
//        if(homeFragment == null){
//            homeFragment = HomeFragment.newInstance();
//            fragmentTransaction.add(R.id.fragmentContent,homeFragment);
//        }
//        //1-4提交事务
//        commitShowFragment(fragmentTransaction,homeFragment);
    }

    /**
     * 隐藏所有Fragment
     *
     * @param fragmentTransaction
     */
    public void hideAllFragment(FragmentTransaction fragmentTransaction) {
//        hideFragment(fragmentTransaction,homeFragment);
//        hideFragment(fragmentTransaction,liveFragment);
//        hideFragment(fragmentTransaction,followFragment);
//        hideFragment(fragmentTransaction,mineFragment);
    }

    /**
     * 隐藏单个Fragment这只适用于将视图添加到容器中的Fragment，因为这将导致视图被隐藏。
     *
     * @param fragmentTransaction
     * @param fragment
     */
    private void hideFragment(FragmentTransaction fragmentTransaction, Fragment fragment) {
        if (fragment != null) {
            fragmentTransaction.hide(fragment);
        }
    }

    /**
     * 提交事务
     *
     * @param fragmentTransaction
     * @param fragment
     */
    public void commitShowFragment(FragmentTransaction fragmentTransaction, Fragment fragment) {
        fragmentTransaction.show(fragment);
        fragmentTransaction.commit();
    }
}
