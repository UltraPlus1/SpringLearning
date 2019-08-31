package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello World!
 *
 */
//定义为springbootApplication
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("启动 Spring Boot...");
		SpringApplication.run(Application.class, args);
	}
}