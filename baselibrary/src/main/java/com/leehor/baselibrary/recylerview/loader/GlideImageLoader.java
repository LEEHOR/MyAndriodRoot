package com.leehor.baselibrary.recylerview.loader;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.leehor.baselibrary.recylerview.adapter.ViewHolder;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：图片加载
 */
public class GlideImageLoader extends ViewHolder.HolderImageLoader {
    public GlideImageLoader(String imagePath) {
        super(imagePath);
    }

    @Override
    public void displayImage(Context context, ImageView imageView, String imagePath) {
        Glide.with(context).load(imagePath).centerCrop().into(imageView);
    }
}
