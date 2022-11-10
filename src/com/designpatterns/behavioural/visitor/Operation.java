package com.designpatterns.behavioural.visitor;

public interface Operation {
    public void apply(HeadingNode headingNode);
    public void apply(AnchorNode anchorNode);

}
