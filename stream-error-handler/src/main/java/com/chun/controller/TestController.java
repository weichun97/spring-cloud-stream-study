package com.chun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chun
 * @Date 2020/6/1 15:25
 */
@RestController
public class TestController {

    @Autowired
    Processor processor;

    @GetMapping("/test")
    public void test(){
        processor.output().send(MessageBuilder.withPayload("123").build());
    }
}
