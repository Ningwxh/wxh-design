package com.wxh.factory.simpleFactory;

public class TxtLog implements Loggers{
    public void write() {
        System.out.println("write into txt");
    }
}
