package com.rabbitMq.api.controller;

import com.rabbitMq.api.dto.User;
import com.rabbitMq.api.publisher.RabbitMqJsonProducer;
import com.rabbitMq.api.publisher.RabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageJsonController {

    @Autowired
    private RabbitMqJsonProducer rabbitMqJsonProducer;

    @PostMapping("publish/user")
    public ResponseEntity<String> sendUser(@RequestBody User user){
        rabbitMqJsonProducer.sendJsonMessage(user);
        return ResponseEntity.ok("Message was sent....");
    }
}
