package com.william.base.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.william.demo.api"})
public class BaseWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseWebApplication.class, args);
	}
	
}
