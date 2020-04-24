package com.sqt.heap.springboot.autoconfigure.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-24 17:08
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldImportSelector.class)
public @interface EnableMyServer  {
}
