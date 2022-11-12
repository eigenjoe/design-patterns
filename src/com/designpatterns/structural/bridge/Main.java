package com.designpatterns.structural.bridge;

public class Main {
    public static void main(String[] args) {

        var remoteControl = new RemoteControl(new SonyTV());
        var advRemoteControl = new AdvancedRemoteControl(new SonyTV());

        remoteControl.turnOn();
        advRemoteControl.setChannel(9);
    }
}
