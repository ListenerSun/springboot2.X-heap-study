package com.sqt.application.listener;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Description: 自定义  SpringBoot 运行时 监听器
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-30 14:50
 */
@SpringBootApplication
public class MyRunListenerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MyRunListenerApplication.class)
                .run(args);
    }
}
