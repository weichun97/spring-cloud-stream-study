package com.chun.streamhelloworld.listener;

import com.chun.streamhelloworld.message.Person;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @Author chun
 * @Date 2020/5/29 17:50
 */
@Component
public class SourceListener {

    @StreamListener(Sink.INPUT)
    public void receive(Person person){
        System.out.println(person);
    }
}
