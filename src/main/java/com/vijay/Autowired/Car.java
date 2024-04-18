package com.vijay.Autowired;

public class Car {
	private Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
		System.out.println("setter......");
	}

	@Override
	public String toString() {
		return "Car Model Year = "+engine.getModelyaer();
	}
	

	
}
