package com.designpatterns.chainOfResponsibility;

import javax.print.attribute.standard.Compression;

public class Main {
    public static void main(String[] args) {
        // Auth -> Logger -> Compression
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authentication = new Authenticator(logger);
        var server = new WebServer(authentication);
        server.handle(new HttpRequest("admin", "1234"));

    }
}
