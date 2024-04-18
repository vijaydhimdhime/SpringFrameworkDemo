package com.vijay.configuredbyannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
	@Value("vijay")
	private String name;
	@Value("101")
	private String rollNumber;
	@Value("25")
	private String age;
	@Value("Solapur")
	private String city;
	@Autowired
	private Address address;
	
	
	public Address getAddress() {
		return address;
	}


	public void showData()
	{
	
		System.out.println("---------student information--------");
		System.out.println("name = "+name);
		System.out.println("Roll Number = "+rollNumber);
		System.out.println("Age = "+age);
		System.out.println("city = "+city);
		System.out.println("-----------Address-----------");
		System.out.println("Street : "+address.getStreetName());
		System.out.println("pin : "+address.getPin());
	}

}
