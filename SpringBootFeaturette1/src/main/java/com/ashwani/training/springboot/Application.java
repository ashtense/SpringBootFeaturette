package com.ashwani.training.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

/**
 * @author Ashwani Solanki Basic entry-point for the spring boot application.
 * 
 *         If you look at @EnableAutoConfiguration you will see the exclusion of
 *         DataSourceConfiguration. As we all are well aware spring boot makes
 *         default configurations for all of related things based on the
 *         selected starter parent. But if you want to make something of your
 *         own customized then exclude from here. Spring recommended.
 */
@Controller
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@ComponentScan
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
