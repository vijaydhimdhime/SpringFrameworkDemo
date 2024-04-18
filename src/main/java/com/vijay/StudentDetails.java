package com.vijay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class StudentDetails {
	@Value("105")
	private int studentRollNumber;
	@Value("vijay")
	private String studentName;
	@Autowired
	private Address address;
	
	public Address getAddress() {
		return address;
	}


//	public void setAddress(Address address) {
//		this.address = address;
//	}


	@Override
	public String toString() {
		return studentName+"\n"+studentRollNumber+"\n"+address.getCity();
	}
	
	
	public void show()
	{
		System.out.println("welcome to spring config type...");
	}
}
