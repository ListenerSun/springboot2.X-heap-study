package com.sqt.heap.springboot;

import com.sqt.heap.springboot.autoconfigure.enable.EnableMyServer;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@ServletComponentScan(basePackages = "com.sqt.heap.springboot.web.servlet")
@SpringBootApplication
@EnableMyServer
public class HeapSpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(HeapSpringbootApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		String bean = context.getBean("hellWorld", String.class);
		System.out.println("helloWorld Bean :" + bean);
	}

}
