package com.vijay.lookup_Method;

public class Address {
	private String city;
	private int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}

	

}
