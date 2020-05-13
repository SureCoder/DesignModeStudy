package com.example.designmodestudy.中介者模式;

import android.util.Log;

/**
 * Created by lishuo on 2020/4/26.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class BPeople implements IEmailContact, IPeople {

    private IMediator mediator;

    public BPeople(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void emailPeople(String msg) {
        mediator.emailPeople(msg);
    }

    @Override
    public void getMsg(String msg) {
        Log.e("B people:",msg);
    }
}
