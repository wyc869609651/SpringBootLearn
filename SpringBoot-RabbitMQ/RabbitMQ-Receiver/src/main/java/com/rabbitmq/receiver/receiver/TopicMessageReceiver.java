package com.rabbitmq.receiver.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "topic.message")
public class TopicMessageReceiver {

    @RabbitHandler
    public void process(String message){
        System.out.println("topicMessageReceiver:" + message);
    }

}
