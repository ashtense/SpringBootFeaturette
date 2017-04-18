package com.ashwani;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener implements ApplicationListener<CustomSpringEvent>{

	@Override
	public void onApplicationEvent(CustomSpringEvent event) {
		System.out.println("Hello event triggered.." + event.getMessage());
	}

}