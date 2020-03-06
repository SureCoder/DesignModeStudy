package com.example.designmodestudy.状态模式;

import android.util.Log;

public class UnLoginStatus extends UserStatus {

    @Override
    public void login() {
        userCenter.setUserStatus(UserHandlerCenter.LOGIN_STATUS);
    }

    @Override
    public void loginOut() {
        userCenter.setUserStatus(UserHandlerCenter.UN_LOGIN_STATUS);
    }

    @Override
    public void like() {
        Log.e("设计模式:状态模式","未登录状态，无法like");
    }

    @Override
    public void collect() {
        Log.e("设计模式:状态模式","未登录状态，无法collect");
    }
}
