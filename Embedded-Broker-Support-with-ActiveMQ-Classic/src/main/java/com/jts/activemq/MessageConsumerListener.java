package com.jts.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerListener {

    @JmsListener(destination = "test-queue")
    public void receiveMessage(String message) {
        System.out.println("Message received: " + message);
    }
}
