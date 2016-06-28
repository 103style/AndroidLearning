package com.hnpolice.xiaoke.mvpdemo.presenter;

/**
 * create by luoxiaoke on 2016/6/8 11:23.
 * use for 登录的Presenter 的接口，实现类为LoginPresenterImpl，完成登录的验证，以及销毁当前view
 */
public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
