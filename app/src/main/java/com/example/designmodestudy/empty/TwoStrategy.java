package com.example.designmodestudy.empty;

import android.util.Log;

/**
 * Created by lishuo on 2020/5/6.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class TwoStrategy implements IStrategy{
    @Override
    public void print() {
        Log.e("策略","print:Two");
    }
}
