package com.example.designmodestudy.中介者模式;

import android.util.Log;

/**
 * Created by lishuo on 2020/4/26.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class APeople implements ICallContact, IPeople {

    private IMediator mediator;

    public APeople(IMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void callPeople(String msg) {
        mediator.callPeople(msg);
    }

    @Override
    public void getMsg(String msg) {
        Log.e("A people:", msg);
    }
}
