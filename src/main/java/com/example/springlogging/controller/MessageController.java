package com.example.springlogging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MessageController {
    Logger logger = LoggerFactory.getLogger(MessageController.class);

    @GetMapping("/message")
    public Object getMessage(){
        logger.info("info Message");
        logger.warn("warn Message");
        logger.error("error Message");
        logger.debug("debug Message");
        logger.trace("trace Message");
        System.out.println(10/0);
        return Map.of("message", "Open console to check log");
    }
}
