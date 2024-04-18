package com.vijay.withxmlfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/withxmlfile/config.xml");
		Student student  = context.getBean("student", Student.class);
		Student studen1t  = context.getBean("student1", Student.class);
		System.out.println(student);
		System.out.println(studen1t);
		System.out.println(studen1t.hashCode());
	}

}
