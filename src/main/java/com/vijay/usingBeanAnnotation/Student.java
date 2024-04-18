package com.vijay.usingBeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("vijay")
	private String name;
	@Value("Solapur")
	private String address;
	@Autowired
	private Pin pin;
	@Override
	public String toString() {
		return "Name : "+name+"\n"+"city : "+address;
	}
	
	public void showData()
	{
		System.out.println("student information........");
		System.out.println(" Name : "+name);
		System.out.println(" city  : "+address);
		System.out.println("  Pin  : "+pin.getPin());
	}

}
