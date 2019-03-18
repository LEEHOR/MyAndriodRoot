package com.framework.myandriodroot.di.component;

import android.content.Context;

import com.framework.myandriodroot.di.module.ApplicationModule;
import com.framework.myandriodroot.di.scope.ContextLife;
import com.framework.myandriodroot.di.scope.PerActivity;
import com.framework.myandriodroot.di.scope.PerApp;

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
