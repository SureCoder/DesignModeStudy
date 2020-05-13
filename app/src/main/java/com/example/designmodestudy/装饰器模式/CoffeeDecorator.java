package com.example.designmodestudy.装饰器模式;

/**
 * Created by lishuo on 2020/4/22.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class CoffeeDecorator implements Coffee {
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int price() {
        return coffee.price();
    }

    @Override
    public String ingredients() {
        return coffee.ingredients();
    }
}
