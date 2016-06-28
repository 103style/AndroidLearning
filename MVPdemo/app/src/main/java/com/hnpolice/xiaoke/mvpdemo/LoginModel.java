package com.hnpolice.xiaoke.mvpdemo;

import com.hnpolice.xiaoke.mvpdemo.presenter.OnLoginFinishedListener;

/**
 * create by luoxiaoke on 2016/6/8 11:21.
 * use for 模拟登录的操作的接口，实现类为LoginModelImpl.相当于MVP模式中的Model
 */
public interface LoginModel {
    void login(String username, String password, OnLoginFinishedListener listener);
}
