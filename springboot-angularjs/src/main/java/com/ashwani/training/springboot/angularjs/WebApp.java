package com.ashwani.training.springboot.angularjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.ashwani.training.springboot")
public class WebApp {

	public static void main(String[] args) {
		SpringApplication.run(WebApp.class, args);
	}
}