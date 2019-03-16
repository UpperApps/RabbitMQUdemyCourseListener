package com.example.rabbitlistenerproject;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQQueueConfiguraton {

    /**
     * It creates a queue using the Queue constructor
     * @return queue
     */
    @Bean
    Queue exempleQueue() {
        return new Queue("ExampleQueue", false);
    }

    /**
     * It creates a queue using a QueueBuilder 
     * @return queue
     */
    @Bean
    Queue example2ndQueue() {
        return QueueBuilder.durable("Example2ndQueue")
                            .autoDelete()
                            .exclusive()
                            .build();
    }
}