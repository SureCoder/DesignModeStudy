package com.example.designmodestudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.LruCache;

import com.example.designmodestudy.empty.OneStrategy;
import com.example.designmodestudy.empty.UseStrategy;
import com.example.designmodestudy.中介者模式.APeople;
import com.example.designmodestudy.中介者模式.BPeople;
import com.example.designmodestudy.中介者模式.IMediator;
import com.example.designmodestudy.中介者模式.MediatorImpl;
import com.example.designmodestudy.命令模式.CopyCommand;
import com.example.designmodestudy.命令模式.ICommand;
import com.example.designmodestudy.命令模式.IReciver;
import com.example.designmodestudy.命令模式.Reciver;
import com.example.designmodestudy.状态模式.UserHandlerCenter;
import com.example.designmodestudy.策略模式.Excute;
import com.example.designmodestudy.策略模式.StrategyA;
import com.example.designmodestudy.装饰器模式.AddMilkToCoffee;
import com.example.designmodestudy.装饰器模式.AddSugarToCoffee;
import com.example.designmodestudy.装饰器模式.Coffee;
import com.example.designmodestudy.装饰器模式.CoffeeDecorator;
import com.example.designmodestudy.装饰器模式.NormalCoffee;
import com.example.designmodestudy.观察者模式.News;
import com.example.designmodestudy.观察者模式.Person;
import com.example.designmodestudy.责任链模式.Data;
import com.example.designmodestudy.责任链模式.Interceptor;
import com.example.designmodestudy.责任链模式.InterceptorChain;
import com.example.designmodestudy.责任链模式.InterceptorChainImpl;
import com.example.designmodestudy.责任链模式.OneInterceptor;
import com.example.designmodestudy.责任链模式.ThreeInterceptor;
import com.example.designmodestudy.责任链模式.TwoInterceptor;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LruCache<String, String> cache;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obsver();
        celue();
        statusTest();
        decorator();
        interceptor();
        mediator();
        command();


    }

    private void mediator() {
        MediatorImpl mediator = new MediatorImpl();
        mediator.setAPeople(new APeople(mediator));
        mediator.setBPeople(new BPeople(mediator));
        mediator.test();
    }


    /**
     * 泛型观察者模式
     */
    private void obsver() {
        News news = new News();
        Person p1 = new Person();
        Person p2 = new Person();
        news.register(p1);
        news.register(p2);
        news.setText("股市大爆炸");
    }

    /**
     * 策略模式
     */
    private void celue() {
//        Excute excute = new Excute(StrategyA.class);
//        excute.excute();
        UseStrategy strategy =new UseStrategy(new OneStrategy());
        strategy.print();
    }

    /**
     * 状态模式
     */
    private void statusTest() {
        UserHandlerCenter userCenter = new UserHandlerCenter();
        userCenter.setUserStatus(UserHandlerCenter.UN_LOGIN_STATUS);
        userCenter.like();

    }

    /**
     * 装饰器模式
     */
    private void decorator() {
        NormalCoffee normalCoffee = new NormalCoffee();
        Coffee c = new AddMilkToCoffee(new AddSugarToCoffee(normalCoffee));
        Log.e("decorator", "" + c.ingredients() + "  " + c.price());

    }

    /**
     * 责任链模式
     */
    private void interceptor() {
        Data data = new Data(150);
        InterceptorChain chain = new InterceptorChainImpl();
        chain.addInterceptor(new OneInterceptor());
        chain.addInterceptor(new TwoInterceptor());
        chain.addInterceptor(new ThreeInterceptor());
        chain.process(data);
    }


    private void command(){
        IReciver reciver = new Reciver();
        ICommand command = new CopyCommand(reciver);
        command.execute();
    }



}
