package com.example.designmodestudy.装饰器模式;

/**
 * Created by lishuo on 2020/4/22.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class NormalCoffee implements Coffee {
    @Override
    public int price() {
        return 1;
    }

    @Override
    public String ingredients() {
        return "配料: 咖啡豆";
    }

    public void test(){

    }
}
