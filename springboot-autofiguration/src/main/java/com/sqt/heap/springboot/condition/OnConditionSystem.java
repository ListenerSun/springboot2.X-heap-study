package com.sqt.heap.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @Description: 判断实际类
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-26 11:45
 */
public class OnConditionSystem implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionOnSystem.class.getName());
        String propertyName = String.valueOf(annotationAttributes.get("name"));
        String propertyValue = String.valueOf(annotationAttributes.get("value"));
        String systemPropertyValue = System.getProperty(propertyName);
        System.out.println("系统的value值为: " + systemPropertyValue);
        return propertyValue.equalsIgnoreCase(systemPropertyValue);
    }
}
