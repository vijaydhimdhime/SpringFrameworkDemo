package com.vijay.usingIndexconstructor.usingRefernce;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/usingIndexconstructor/usingRefernce/engine.xml");
		Car car = context.getBean("car", Car.class);
		car.printData();
	
	}
}
