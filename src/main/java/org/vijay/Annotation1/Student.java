package org.vijay.Annotation1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private String rollNumber;
	private String name;
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	
	public Student(@Qualifier("address") Address address) {
		super();
		this.address = address;
	}
	
	public Student(String rollNumber, String name, Address address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address = address;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student Information :\n"+"Name : "+name+"\n"+"Roll Number : "+rollNumber+"\n"+address;
	}
	
	
}
