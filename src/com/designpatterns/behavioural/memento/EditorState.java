package com.designpatterns.behavioural.memento;

public class EditorState {
    private String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String toString() {
        return "State( " + content + " )";
    }

    public String getContent() {
        return content;
    }
}
