package com.vijay.SpringAutowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int rollNo;
	String name;
	//@Autowired
	Address address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("----");
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("=============");
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}
	

}
