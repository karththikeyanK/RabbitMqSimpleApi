package com.rabbitMq.api.controller;

import com.rabbitMq.api.publisher.RabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @Autowired
    private RabbitMqProducer rabbitMqProducer;

    @GetMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
        rabbitMqProducer.send(message);
        return ResponseEntity.ok("Message published successfully!");
    }
}
