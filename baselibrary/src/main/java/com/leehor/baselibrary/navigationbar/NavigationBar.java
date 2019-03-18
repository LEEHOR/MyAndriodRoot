package com.leehor.baselibrary.navigationbar;

import android.content.Context;
import android.view.ViewGroup;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：
 */
public class NavigationBar extends AbsNavigationBar {
    NavigationBar(Builder builder) {
        super(builder);
    }
    public static class Builder extends AbsNavigationBar.Builder<NavigationBar.Builder> {

        public Builder(Context context, int layoutId, ViewGroup parent) {
            super(context, layoutId, parent);
        }

        @Override
        public NavigationBar create() {
            return new NavigationBar(this);
        }
    }
}
