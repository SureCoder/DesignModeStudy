package com.example.designmodestudy.中介者模式;

/**
 * Created by lishuo on 2020/4/26.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public interface IMediator extends ICallContact, IEmailContact {

    void setAPeople(APeople people);
    void setBPeople(BPeople people);


}
