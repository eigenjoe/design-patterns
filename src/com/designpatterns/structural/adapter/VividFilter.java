package com.designpatterns.structural.adapter;

public class VividFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Applying vivid filtering...");
    }
}
