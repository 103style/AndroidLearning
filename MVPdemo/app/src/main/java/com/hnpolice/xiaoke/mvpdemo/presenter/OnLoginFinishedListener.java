package com.hnpolice.xiaoke.mvpdemo.presenter;

/**
 * create by luoxiaoke on 2016/6/8 11:24.
 * use for 登录事件监听
 */
public interface OnLoginFinishedListener {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
