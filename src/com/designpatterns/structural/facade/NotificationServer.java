package com.designpatterns.structural.facade;

public class NotificationServer {
    // Connect -> connection
    // authenticate(appID, key) -> authToken
    // send(authToken, message, target)
    // conn.disconnect()

    public Connection connect( String ipAddress) {
        return new Connection();
    }

    public AuthToken anthenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message...");
    }
}
