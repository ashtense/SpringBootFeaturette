package com.ashwani;

import java.util.Map;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {

	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@Resource
	private ApplicationEventPublisher eventPublisher;

	@ModelAttribute("event")
	public CustomSpringEvent prepareEventModel() {
		return new CustomSpringEvent(this, "LOL");
	}

	@ModelAttribute("eventContainer")
	public EventContainer prepareEventContainer() {
		return new EventContainer().withCustomEvent(new CustomSpringEvent(this, "Ashwani Solanki"));
	}

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping(value = "/spring/event/", method = RequestMethod.POST)
	public String handleEvent(EventContainer eventContainer) {
		System.err.println(eventContainer.getCustomSpringEvent().getMessage());
		this.eventPublisher.publishEvent(eventContainer.getCustomSpringEvent());
		//this.eventPublisher.publishEvent(new CustomSpringEvent(this, "GERONIMO"));
		return "Hello";
	}
}
