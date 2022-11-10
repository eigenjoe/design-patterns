package com.designpatterns.behavioural.visitor;

public class Main {
    public static void main(String[] args) {

        var document = new HtmlDocument();
        document.addNode(new HeadingNode());
        document.addNode(new AnchorNode());
        var hlOperation = new HighlightOperation();
        document.execute(hlOperation);


    }
}
