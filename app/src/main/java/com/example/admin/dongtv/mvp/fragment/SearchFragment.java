package com.example.admin.dongtv.mvp.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.dongtv.R;
import com.example.admin.dongtv.mvp.base.BaseFragment;
import com.example.admin.dongtv.mvp.base.BasePresenter;
import com.example.admin.dongtv.mvp.base.BaseView;
import com.example.admin.dongtv.util.StringUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by admin on 2017/12/4.
 */

public class SearchFragment extends BaseFragment<BaseView, BasePresenter<BaseView>> {


    @BindView(R.id.ivLeft)
    ImageView ivLeft;
    @BindView(R.id.etKey)
    EditText etKey;
    @BindView(R.id.tvRight)
    TextView tvRight;
    @BindView(R.id.fragment)
    FrameLayout fragment;
    Unbinder unbinder;

    private LiveListFragment liveListFragment;

    public static SearchFragment newInstance() {

        Bundle args = new Bundle();

        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public int getRootViewId() {
        return R.layout.fragment_search;
    }

    @Override
    public void initUI() {
        etKey.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
               if (event.getAction() == KeyEvent.ACTION_UP){
                   if (keyCode == KeyEvent.KEYCODE_ENTER || keyCode == KeyEvent.KEYCODE_SEARCH){
                       clickSearch();
                       return true;
                   }
               }
                return false;
            }
        });
    }

    @Override
    public void initData() {
        liveListFragment = LiveListFragment.newInstance(null,true);
        replaceChildFragment(R.id.fragment,liveListFragment);
    }

    private void clickSearch() {
        if (checkInputKey()){
            hideInputMethod(etKey);
           liveListFragment.search(etKey.getText().toString(),0);
        }
    }

    private void hideInputMethod(EditText etKey) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(etKey.getWindowToken(),0);
        etKey.clearFocus();
    }

    private boolean checkInputKey() {
        if (StringUtils.isBlank(etKey.getText()))
        {
            Toast.makeText(context, R.string.tips_search_keywords_cannot_be_empty, Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }



    @Override
    public BasePresenter<BaseView> createPresenter() {
        return new BasePresenter<>(getApp());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick({R.id.ivLeft,R.id.tvRight})
    public void onViewClicked(View view){
        switch (view.getId()) {
            case R.id.ivLeft:
                finish();
                break;
            case R.id.ivRight:
                clickSearch();
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
