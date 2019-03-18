package com.leehor.baselibrary.navigationbar;

import android.view.View;
import android.view.ViewGroup;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：
 */
public interface INavigation {
    /**
     * 创建View
     */
     void createNavigationBar();
    /**
     * 添加参数
     */
     void attachNavigationParams();

     void attachParent(View navigationBarView, ViewGroup parent);
}
