package com.chun.listener;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Author chun
 * @Date 2020/6/1 15:45
 */
@Component
public class ProcessorListener {

    @StreamListener(Processor.INPUT)
    public void receiver(String msg){
        System.out.println(msg);
        throw new RuntimeException();
    }

    /**
     * 全局异常处理
     * @param message
     */
    @StreamListener("errorChannel")
    public void errorChannel(Message<?> message){
        System.out.println("全局异常处理：" + message);
    }

    /**
     * 指定异常处理
     * inputChannel:
     *     组成: destination 的值 + group 的值 + errors(字符串)
     * @param message
     */
    @ServiceActivator(inputChannel = "aaa-topic.stream-error-handler.errors")
    public void error(Message<?> message){
        System.out.println(message);
    }
}
