package com.designpatterns.state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Drawing a line...");
    }

    @Override
    public void mouseUp() {
        System.out.println("Fixing drawn line...");
    }
}
