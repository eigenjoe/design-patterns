package com.designpatterns.structural.facade;

public class Main {
    public static void main(String[] args) {

        var notificationService = new NotificationService();

        notificationService.send("Hi Google", "ip");
    }
}
