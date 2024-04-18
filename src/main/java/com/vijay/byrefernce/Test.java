package com.vijay.byrefernce;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("carAndengine.xml");
		Car car1 = (Car)context.getBean("car");
		//System.out.println(car1);
		car1.printData();
	}
}
