package com.designpatterns.state;

public class Canvas {
    private Tool selectedTool;

    public  void mouseDown() {
        selectedTool.mouseDown();
    }

    public void mouseUp() {
        selectedTool.mouseUp();
    }

    public Tool getSelectedTool() {
        return selectedTool;
    }

    public void setSelectedTool(Tool selectedTool) {
        this.selectedTool = selectedTool;
    }
}
