package com.vijay.Addition;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/Addition/Addition.xml");
		 Addd ad = (Addd)context.getBean("add");
		 System.out.println(ad);
		 Student student = context.getBean("std1", Student.class);
		 System.out.println(student);
		 Student student1 = context.getBean("kk", Student.class);
		 System.out.println("kk : "+student1);
		 System.out.println(student == student1);
		 System.out.println(student.hashCode());
		 System.out.println(student1.hashCode());
		 
	}

}
