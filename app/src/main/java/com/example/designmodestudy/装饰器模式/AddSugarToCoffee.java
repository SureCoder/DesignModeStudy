package com.example.designmodestudy.装饰器模式;

/**
 * Created by lishuo on 2020/4/22.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class AddSugarToCoffee extends CoffeeDecorator {
    public AddSugarToCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int price() {
        return super.price() + 1;
    }

    @Override
    public String ingredients() {
        return super.ingredients() + " 糖";
    }
}
