package com.vijay.refernceTyprDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("carEngine.xml");
		Car car = (Car)context.getBean("car");
		System.out.println(car);
	}

}
