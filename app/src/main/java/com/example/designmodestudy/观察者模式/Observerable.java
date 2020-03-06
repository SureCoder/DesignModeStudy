package com.example.designmodestudy.观察者模式;

public interface Observerable {
     void register(Observer observer);

     void unregister(Observer observer);

    void notifyObserver();
}
