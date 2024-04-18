package com.vijay.dependentObject;

public class Car {
	private String carName;
	private Engine engine;
	public Car()
	{
		System.out.println("Car constructor.....");
	}
	public String getCarName() {
		return carName;
	}
	public Engine getEngine() {
		return engine;
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
		System.out.println("model year = "+engine.getModelyear());
	}
}
