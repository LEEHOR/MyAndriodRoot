package com.framework.myandriodroot.di.component;

import android.app.Activity;
import android.content.Context;
import com.framework.myandriodroot.di.module.FragmentModule;
import com.framework.myandriodroot.di.scope.ContextLife;
import com.framework.myandriodroot.di.scope.PerFragment;

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
