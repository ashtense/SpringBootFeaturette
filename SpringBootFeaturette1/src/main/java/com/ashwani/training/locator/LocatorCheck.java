package com.ashwani.training.locator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LocatorCheck {

	public static void main(final String[] args) {
		final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LocatorConfig.class);
		final CommonInterface bean = (CommonInterface) context.getBean("geronimoImplementation1");
		bean.trigger();

		final CommonInterface bean2 = (CommonInterface) context.getBean("geronimoImplementation2");
		bean2.trigger();
	}
}