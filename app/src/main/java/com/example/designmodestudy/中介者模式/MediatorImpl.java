package com.example.designmodestudy.中介者模式;

/**
 * Created by lishuo on 2020/4/26.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class MediatorImpl implements IMediator {

    private IPeople aPeople;
    private IPeople bPeople;

    public MediatorImpl() {
    }

    @Override
    public void setAPeople(APeople aPeople) {
        this.aPeople = aPeople;
    }

    @Override
    public void setBPeople(BPeople bPeople) {
        this.bPeople = bPeople;
    }

    @Override
    public void callPeople(String msg) {
        //A给B的消息
        bPeople.getMsg(msg);
    }

    @Override
    public void emailPeople(String msg) {
        //B给A的消息
        aPeople.getMsg(msg);
    }

    public void test(){
        ICallContact people = (ICallContact) aPeople;
        people.callPeople("我是A发的消息");
    }
}
