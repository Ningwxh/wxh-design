package com.wxh.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class watcher implements Observer {
    public void update(Observable o, Object arg) {
        final Boolean arg1 = (Boolean) arg;
        if (arg1){
            System.out.println("开");
        } else {
            System.out.println("关");
        }
    }
}
