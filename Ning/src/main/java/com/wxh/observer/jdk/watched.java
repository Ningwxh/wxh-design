package com.wxh.observer.jdk;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Observable;

public class watched extends Observable {
    private Boolean state = true;
    public void changeState(){
        state = !state;
        setChanged();
        notifyObservers(state);
    }
}
