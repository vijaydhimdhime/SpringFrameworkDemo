package com.vijay.set;

import java.util.Set;

public class Mobiles {
	private String companyName;
	private Set<String> phoneName;
	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobiles(String companyName, Set<String> phoneName) {
		super();
		this.companyName = companyName;
		this.phoneName = phoneName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Set<String> getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(Set<String> phoneName) {
		this.phoneName = phoneName;
	}
	@Override
	public String toString() {
		return "Mobiles [companyName=" + companyName + ", phoneName=" + phoneName + "]";
	}
	

}
