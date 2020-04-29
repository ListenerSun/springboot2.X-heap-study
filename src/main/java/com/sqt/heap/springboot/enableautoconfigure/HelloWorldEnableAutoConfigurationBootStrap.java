package com.sqt.heap.springboot.enableautoconfigure;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/** {@link EnableAutoConfiguration 默认配置引导类 }
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-29 14:23
 */
@EnableAutoConfiguration
public class HelloWorldEnableAutoConfigurationBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldEnableAutoConfigurationBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String bean = context.getBean("hellWorld", String.class);
        System.out.println("获取到的 hello world bean 是:" + bean);
    }

}
