package com.rabbitMq.api.consumer;

import com.rabbitMq.api.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMqJsonConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.json.name}")
    public void consume(User user) {
        log.info("Message received from the RabbitMQ -> {}", user.toString());
    }
}
