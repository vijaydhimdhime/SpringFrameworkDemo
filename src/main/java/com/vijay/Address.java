package com.vijay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component

public class Address {
	@Value("pune")
	private String city;

	public String getCity() {
		return city;
	}

//	public void setCity(String city) {
//		this.city = city;
//	}
	

}
