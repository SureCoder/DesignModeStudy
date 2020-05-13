package com.example.designmodestudy.empty;

/**
 * Created by lishuo on 2020/5/6.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class UseStrategy {
    IStrategy strategy;

    public UseStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

   public void print(){
        strategy.print();
    }
}
