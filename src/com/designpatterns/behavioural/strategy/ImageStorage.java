package com.designpatterns.behavioural.strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // JPEG, PNG compression
        compressor.compress(fileName);
        // B&W, High Contrast
        filter.apply(fileName);
    }
}
