package com.vijay.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("carconfig.xml");
		Car car = (Car)context.getBean("car1");
		Car car1 = (Car)context.getBean("car2");
		Car car3 = (Car)context.getBean("car3");
		System.out.println(car);
		
		System.out.println(car1);
		System.out.println(car3);
	}
	
}
