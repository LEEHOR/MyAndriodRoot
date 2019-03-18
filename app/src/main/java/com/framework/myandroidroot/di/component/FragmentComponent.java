package com.framework.myandroidroot.di.component;

import android.app.Activity;
import android.content.Context;
import com.framework.myandroidroot.di.module.FragmentModule;
import com.framework.myandroidroot.di.scope.ContextLife;
import com.framework.myandroidroot.di.scope.PerFragment;

import dagger.Component;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class,modules=FragmentModule.class)
public interface FragmentComponent {
    @ContextLife("Activity")
    Context getAcitivtyContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getAcitivty();

    //void inject([CLASS.NAME].class);
}
