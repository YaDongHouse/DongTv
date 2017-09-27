package com.example.dongdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainConstract.View{

    private MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化presenter 将
        mainPresenter = new MainPresenter(this);

        mainPresenter.loadData();
    }

    @Override
    public void updateUI() {

    }
}
