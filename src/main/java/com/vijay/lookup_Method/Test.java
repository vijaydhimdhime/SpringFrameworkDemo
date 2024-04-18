package com.vijay.lookup_Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("lookup_Method.xml");
		Student student1 = context1.getBean("std1", Student.class);
		Student student2 = context1.getBean("std1", Student.class);
		
		System.out.println("student 1 : "+student1);
		System.out.println("student 2 : "+student2);
		System.out.println("two object equal---> true/false:  "+(student1 == student2));
		System.out.println("two object equal---> true/false:  "+(student1.getAddress() == student2.getAddress()));
//		Student student2 = context1.getBean("std1", Student.class);
//		System.out.println("student 2 : "+student2);
		
//		System.out.println(student1 == student2);
//		System.out.println(student1.equals(student2));
//		System.out.println(student1.getAddress() == student2.getAddress());
//		Student student3 = context1.getBean("std1", Student.class);
//		System.out.println("student 3 : "+student3);
//		System.out.println(student1 == student3);
		
	}
}
