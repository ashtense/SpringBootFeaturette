package com.ashwani.training.springboot.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwani.training.springboot.service.CustomerService;

@RestController
@RequestMapping(value="/users")
public class CustomerController {

	@Resource
	private CustomerService customerService;
	
	@RequestMapping("/")
	String home() {
		return "Welcome - Regards, Ashtense";
	}
	
	@RequestMapping("/ashtense")
	String ashtense(){
		return this.customerService.processTime("DAAH_______");
	}
	
}
