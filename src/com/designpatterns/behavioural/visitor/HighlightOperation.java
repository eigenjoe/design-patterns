package com.designpatterns.behavioural.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Heading node highlighted");

    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Anchor node highlighted");
    }
}
