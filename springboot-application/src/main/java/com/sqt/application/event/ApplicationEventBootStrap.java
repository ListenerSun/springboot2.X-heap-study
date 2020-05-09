package com.sqt.application.event;

import com.sun.media.jfxmedia.events.PlayerEvent;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.PayloadApplicationEvent;

/**
 * @Description: 事件发布
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-30 11:28
 */
@SpringBootApplication
public class ApplicationEventBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ApplicationEventBootStrap.class)
                .run(args);

        context.addApplicationListener(event -> {
            if (event instanceof PayloadApplicationEvent) {
                System.out.println("监听到事件: " + ((PayloadApplicationEvent) event).getPayload());
            }

        });
        context.publishEvent(" Hello ListenerSun");
    }
}
