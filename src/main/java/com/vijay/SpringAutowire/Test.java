package com.vijay.SpringAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/vijay/SpringAutowire/config.xml");
		Student student = ap.getBean(Student.class);
		System.out.println(student);
	}
	

}
