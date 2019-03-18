package com.framework.myandroidroot.di.component;

import android.app.Activity;
import android.content.Context;

import com.framework.myandroidroot.di.module.ActivityModule;
import com.framework.myandroidroot.di.scope.ContextLife;
import com.framework.myandroidroot.di.scope.PerActivity;

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
