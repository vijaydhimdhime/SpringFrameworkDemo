package com.vijay.refernceTyprDemo;



public class Car {
	private String carName;
	private String carColor;
	private String carType;
	private Engine engine;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carName, String carColor, String carType, Engine engine) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.carType = carType;
		this.engine = engine;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", carType=" + carType + ", engine=" + engine
				+ "]";
	}
	
}
