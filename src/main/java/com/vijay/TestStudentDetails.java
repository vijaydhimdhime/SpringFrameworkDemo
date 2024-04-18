package com.vijay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestStudentDetails {

	public static void main(String[] args) {
			System.out.println("hi vijay !!!!!!!!!!");
			ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/new.xml");
			StudentDetails student1 = context.getBean("studentDetails",StudentDetails.class);
			System.out.println(student1);
			student1.show();
		
			
	}

}
