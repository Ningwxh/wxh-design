package com.wxh.observer;

import java.util.ArrayList;
import java.util.List;

public class NingObservable implements Observable{

    private List<Observer> someObserver = new ArrayList<Observer>();
    private String message;

    public void registerObservable(Observer observer) {
        someObserver.add(observer);


    }

    public void removeObservable(Observer observer) {

        someObserver.remove(observer);

    }

    public void notifyObserver() {
        for (Observer observer : someObserver) {
            observer.update(this.message);
        }
    }

    public void doSomething(String message){
        this.message = message;
        System.out.println("修改信息为：" + this.message);
        notifyObserver();
    }
}
