package com.vijay.Autowired;

public class Engine {
	private String modelyaer;

	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Engine(String modelyaer) {
		super();
		this.modelyaer = modelyaer;
	}

	public String getModelyaer() {
		return modelyaer;
	}

	public void setModelyaer(String modelyaer) {
		this.modelyaer = modelyaer;
		System.out.println(">>>>>>>>>>>>");
	}

	@Override
	public String toString() {
		return "Engine [modelyaer=" + modelyaer + "]";
	}
	
}
