package com.hnpolice.xiaoke.mvpdemo;

/**
 * create by luoxiaoke on 2016/6/8 11:22.
 * use for 登录View的接口，实现类也就是登录的activity
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
