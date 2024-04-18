package com.vijay.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("injectCollection.xml");
		InjectCollection list = (InjectCollection) context.getBean("collection2");
		InjectCollection injectioncollection = context.getBean("collection2",InjectCollection.class);
		//System.out.println(list);
		System.out.println(injectioncollection);
	}

}
