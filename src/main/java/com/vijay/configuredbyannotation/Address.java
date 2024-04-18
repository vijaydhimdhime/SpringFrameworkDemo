package com.vijay.configuredbyannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Bajirao Road")
	private String streetName;
	@Value("410002")
	private String pin;
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getStreetName() {
		return streetName;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	

}
