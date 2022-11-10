package com.designpatterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        var stream = new CompressedCloudStream(new EncryptedCloudStream(new CloudStream()));
        storeCreditCard(stream);
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
