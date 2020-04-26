package com.sqt.heap.springboot.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/** 自定义  条件属性注解 满足该条件才 进行
 * @Description: java系统属性 条件判断
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-26 11:48
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@Documented
@Conditional(OnConditionSystem.class)
public @interface ConditionOnSystem {

    /** java 系统属性名称
     * @return
     */
    String name();

    /**java 系统属性值
     * @return
     */
    String value();
}
