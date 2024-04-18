package com.vijay.usingBeanAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class Pin {
	@Value("410513")
	private String pin;


	public String getPin() {
		return pin;
	}
	
	
}
