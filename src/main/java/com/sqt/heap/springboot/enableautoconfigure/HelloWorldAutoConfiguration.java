package com.sqt.heap.springboot.enableautoconfigure;

import com.sqt.heap.springboot.autoconfigure.enabled.EnableHelloWold;
import com.sqt.heap.springboot.condition.ConditionOnSystem;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-29 14:09
 */

//HelloWorldAutoConfiguration
//        条件判断： user.name == "Administrator"
//        模式注解： @Configuration
//        @Enable 模块： @EnableHelloWorld -> HelloWorldImportSelector -> HelloWorldConfiguration - > helloWorld

@Configuration  // spring 模式注解装配
@EnableHelloWold // enable 模块装配
@ConditionOnSystem(name = "user.name", value = "Administrator")
public class HelloWorldAutoConfiguration {
}
