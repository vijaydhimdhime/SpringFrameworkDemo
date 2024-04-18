package com.vijay.springcollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int empId;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String, String> subjects;
//	public Employee(int empId, List<String> phones) {
//		super();
//		this.empId = empId;
//		this.phones = phones;
//	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public List<String> getPhones() {
//		return phones;
//	}
//	public void setPhones(List<String> phones) {
//		this.phones = phones;
//	}
//	@Override
//	public String toString() {
//		return "Employee [empId=" + empId + ", phones=" + phones + "]";
//	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
public Employee(int empId, List<String> phones, Set<String> addresses, Map<String, String> subjects) {
	super();
	this.empId = empId;
	this.phones = phones;
	this.addresses = addresses;
	this.subjects = subjects;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Set<String> getAddresses() {
	return addresses;
}
public void setAddresses(Set<String> addresses) {
	this.addresses = addresses;
}
public Map<String, String> getSubjects() {
	return subjects;
}
public void setSubjects(Map<String, String> subjects) {
	this.subjects = subjects;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", phones=" + phones + ", addresses=" + addresses + ", subjects=" + subjects
			+ "]";
}

	
	/*for set
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, List<String> phones, Set<String> addresses) {
		super();
		this.empId = empId;
		this.phones = phones;
		this.addresses = addresses;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", phones=" + phones + ", addresses=" + addresses + "]";
	}
*/
	
	
}
