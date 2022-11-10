package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component {
    private List<Component> components = new ArrayList<>();

    public void addComponent( Component component) {
        components.add(component);
    }
    @Override
    public void render() {
        for (var component: components)
            component.render();
    }

    @Override
    public void move() {
        for (var component: components)
            component.move();
    }
}
