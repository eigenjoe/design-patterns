package com.designpatterns.structural.bridge;

public class SonyTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("Sony: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: turnOff");
    }

    @Override
    public void setChannel(int num) {
        System.out.println("Sony: setChannel");
    }
}
