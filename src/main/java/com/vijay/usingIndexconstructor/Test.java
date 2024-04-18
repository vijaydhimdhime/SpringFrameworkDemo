package com.vijay.usingIndexconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("com/vijay/usingIndexconstructor/indexType.xml");
		Student student1 = 	context.getBean("stud1", Student.class); //by using default
		Student student2 = 	context.getBean("stud2", Student.class);  // by using index 
		Student student3 = 	context.getBean("stud3", Student.class);  // by using Type
		System.out.println(student1);
		System.out.println("By using Default....");
		student1.printaData();
		System.out.println("By using index.....");
		student2.printaData();
		System.out.println("By using Type....");
		student3.printaData();
	}

}
