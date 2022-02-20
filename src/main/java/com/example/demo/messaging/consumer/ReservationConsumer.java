package com.example.demo.messaging.consumer;

import com.example.demo.config.RabbitMQConfig;
import com.example.demo.model.Reservation;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ReservationConsumer {

 //       @RabbitListener(queues = RabbitMQConfig.QUEUE)
 //   public void consumeMessageFromQueue(Reservation reservation) {
 //       System.out.println("Reservation message received & consumed from queue : " + reservation);
 //   }

}
