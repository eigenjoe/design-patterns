package com.designpatterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        var service = new PointService(new IconFactory());

        var points = service.getPoints();

        for (var point : points ) {
            point.draw();
        }

    }
}
