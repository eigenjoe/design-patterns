package com.designpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        var fileName = "nia";
        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());

        imageStorage.store(fileName);


    }
}
