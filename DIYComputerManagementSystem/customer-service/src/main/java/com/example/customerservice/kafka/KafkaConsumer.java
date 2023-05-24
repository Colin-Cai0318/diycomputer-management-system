package com.example.customerservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    public static final String TOPIC_INVOICE = "order";
    @KafkaListener(topics = TOPIC_INVOICE)
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}