package com.example.designmodestudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.designmodestudy.状态模式.UserHandlerCenter;
import com.example.designmodestudy.策略模式.Excute;
import com.example.designmodestudy.策略模式.StrategyA;
import com.example.designmodestudy.观察者模式.News;
import com.example.designmodestudy.观察者模式.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obsver();
        celue();
        statusTest();
    }

    /**
     * 泛型观察者模式
     */
    private void obsver(){
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
    private void celue(){
        Excute excute = new Excute(StrategyA.class);
        excute.excute();
    }

    /**
     * 状态模式
     */
    private void statusTest(){
        UserHandlerCenter userCenter = new UserHandlerCenter();
        userCenter.setUserStatus(UserHandlerCenter.UN_LOGIN_STATUS);
        userCenter.like();

    }
}
