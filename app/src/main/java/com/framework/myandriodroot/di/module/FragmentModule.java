package com.framework.myandriodroot.di.module;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import com.framework.myandriodroot.di.scope.ContextLife;
import com.framework.myandriodroot.di.scope.PerFragment;

import dagger.Module;
import dagger.Provides;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：实例化对象已向外界展示@Provides修饰的方法
 * @Module 其实Module 其实是一个简单工厂模式，Module 里面的方法都是创建相应类实例的方法
 * @Provides 标注该 Module 可以向外界提供的类的实例对象的方法
 */
@Module
public class FragmentModule {
    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        mFragment = fragment;
    }

    @PerFragment
    @Provides
    @ContextLife("Activity")
    public Context provideActivityContext() {
        return mFragment.getActivity();
    }

    @Provides
    @PerFragment
    public Activity provideActivity() {
        return mFragment.getActivity();
    }

    @Provides
    @PerFragment
    public Fragment provideFragment() {
        return mFragment;
    }
}
