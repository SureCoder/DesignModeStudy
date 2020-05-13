package com.example.designmodestudy.责任链模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lishuo on 2020/4/24.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public class InterceptorChainImpl implements InterceptorChain {

    private List<Interceptor> mInterceptors = new ArrayList<>();

    @Override
    public boolean process(Data data) {
        for (Interceptor interceptor : mInterceptors) {
            if (interceptor.interceptor(data)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addInterceptor(Interceptor interceptor){
        mInterceptors.add(interceptor);
    }

}
