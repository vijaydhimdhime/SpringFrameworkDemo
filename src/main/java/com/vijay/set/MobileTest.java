package com.vijay.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mobile.xml");
		Mobiles ph1 = (Mobiles)context.getBean("phone1");
		Mobiles ph2 = (Mobiles)context.getBean("phone2");
		System.out.println(ph1);
		System.out.println(ph2);
	}
}
