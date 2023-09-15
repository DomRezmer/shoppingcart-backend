package dev.kbe.warenkorbbackend.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import dev.kbe.warenkorbbackend.Shoppingcart;

@Service
public class RabbitMQSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    public void send(Shoppingcart shoppingcart) {
        rabbitTemplate.convertAndSend(exchange, routingkey, shoppingcart);
        System.out.println("Send msg = " + shoppingcart);
    }

    public void send(String message) {
        rabbitTemplate.convertAndSend(exchange, routingkey, message);
        System.out.println("Send msg = " + message);
    } // TODO: change to shoppingcart method
}
