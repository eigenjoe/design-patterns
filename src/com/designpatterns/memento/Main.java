package com.designpatterns.memento;

public class Main {
    public static void main(String[] args) {

        var editor = new Editor();
        var history = new History();

        editor.setContent("My name is Joe.");
        history.push(editor.createState());

        editor.setContent("I am a Staff Software Engineer.");
        history.push(editor.createState());

        editor.setContent("I work at Google.");
        history.push(editor.createState());

        System.out.println("History: " + history);
        System.out.println("Editor Content: " + editor.getContent());

        editor.restore(history.pop());

        System.out.println("History: " + history);
        System.out.println("Editor Content: " + editor.getContent());

        editor.restore(history.pop());

        System.out.println("History: " + history);
        System.out.println("Editor Content: " + editor.getContent());


    }
}
