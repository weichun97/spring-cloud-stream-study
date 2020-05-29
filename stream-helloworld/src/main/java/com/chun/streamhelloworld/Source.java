package com.chun.streamhelloworld;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author chun
 * @Date 2020/5/29 17:40
 */
public interface Source {

    String INPUT = "input";
    String OUTPUT = "output";

    @Output(Source.OUTPUT)
    MessageChannel output();

    @Input(Source.INPUT)
    SubscribableChannel input();
}
