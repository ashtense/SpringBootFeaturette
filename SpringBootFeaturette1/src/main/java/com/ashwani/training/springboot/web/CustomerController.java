package com.ashwani.training.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@RequestMapping("/")
	String home() {
		return "Welcome - Regards, Ashtense";
	}
	
	@RequestMapping("/ashtense")
	String ashtense(){
		return "Dude you're fast";
	}
	
}
