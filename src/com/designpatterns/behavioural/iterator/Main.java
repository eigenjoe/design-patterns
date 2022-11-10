package com.designpatterns.behavioural.iterator;

public class Main {
    public static void main(String[] args) {

        var history = new BrowseHistory();
        history.push("1");
        history.push("2");
        history.push("3");

        Iterator iterator = history.createIterator();

        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();

        }

    }

}
