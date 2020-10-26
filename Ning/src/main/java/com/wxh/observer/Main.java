package com.wxh.observer;

public class Main {
    public static void main(String[] args) {
        final NingObservable ningObservable = new NingObservable();
        final Observer observer = new Observer();
        ningObservable.registerObservable(observer);
        ningObservable.doSomething("通知，通知");
    }
}
