package com.vijay.car;

import java.util.Map;

public class Car {
	private String comapanyName;
	private Map<String, String> carNames;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String comapanyName, Map<String, String> carNames) {
		super();
		this.comapanyName = comapanyName;
		this.carNames = carNames;
	}
	public String getComapanyName() {
		return comapanyName;
	}
	public void setComapanyName(String comapanyName) {
		this.comapanyName = comapanyName;
	}
	public Map<String, String> getCarNames() {
		return carNames;
	}
	public void setCarNames(Map<String, String> carNames) {
		this.carNames = carNames;
	}
	@Override
	public String toString() {
		return "Car [comapanyName=" + comapanyName + ", carNames=" + carNames + "]";
	}
	

}
