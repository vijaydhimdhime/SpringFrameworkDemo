package com.vijay.usingIndexconstructor;

public class Student {
	private String name;
	private int age;
	private String email;
	public Student(String name, int age, String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public void printaData()
	{
		//System.out.println("Using constructor .....");
		System.out.println("Name     : "+name);
		System.out.println("age      : "+age);
		System.out.println("email id : "+email);
	}

}
