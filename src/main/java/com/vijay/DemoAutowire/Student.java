package com.vijay.DemoAutowire;

import java.util.List;

public class Student {
	private String studentName;
	private int studentRollNumber;
	private List<String> subjects;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String studentName, int studentRollNumber, List<String> subjects) {
		super();
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.subjects = subjects;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString() {
		return "Student Information : \n"+"Name = "+studentName+"\n"+"Roll Number = "+studentRollNumber+"\n"+"subjects = "
				+ subjects;
	}
	
	

}
