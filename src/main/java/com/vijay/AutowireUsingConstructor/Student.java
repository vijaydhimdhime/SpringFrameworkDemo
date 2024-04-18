package com.vijay.AutowireUsingConstructor;

import java.util.List;

public class Student {
	private String studentName;
	private int studentRollNumber;
	private List<String> subjects;
	private Teacher teacher;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
//	public Student(String studentName, int studentRollNumber, List<String> subjects, Teacher teacher) {
//		super();
//		this.studentName = studentName;
//		this.studentRollNumber = studentRollNumber;
//		this.subjects = subjects;
//		this.teacher = teacher;
//	}
	
//	@Override
//	public String toString() {
//		return "Student Information : \n"+"Name = "+studentName+"\n"+"Roll Number = "+studentRollNumber+"\n"+"subjects = "
//				+ subjects+"\n"+teacher;
//	}
//	
//	@Override
//	public String toString() {
//		return "Student [studentName=" + studentName + ", studentRollNumber=" + studentRollNumber + ", subjects="
//				+ subjects + ", teacher=" + teacher + "]";
//	}
//	

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
		return "Student [studentName=" + studentName + ", studentRollNumber=" + studentRollNumber + ", subjects="
				+ subjects + ", teacher=" + teacher + "]";
	}
	

}
