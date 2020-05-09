package com.sqt.springboot.webmvc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-08 10:39
 */
@SpringBootApplication
public class WebBootStrap {

    public static void main(String[] args) {
      new SpringApplicationBuilder(WebBootStrap.class)
            .run(args);
    }
}
