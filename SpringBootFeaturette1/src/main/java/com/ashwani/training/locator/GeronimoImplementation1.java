package com.ashwani.training.locator;

import org.springframework.stereotype.Component;

@Component
public class GeronimoImplementation1 implements CommonInterface {

	public GeronimoImplementation1() {
		System.out.println("GeronimoImplementation1 Located");
	}

	@Override
	public void trigger() {
		System.err.println("LOL1");
	}

}
