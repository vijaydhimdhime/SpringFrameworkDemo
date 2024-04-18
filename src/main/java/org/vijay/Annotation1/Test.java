package org.vijay.Annotation1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("org/vijay/Annotation1/config.xml");
		Student student = ap.getBean("student", Student.class);
		System.out.println(student);
	}
}
