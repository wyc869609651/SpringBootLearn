package com.rabbitmq.receiver.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "num")
public class NumReceiver2 {

    @RabbitHandler
    public void process(String message){
        System.out.println("NumReceiver2:" + message);
    }
}
