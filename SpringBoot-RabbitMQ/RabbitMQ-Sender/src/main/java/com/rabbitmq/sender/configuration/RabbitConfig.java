package com.rabbitmq.sender.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue HelloQueue(){
        return new Queue("hello");
    }

    @Bean
    public Queue NumQueue(){
        return new Queue("num");
    }

    @Bean
    public Queue ObjectQueue(){
        return new Queue("object");
    }

}
