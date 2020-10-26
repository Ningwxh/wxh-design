package com.wxh.observer;

public class Observer {
    String name;
    String message;

    public void update(String message){
        this.message = message;
        System.out.println("观察到message修改为: " + message);
    }

}
