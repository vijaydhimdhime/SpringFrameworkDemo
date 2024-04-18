package com.vijay.constructorOverloading;

public class Student {
	private String name;
	private int age;
	private String city;
	public Student(String name, int age, String city) {
		System.out.println("3 parameterized con.....");
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public Student(String name) {
		System.out.println("1 paramtere...constructor...");
		this.name = name;
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student(int age, String city) {
		super();
		this.age = age;
		this.city = city;
	}
	public Student(int age) {
		super();
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	public void showStudentData()
	{
		System.out.println("student name = "+name);
		System.out.println("student city = "+city);
		System.out.println("student age = "+age);
	}
	
}
