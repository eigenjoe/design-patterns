package com.designpatterns.state;

public class Main {
    public static void main(String[] args) {

        var canvas = new Canvas();

        canvas.setSelectedTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setSelectedTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        // This design follows the Open/Closed principle: Open for extension, closed for modification.
    }
}
