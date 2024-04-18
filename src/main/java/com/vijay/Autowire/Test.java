package com.vijay.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/Autowire/config.xml");
		Student stu = context.getBean("student", Student.class);
		System.out.println(stu);
	}
}
