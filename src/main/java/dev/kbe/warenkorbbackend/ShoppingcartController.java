package dev.kbe.warenkorbbackend;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kbe.warenkorbbackend.config.RabbitMQSender;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@RequestMapping("/api/shoppingcart")
public class ShoppingcartController {
    @Autowired
    private ShoppingcartService shoppingcartService;

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    private RabbitMQSender rabbitMQSender;

    /*
     * TODO: fill in with methods (Getmapping for all products in the shoppingcart,
     * Postmapping for adding a product to the shoppingcart, DeleteMapping for
     * deleting a product from the shoppingcart)
     */

    @GetMapping("/test")
    public String sendShoppingcart() {
        rabbitMQSender.send("Hello from RabbitMQ!");
        return "Message sent to the RabbitMQ Successfully";
    }
}
