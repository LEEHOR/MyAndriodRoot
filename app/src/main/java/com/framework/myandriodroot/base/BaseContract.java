package com.framework.myandriodroot.base;

import com.trello.rxlifecycle2.LifecycleTransformer;

/**
 * @author Leehor
 * 版本：
 * 创建日期：2019/3/18
 * 描述：接口层
 */
public interface BaseContract {
    public interface BasePresenter<T extends BaseContract.BaseView> {
        void attachView(T view);

        void detachView();
    }

    public interface BaseView {
        //显示进度中
        void showLoading();

        //隐藏进度
        void hideLoading();

        //显示请求成功
        void showSuccess(String message);

        //失败重试
        void showFaild(String message);

        //显示当前网络不可用
        void showNoNet();

        //重试
        void onRetry();

        /**
         * 绑定生命周期
         *
         * @param <T>
         * @return
         */
        <T> LifecycleTransformer<T> bindToLife();
    }
}
