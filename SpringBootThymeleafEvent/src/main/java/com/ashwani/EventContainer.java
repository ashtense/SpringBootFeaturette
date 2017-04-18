package com.ashwani;

public class EventContainer {

	private CustomSpringEvent customSpringEvent;

	public CustomSpringEvent getCustomSpringEvent() {
		return customSpringEvent;
	}

	public void setCustomSpringEvent(CustomSpringEvent customSpringEvent) {
		this.customSpringEvent = customSpringEvent;
	}
	
	public EventContainer withCustomEvent(CustomSpringEvent customSpringEvent){
		setCustomSpringEvent(customSpringEvent);
		return this;
	}
	
}