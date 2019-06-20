package com.rabbitmq.sender.SenderTest;

import com.rabbitmq.sender.sender.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloTest {
    @Autowired
    private HelloSender sender;
    @Autowired
    private HelloSender sender2;

    @Test
    public void helloQueueTest(){
        sender.sendHello();
    }

    @Test
    public void oneToMany(){
        for(int i=0; i<10; i++){
            sender.sendNum(i);
        }
    }

    @Test
    public void manyToMany(){
        for(int i=0; i<10; i++){
            sender.sendNum(i);
            sender2.sendNum(i);
        }
    }

    @Test
    public void objectSenderTest(){
        Map<String, String> map = new HashMap<>();
        map.put("key","value");
        sender.sendObject(map);
    }
}
