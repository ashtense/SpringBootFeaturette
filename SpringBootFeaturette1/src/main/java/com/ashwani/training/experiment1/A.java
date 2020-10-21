package com.ashwani.training.experiment1;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class A {

	@Resource
	private B b;

	public String test() {
		b.test();
		return null;
	}
}
