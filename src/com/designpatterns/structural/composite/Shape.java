package com.designpatterns.structural.composite;

public class Shape implements Component {

    @Override
    public void render() {
        System.out.println("Rendering shape...");
    }

    @Override
    public void move() {
        System.out.println("Shape moved...");
    }

}
