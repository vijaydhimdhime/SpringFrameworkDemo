package com.vijay.studentinformation;

import java.util.List;

public class Student {
	private String standard;
	private List<String> studentName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String standard, List<String> studentName) {
		super();
		this.standard = standard;
		this.studentName = studentName;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public List<String> getStudentName() {
		return studentName;
	}
	public void setStudentName(List<String> studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [standard=" + standard + ", studentName=" + studentName + "]";
	}
	
}
