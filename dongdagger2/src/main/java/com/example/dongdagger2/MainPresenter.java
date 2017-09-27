package com.example.dongdagger2;

/**
 * Created by admin on 2017/9/22.
 */

public class MainPresenter {
    private MainConstract.View mView;

    public MainPresenter(MainConstract.View mView) {
        this.mView = mView;
    }
    public void loadData(){
        //回掉方法成功时
        mView.updateUI();
    }
}
