package com.vijay.usingBeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Student student = context.getBean("getStudent", Student.class);
		System.out.println(student.getClass());
		System.out.println(student.getClass().getPackageName());
		System.out.println(student);
		student.showData();
	}

}
