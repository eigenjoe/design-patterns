package com.designpatterns.structural.decorator;

public class EncryptedCloudStream implements Stream {
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = encrypt(data);
        stream.write(encrypted);
    }

    public  String encrypt(String data) {
        return "^)&&O()@";
    }
}
