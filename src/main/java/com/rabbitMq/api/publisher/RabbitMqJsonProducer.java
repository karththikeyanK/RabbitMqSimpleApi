package com.rabbitMq.api.publisher;

import com.rabbitMq.api.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMqJsonProducer {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendJsonMessage(User user){
        log.info("send message "+ user.toString());
        rabbitTemplate.convertAndSend(exchange,routingJsonKey,user);
    }

}
