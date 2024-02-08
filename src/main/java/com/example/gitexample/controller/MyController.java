package com.example.gitexample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    private Logger logger = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/message")
    public String getMessage() {
        //logger.info("Inside MyController class");
        return "Welcome to MyController";
    }

    @GetMapping("/message/{name}")
    public String getMessageByName(@PathVariable String name) {
        logger.info("Inside getMessageByName() in  MyController class");
        return "Welcome to " + name;
    }
}
