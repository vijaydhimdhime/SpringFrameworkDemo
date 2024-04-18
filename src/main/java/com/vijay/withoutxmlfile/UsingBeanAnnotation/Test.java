package com.vijay.withoutxmlfile.UsingBeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Fruit fruit = context.getBean("getFruit", Fruit.class);
		System.out.println(fruit);
	}

}
