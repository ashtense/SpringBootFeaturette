package com.ashwani.training.springboot.service.impl;

import org.springframework.stereotype.Service;
import com.ashwani.training.springboot.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Override
	public String processTime(String incomingArg) {
		incomingArg = incomingArg.concat(String.valueOf(System.currentTimeMillis()));
		return incomingArg;
	}

}
