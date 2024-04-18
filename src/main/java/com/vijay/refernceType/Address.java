package com.vijay.refernceType;

public class Address {
	private String streetName;
	private String cityName;
	private String state;
	private Pin pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String streetName, String cityName, String state, Pin pin) {
		super();
		this.streetName = streetName;
		this.cityName = cityName;
		this.state = state;
		this.pin = pin;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Pin getPin() {
		return pin;
	}
	public void setPin(Pin pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", cityName=" + cityName + ", state=" + state + ", pin=" + pin
				+ "]";
	}
	
}
