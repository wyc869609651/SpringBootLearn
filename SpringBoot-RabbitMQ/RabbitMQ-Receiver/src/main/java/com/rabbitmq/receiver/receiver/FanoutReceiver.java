package com.rabbitmq.receiver.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class FanoutReceiver {

    /*@RabbitListener(queues = "fanout.A")
    public void processA(String message){
        System.out.println("FanoutReceiverA:" + message);
    }

    @RabbitListener(queues = "fanout.B")
    public void processB(String message){
        System.out.println("FanoutReceiverB:" + message);
    }*/

    @RabbitListener(queues = "fanout.C")
    public void processC(String message){
        System.out.println("FanoutReceiverC:" + message);
    }

    @RabbitListener(queues = {"fanout.A", "fanout.B"})
    public void processAB(String message){
        System.out.println("FanoutReceiverAB:" + message);
    }
}
