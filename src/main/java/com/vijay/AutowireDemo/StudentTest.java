package com.vijay.AutowireDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/vijay/AutowireDemo/Auto.xml");
		Student student = ap.getBean("stud1", Student.class);
		student.printData();
	}
}
