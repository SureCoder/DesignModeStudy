package com.example.designmodestudy.责任链模式;

import android.util.Log;

/**
 * Created by lishuo on 2020/4/24.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class TwoInterceptor implements Interceptor {
    @Override
    public boolean interceptor(Data data) {
        if (data.age < 200) {
            Log.e("interceptor","TwoInterceptor处理了");
            return true;
        }
        return false;
    }
}
