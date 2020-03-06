package com.example.designmodestudy.状态模式;

public class UserHandlerCenter {

    private UserStatus userStatus;

    public static final LoginStatus LOGIN_STATUS = new LoginStatus();
    public static final UnLoginStatus UN_LOGIN_STATUS = new UnLoginStatus();

    /**
     * 设置用户状态
     * @param userStatus userStatus
     */
    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public UserHandlerCenter() {
    }

    public void collect() {
        userStatus.collect();
    }

    public void login() {
        userStatus.login();
    }

    public void loginOut() {
        userStatus.loginOut();
    }

    public void like() {
        userStatus.like();
    }

}
