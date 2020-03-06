package com.example.designmodestudy.观察者模式;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class News implements Observerable {
    private List<Observer> mObserver;
    String text;

    public void setText(String text) {
        this.text = text;
        notifyObserver();
    }

    public News() {
        this.mObserver = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        mObserver.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        mObserver.remove(observer);
    }

    @Override
    public void notifyObserver() {
        if (mObserver.size() == 0) {
            return;
        }
        for (Observer observer : mObserver) {
            observer.update(this);
        }
    }
}
