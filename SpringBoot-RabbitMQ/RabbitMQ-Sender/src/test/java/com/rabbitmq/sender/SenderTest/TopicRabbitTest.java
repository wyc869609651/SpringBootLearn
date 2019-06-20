package com.rabbitmq.sender.SenderTest;

import com.rabbitmq.sender.sender.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicRabbitTest {
    @Autowired
    private TopicSender sender;

    @Test
    public void sendMessageTest(){
        sender.sendMessage();
    }

    @Test
    public void sendMessagesTest(){
        sender.sendMessages();
    }


}
