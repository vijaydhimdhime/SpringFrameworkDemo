package com.vijay.usingIndexconstructor.usingRefernce;

public class Car {
	private String carName;
	private Engine engine;

//	public void setCarName(String carName) {
//		this.carName = carName;
//	}
//	
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
	
	public void printData()
	{
		System.out.println("data of car....");
		System.out.println("car Name : "+carName);
		System.out.println("car model Year :"+engine.toString());
	}

public Car(String carName, Engine engine) {
	super();
	this.carName = carName;
	this.engine = engine;
}
	

}
