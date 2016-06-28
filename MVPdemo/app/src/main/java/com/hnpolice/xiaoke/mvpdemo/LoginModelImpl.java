package com.hnpolice.xiaoke.mvpdemo;

import android.os.Handler;
import android.text.TextUtils;

import com.hnpolice.xiaoke.mvpdemo.presenter.OnLoginFinishedListener;

/**
 * create by luoxiaoke on 2016/6/8 11:21.
 * use for 延时模拟登录（2s），如果名字或者密码为空则登录失败，否则登录成功
 */
public class LoginModelImpl implements LoginModel {
    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();//model层里面回调listener
                    error = true;
                }
                if (TextUtils.isEmpty(password)) {
                    listener.onPasswordError();
                    error = true;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
