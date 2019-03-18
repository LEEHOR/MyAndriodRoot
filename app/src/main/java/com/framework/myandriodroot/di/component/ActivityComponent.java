package com.framework.myandriodroot.di.component;

import android.app.Activity;
import android.content.Context;

import com.framework.myandriodroot.di.module.ActivityModule;
import com.framework.myandriodroot.di.scope.ContextLife;
import com.framework.myandriodroot.di.scope.PerActivity;

import dagger.Component;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

    //void inject([CLASS.NAME].class);
}
