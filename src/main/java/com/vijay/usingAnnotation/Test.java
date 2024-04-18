package com.vijay.usingAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com/vijay/usingAnnotation/config.xml");
		Student student  = context.getBean("std1", Student.class);
		System.out.println(student);
	}

}
