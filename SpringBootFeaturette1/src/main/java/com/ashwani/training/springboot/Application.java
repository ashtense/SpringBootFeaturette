package com.ashwani.training.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author Ashwani Solanki Basic entry-point for the spring boot application.
 * 
 *         If you look at @EnableAutoConfiguration you will see the exclusion of
 *         DataSourceConfiguration. As we all are well aware spring boot makes
 *         default configurations for all of related things based on the
 *         selected starter parent. But if you want to make something of your
 *         own customized then exclude from here. Spring recommended.
 * 
 * @Controller
 * @EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
 * @ComponentScan One single annotation as an alternative for the above 3
 *                annotations is the SpringBootAppplication.
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class Application {

	public static void main(String[] args) {
		
		/*
		 * Below is the shortest way but if you want to customize like in the
		 * case below don't want any banner on console.
		 * SpringApplication.run(Application.class, args);
		 */

		SpringApplication application = new SpringApplication(Application.class);
		application.setBannerMode(Mode.CONSOLE);
		application.run(args);
		System.err.println(application.isWebEnvironment());
	}
}
