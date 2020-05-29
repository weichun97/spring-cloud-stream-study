package com.chun.streamhelloworld.listener;

import com.chun.streamhelloworld.Source;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @Author chun
 * @Date 2020/5/29 17:50
 */
@Component
public class SourceListener {

    @StreamListener(Source.INPUT)
    public void receive(String payload){
        System.out.println(payload);
    }
}
