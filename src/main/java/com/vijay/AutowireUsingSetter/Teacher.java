package com.vijay.AutowireUsingSetter;

public class Teacher {
	private String name;
	private String subject;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher Name = "+name+"\n"+"subject = "+subject;
	}
	

}
