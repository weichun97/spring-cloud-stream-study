package com.chun.streamhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(Source.class)
@SpringBootApplication
public class StreamHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamHelloworldApplication.class, args);
    }
}
