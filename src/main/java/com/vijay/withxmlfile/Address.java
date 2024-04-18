package com.vijay.withxmlfile;

public class Address {
	private String streetName;
	private String pin;
	public Address(String streetName, String pin) {
		super();
		this.streetName = streetName;
		this.pin = pin;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pin=" + pin + "]";
	}
	
}
