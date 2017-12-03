package com.example.admin.dongtv.mvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.admin.dongtv.R;
import com.example.admin.dongtv.bean.httpbean.Recommend;
import com.king.base.adapter.ViewHolderRecyclerAdapter;
import com.king.base.adapter.holder.ViewHolder;

import java.util.List;

/**
 * Created by admin on 2017/11/29.
 */

public class RecommendChildAdapter extends ViewHolderRecyclerAdapter<Recommend.RoomBean.ListBean> {

    public RecommendChildAdapter(Context context, List<Recommend.RoomBean.ListBean> listData) {
        super(context, listData);
    }

    @Override
    public View buildConvertView(LayoutInflater layoutInflater, ViewGroup parent, int viewType) {
        return inflate(R.layout.list_live_item,null,false);
    }


    @Override
    public void bindViewDatas(ViewHolder holder, Recommend.RoomBean.ListBean listBean, int position) {
        ImageView iv = holder.getView(R.id.tv);
        Glide.with(getContext()).load(listBean.getThumb()).placeholder(R.mipmap.live_default).error(R.mipmap.live_default).crossFade()
                .centerCrop().diskCacheStrategy(DiskCacheStrategy.SOURCE).into(iv);
        holder.setText(R.id.tvTips,listBean.getTitle());
        holder.setText(R.id.tvName,listBean.getNick());
        holder.setText(R.id.tvViewer,listBean.getViews());
    }
}
