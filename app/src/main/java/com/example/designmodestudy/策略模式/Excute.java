package com.example.designmodestudy.策略模式;

public class Excute {
    Strategy strategy;

    public Excute(Class<? extends Strategy> c) {
        try {
            this.strategy = c.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public void excute(){
        strategy.dosome();
    }
}
