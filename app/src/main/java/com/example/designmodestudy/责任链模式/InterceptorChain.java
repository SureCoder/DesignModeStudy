package com.example.designmodestudy.责任链模式;

/**
 * Created by lishuo on 2020/4/24.
 *
 * @author lishuo
 * @email shuo1.li@ximalaya.com
 * @phoneNumber 18202765712
 */
public interface InterceptorChain {

    boolean process(Data data);
    void addInterceptor(Interceptor interceptor);
}
