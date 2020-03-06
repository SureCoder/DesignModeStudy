package com.example.designmodestudy.策略模式;

import android.util.Log;

import com.example.designmodestudy.策略模式.Strategy;

public class StrategyB implements Strategy {
    @Override
    public void dosome() {
        Log.e("设计模式:策略模式","StrategyBBBBBB");
    }
}
