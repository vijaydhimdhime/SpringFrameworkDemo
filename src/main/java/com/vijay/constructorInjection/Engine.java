package com.vijay.constructorInjection;

public class Engine {
	private String engineType;

	public Engine(String engineType) {
		super();
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [engineType=" + engineType + "]";
	}

	
}
