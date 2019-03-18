package com.framework.myandroidroot.di.component;

import android.content.Context;

import com.framework.myandroidroot.di.module.ApplicationModule;
import com.framework.myandroidroot.di.scope.ContextLife;
import com.framework.myandroidroot.di.scope.PerApp;

import dagger.Component;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：
 */
@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ContextLife("Application")
    Context getApplication();
}
