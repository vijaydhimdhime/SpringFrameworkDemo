package com.vijay.withoutxmlfile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
	@Value("Creata")
	private String carName;
	@Value("2022")
	private String model;
	


	public void showData() {
		System.out.println("car details: .......");
		System.out.println("Car NAme : "+carName);
		System.out.println("Car model year : "+model);		
	}

}
