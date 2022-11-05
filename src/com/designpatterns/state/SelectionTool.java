package com.designpatterns.state;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Drawing dotted box...");
    }

    @Override
    public void mouseUp() {
        System.out.println("Selecting stuff inside dotted box...");
    }
}
