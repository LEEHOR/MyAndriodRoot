package com.leehor.baselibrary.recylerview.refreshload;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.leehor.baselibrary.R;
import com.leehor.baselibrary.recylerview.widget.LoadRefreshRecyclerView;
import com.leehor.baselibrary.recylerview.widget.RefreshViewCreator;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：刷新头部辅助类
 */
public class BestMissRefreshCreator extends RefreshViewCreator {
    // 加载数据的ImageView
    private ImageView mRefreshIv;
    @Override
    public View getRefreshView(Context context, ViewGroup parent) {
        View refreshView = LayoutInflater.from(context).inflate(R.layout.layout__bestmiss_refresh_header_view, parent, false);
        mRefreshIv = refreshView.findViewById(R.id.img_progress);
        return refreshView;
    }

    @Override
    public void onPull(int currentDragHeight, int refreshViewHeight, int currentRefreshStatus) {
        if (currentRefreshStatus == LoadRefreshRecyclerView.LOAD_STATUS_PULL_DOWN_REFRESH) {
            mRefreshIv.setImageResource(R.drawable.list_view_pull);
        }
        if (currentRefreshStatus == LoadRefreshRecyclerView.LOAD_STATUS_LOOSEN_LOADING) {
            mRefreshIv.setImageResource(R.drawable.list_view_release);
        }
    }

    @Override
    public void onRefreshing() {
        mRefreshIv.setImageResource(R.drawable.load_more_anim);
        ((AnimationDrawable) mRefreshIv.getBackground()).start();
    }

    @Override
    public void onStopRefresh() {
        // 停止加载的时候清除动画
        mRefreshIv.setRotation(0);
        ((AnimationDrawable) mRefreshIv.getBackground()).stop();
        mRefreshIv.clearAnimation();
    }
}
