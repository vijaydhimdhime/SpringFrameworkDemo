package com.vijay.studentinformation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentInfo.xml");
		Student student = (Student) context.getBean("std1");
		Student student1 = (Student) context.getBean("std2");
		System.out.println(student.getClass());
		
	//	System.out.println("Standard"+student.getStandard());
		System.out.println(student.getStandard()+" list : "+student.getStudentName());
		
		//System.out.println("Standard"+student1.getStandard());
		System.out.println(student1.getStandard()+" list :"+student1.getStudentName());
		
	}

}
