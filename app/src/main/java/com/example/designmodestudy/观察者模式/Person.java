package com.example.designmodestudy.观察者模式;

import android.util.Log;

public class Person implements Observer<News> {


    @Override
    public void update(News observerable) {
        Log.e("设计模式：泛型观察者模式", "有新闻发布了：" + observerable.text);
    }
}
