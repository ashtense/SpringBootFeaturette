package com.ashwani.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.ashwani.training.springboot.configuration.JpaConfiguration;

/**
 * @author Ashwani
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages ={"com.ashwani.training.springboot"})
public class SpringBootCRUDApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCRUDApplication.class, args);
	}
}
