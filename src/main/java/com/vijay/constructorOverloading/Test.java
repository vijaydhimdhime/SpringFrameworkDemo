package com.vijay.constructorOverloading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Cconstructoroverloading.xml");
		Student student=context.getBean("stud1", Student.class);
		student.showStudentData();
		
		System.out.println("=========================================");
		Student student1=context.getBean("stud2", Student.class);
		
		student1.showStudentData();
	}
}
