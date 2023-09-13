package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example","com.wallmart"})
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootFirstApplication.class, args);
		
		System.out.println(run.getClass().getName());
		System.out.println(run.getBeanDefinitionCount());

	}

}
