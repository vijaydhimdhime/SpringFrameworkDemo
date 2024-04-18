package com.vijay.constructorInjection;



public class Car {
	private String carName;
	private String carColor;
	private String carType;
	private Engine engine;
	public Car(String carName, String carColor, String carType, Engine engine) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.carType = carType;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", carType=" + carType + ", engine=" + engine
				+ "]";
	}
		
}
