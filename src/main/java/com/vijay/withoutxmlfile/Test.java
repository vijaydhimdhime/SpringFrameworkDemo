package com.vijay.withoutxmlfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getClass().getName());
		car.showData();
	}
}
