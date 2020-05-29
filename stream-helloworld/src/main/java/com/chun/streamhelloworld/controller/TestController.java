package com.chun.streamhelloworld.controller;

import com.chun.streamhelloworld.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
        source.output().send(MessageBuilder.withPayload(msg).build());
    }
}
