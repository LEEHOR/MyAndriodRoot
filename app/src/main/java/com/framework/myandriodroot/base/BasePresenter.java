package com.framework.myandriodroot.base;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：控制层
 */
public class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {
    protected T mView;

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }
}
