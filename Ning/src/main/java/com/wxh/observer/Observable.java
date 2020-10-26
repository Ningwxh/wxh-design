package com.wxh.observer;

public interface Observable {
    void registerObservable(Observer observer);
    void removeObservable(Observer observer);
    void notifyObserver();
}
