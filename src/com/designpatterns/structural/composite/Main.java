package com.designpatterns.structural.composite;

public class Main {
    public static void main(String[] args) {
        var shape1 = new Shape();
        var shape2 = new Shape();

        var group1 = new Group();
        group1.addComponent(shape1);
        group1.addComponent(shape2);

        var circle1 = new Shape();
        var circle2 = new Shape();

        var group2 = new Group();
        group2.addComponent(circle1);
        group2.addComponent(circle2);

        var mainGroup = new Group();
        mainGroup.addComponent(group1);
        mainGroup.addComponent(group2);

        mainGroup.render();
        mainGroup.move();

    }
}
