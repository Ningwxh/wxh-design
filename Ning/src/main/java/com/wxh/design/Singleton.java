package com.wxh.design;

public class Singleton {
    // volatile防止重排序导致多线程情况下返回还未初始化的不为空的instance
    public volatile Singleton instance = null;
    private Singleton(){
    }
    public Singleton getInstance(){
        if (instance == null){ // 双重检测
            synchronized (Singleton.class){
                if (instance == null){ // 双重检测
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
