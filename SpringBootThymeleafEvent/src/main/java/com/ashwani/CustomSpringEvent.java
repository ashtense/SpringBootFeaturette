package com.ashwani;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class CustomSpringEvent extends ApplicationEvent {

	private String message;
	
	CustomSpringEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}