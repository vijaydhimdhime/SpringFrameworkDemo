package com.vijay.usingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentDetails {

	public static void main(String[] args) {
			System.out.println("hi vijay !!!!!!!!!!");
			ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/usingConstructor/student.xml");
			StudentDetails student1 = (StudentDetails)context.getBean("stud1");
			StudentDetails student2 = (StudentDetails)context.getBean("stud2");
			
			
			System.out.println("1)"+student1);

			System.out.println("2)"+student2);
		
	}

}
