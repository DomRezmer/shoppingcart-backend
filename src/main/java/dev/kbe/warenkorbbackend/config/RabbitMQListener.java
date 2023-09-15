package dev.kbe.warenkorbbackend.config;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQListener implements MessageListener {

    public void onMessage(Message message) {
        System.out.println("Received message: " + new String(message.getBody()));
    }
}
