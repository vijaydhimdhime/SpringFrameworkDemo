package com.vijay.configuredbyannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/configuredbyannotation/new.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = context.getBean("student1", Student.class);
		
		System.out.println("class name : "+student.getClass().getSimpleName());
		System.out.println("package name : "+student.getClass().getPackageName());
		student.showData();
	}
}
