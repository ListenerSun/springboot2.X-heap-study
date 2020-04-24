package com.sqt.heap.springboot.autoconfigure.enable;

import org.springframework.context.annotation.Bean;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-24 17:19
 */
public class HelloWorldConfiguration {

    @Bean
    public String hellWorld() {
        return "hello world";
    }
}
