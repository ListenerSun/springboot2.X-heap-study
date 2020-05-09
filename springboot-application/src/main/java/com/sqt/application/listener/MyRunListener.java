package com.sqt.application.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @Description: 自定义  SpringApplication 运行时监听器
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-30 14:46
 */
public class MyRunListener implements SpringApplicationRunListener {

    public MyRunListener(SpringApplication application, String[] args) {

    }

    @Override
    public void starting() {
        System.out.println("自定义的 MyRunListener 执行了 ");

    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
