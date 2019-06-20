package com.rabbitmq.sender.sender;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendMessage(){
        String context = "hi, i am message 1";
        System.out.println("Sender:" + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.message", context);
    }

    public void sendMessages(){
        String context = "hi, i am message 2";
        System.out.println("Sender:" + context);
        this.rabbitTemplate.convertAndSend("exchange", "topic.messages", context);
    }
}
