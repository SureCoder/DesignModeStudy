package com.example.designmodestudy.责任链模式;

import android.util.Log;

/**
 * Created by lishuo on 2020/4/24.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class OneInterceptor implements Interceptor {
    @Override
    public boolean interceptor(Data data) {
        if (data.age < 100) {
            Log.e("interceptor","OneInterceptor处理了");
            return true;
        }
        return false;
    }
}
