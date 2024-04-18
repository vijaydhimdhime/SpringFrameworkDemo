package com.vijay.AutowireDemo;

public class Student {
	private String name;
	private int age;
	private String city;
	private Pin pin;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Pin getPin() {
		return pin;
	}
	public void setPin(Pin pin) {
		this.pin = pin;
	}
	public void printData()
	{
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		System.out.println("city = "+city);
		System.out.println("pin = "+pin.getPin());
	}
}
