package com.sqt.springboot.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-05-08 10:43
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
