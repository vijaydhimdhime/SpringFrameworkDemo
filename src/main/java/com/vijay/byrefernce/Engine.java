package com.vijay.byrefernce;

public class Engine {
	private String modelName;

	

	public Engine() {
		System.out.println("Engine...");
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@Override
	public String toString() {
		return "Engine [modelName=" + modelName + "]";
	}

	

}
