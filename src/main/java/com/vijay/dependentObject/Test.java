package com.vijay.dependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
//		String files=new String[](){"car.xml","engine.xml"});
//		ApplicationContext context = new ClassPathXmlApplicationContext(files);
//		Car car = context.getBean("car", Car.class);
//		car.printData();
		
		String files[] = new String[] {"car.xml", "engine.xml"};
		ApplicationContext context = new ClassPathXmlApplicationContext(files);
		Car car=context.getBean("car", Car.class);
		car.printData();
		
	}
}
