package com.vijay.byrefernce;

public class Car {
	private String carName;
	private Engine engine;
	
	public Car() {
		System.out.println("car.....");
	}
	
	public void setCarName(String carName) {
		this.carName = carName;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printData()
	{
		System.out.println("car Name = "+carName);
		System.out.println("model name = "+engine.getModelName());
	}
	
	

	
//	public void printCarData()
//	{
//		System.out.println("carName = "+carName);
//		System.out.println("modelYear = "+engine);
//	}
	
}
