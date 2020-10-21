package com.ashwani.training.locator;

import org.springframework.stereotype.Component;

@Component
public class GeronimoImplementation2 implements CommonInterface {

	public GeronimoImplementation2() {
		System.out.println("GeronimoImplementation2 located");
	}

	@Override
	public void trigger() {
		System.err.println("LOL2");
	}

}
