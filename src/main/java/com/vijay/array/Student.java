package com.vijay.array;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	private String[] name;

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(name);
	}

	public void printData()
	{
		System.out.println("student data : "+name.toString());
	}
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/vijay/array/arrays.xml");
		Student student = context.getBean("stud1", Student.class);
		student.printData();
	}
}
