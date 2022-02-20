package com.example.demo.messaging.consumer;

import com.example.demo.config.RabbitMQConfig;
import com.example.demo.model.Person;
import com.example.demo.model.Reservation;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PersonConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumeMessageFromQueue(Person person) {
        System.out.println("Person message received & consumed from queue : " + person);
    }
}
