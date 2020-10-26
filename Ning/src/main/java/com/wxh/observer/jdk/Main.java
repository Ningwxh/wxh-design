package com.wxh.observer.jdk;

public class Main {
    public static void main(String[] args) {
        final watched watched = new watched();
        final watcher watcher = new watcher();
        watched.addObserver(watcher);
        watched.changeState();
    }
}
