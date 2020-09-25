package com.chun.streamhelloworld.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author chun
 * @Date 2020/6/1 10:17
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    /**
     * 姓名
     */
    private String name;
}
