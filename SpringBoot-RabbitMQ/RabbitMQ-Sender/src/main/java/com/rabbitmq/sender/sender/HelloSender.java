package com.rabbitmq.sender.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void sendHello(){
        String context = "hello " + new Date();
        System.out.println("HelloSender:" + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

    public void sendNum(int num){
        String context = "Message NO. " + num;
        System.out.println("NumSender:" + context);
        this.rabbitTemplate.convertAndSend("num", context);
    }

    public void sendObject(Object object){
        this.rabbitTemplate.convertAndSend("object", object);
    }
}
