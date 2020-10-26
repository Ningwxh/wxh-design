package com.wxh.factory.simpleFactory;

public class DbLog implements Loggers{
    public void write() {
        System.out.println("Writer into db");
    }
}
