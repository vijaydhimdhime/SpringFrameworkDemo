package org.vijay.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("org/vijay/standalonecollection/config.xml");
		Student student = ap.getBean("student", Student.class);
		System.out.println(student);
	}
}
