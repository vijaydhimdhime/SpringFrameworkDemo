package com.vijay.usingConstructor;

public class StudentDetails {
	private int studentRollNumber;
	private String studentName;
	private String address;
	private Pin pincode;
	public StudentDetails(int studentRollNumber, String studentName, String address, Pin pincode) {
		super();
		this.studentRollNumber = studentRollNumber;
		this.studentName = studentName;
		this.address = address;
		this.pincode = pincode;
	}
//	@Override
//	public String toString() {
//		return "StudentDetails [studentRollNumber=" + studentRollNumber + ", studentName=" + studentName + ", address="
//				+ address + "]";
//	}
//	
	public String toString() {
		return "StudentDetails:\n"+"studentRollNumber --->"+this.studentRollNumber+"\n"+"studentName --->"
	+this.studentName+"\n"+"address --->"+this.address+"\n"+"pincode --->"+this.pincode;
	}

}
