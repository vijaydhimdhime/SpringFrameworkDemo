package com.vijay.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("com/vijay/Autowired/Engine.xml");  
		    Car car = context.getBean("car", Car.class);
		    System.out.println(car);
		    
	}
}
