package com.sqt.heap.springboot.autoconfigure.enabled;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 1.实现spring的ImportSelector接口，重写selectImports方法，方法的返回值是一个String数组，数组中包含的全类名会被注册到容器中
 *   容器中最终注册的组建是返回的全类名，而当前的 HelloWorldImportSelector 不会被导入到容器中
 * 2. 重写  selectImports 方法. 可以返回 空数组,不能返回 Null
 *
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-04-24 17:07
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
