package com.designpatterns.structural.proxy;

public class EBookProxy implements EBook {
    private String fileName;
    RealEbook eBook;

    public EBookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (eBook == null) {
            this.eBook = new RealEbook(fileName);
        }
        eBook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
