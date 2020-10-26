package com.wxh.proxy.staticproxy;

public class StationProxy implements Ticket{

    private Station station = new Station();

    public void operate() {
        System.out.println("买票前...");
        station.operate();
        System.out.println("买票后...");
    }
}
