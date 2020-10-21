package com.ashwani.training.experiment1;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class B {

	@Resource
	private A a;

	public void test() {
		System.out.println("LOL");
	}

}
