package org.vijay.Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private Teacher teacher;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [teacher=" + teacher + "]";
	}
	
	
	

}
