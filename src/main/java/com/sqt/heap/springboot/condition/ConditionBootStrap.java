package com.sqt.heap.springboot.condition;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-26 11:49
 */
@SpringBootApplication
public class ConditionBootStrap {

    @Bean
    @ConditionOnSystem(name = "user.name", value = "Administrator")
    public String conditionString() {
        return "conditionString ";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(ConditionBootStrap.class).run(args);
        String conditionString = applicationContext.getBean("conditionString", String.class);
        System.out.println(conditionString);
    }
}
