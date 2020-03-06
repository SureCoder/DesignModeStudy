package com.example.designmodestudy.状态模式;

public abstract class UserStatus {

    /**
     * 操作中心
     */
    protected UserHandlerCenter userCenter;

    public abstract void collect();

    public abstract void login();

    public abstract void loginOut();

    public abstract void like();

    public void setUserCenter(UserHandlerCenter userCenter) {
        this.userCenter = userCenter;
    }


}
