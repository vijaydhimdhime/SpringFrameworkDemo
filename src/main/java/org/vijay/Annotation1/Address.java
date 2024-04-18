package org.vijay.Annotation1;

public class Address {
	private String streetName;
	private String city;
	private String state;
	private int pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String streetName, String city, String state, int pin) {
		super();
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "----Address Details------ :\n"+"Street Name : "+streetName+"\n"+"City : "+city+"\n"+"State : "+state+"\n"+"Pin Code : "+pin;
	}
	
	
}
