package com.vijay.usingIndexconstructor.usingRefernce;

public class Engine {
	private String modelYear;
	
	public Engine(String modelYear) {
		super();
		this.modelYear = modelYear;
	}

	@Override
	public String toString() {
		return modelYear;
	}

//	public String getModelYear() {
//		return modelYear;
//	}
//
//	public void setModelYear(String modelYear) {
//		this.modelYear = modelYear;
//	}
//	
	
}
