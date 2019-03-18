package com.leehor.baselibrary.recylerview.adapter;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：多布局支持
 */
public interface MultiTypeSupport<T> {
    // 根据当前位置或者条目数据返回布局
    int getLayoutId(T item,int position);
}
