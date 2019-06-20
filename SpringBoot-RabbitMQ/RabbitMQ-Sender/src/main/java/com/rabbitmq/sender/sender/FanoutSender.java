package com.rabbitmq.sender.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FanoutSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(){
        String context = "hi, fanout msg!";
        System.out.println("FanoutSender:" + context);
        //fanout模式，routingKey任何值都会被忽略
        this.rabbitTemplate.convertAndSend("fanoutExchange", "", context);
    }
}
