package com.example.springlogging.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.logging.Logger;

@RestController
public class OtherController {

    Logger logger = Logger.getLogger(OtherController.class.getName());

    @GetMapping("/other")
    public Object getMessage(){
        logger.info("info Message");
        logger.warning("warn Message");
        logger.severe("error Message");
//        logger.("debug Message");
//        logger.t("trace Message");
        System.out.println(10/0);
        return Map.of("message", "Open console to check log");
    }
}
