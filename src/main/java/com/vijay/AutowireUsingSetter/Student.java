package com.vijay.AutowireUsingSetter;

import java.util.List;

public class Student {
	private String studentName;
	private int studentRollNumber;
	private List<String> subjects;
	private Teacher teacher;
		
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


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "Student Information : \n"+"Student Name = "+studentName+"\n"+"Roll Number = "+studentRollNumber+"\n"+"subjects = "
				+ subjects+"\n"+teacher;
	}
//	
//	@Override
//	public String toString() {
//		return "Student [studentName=" + studentName + ", studentRollNumber=" + studentRollNumber + ", subjects="
//				+ subjects + ", teacher=" + teacher + "]";
//	}
//	
	

}
