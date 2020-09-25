package com.chun.streamhelloworld.controller;

import com.chun.streamhelloworld.message.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chun
 * @Date 2020/5/29 17:53
 */
@RestController
public class TestController {

    @Autowired
    Source source;

    @GetMapping("/test")
    public void test(@RequestParam("msg") String msg){
        source.output().send(MessageBuilder.withPayload(Person.builder().name(msg).build()).build());
    }
}
