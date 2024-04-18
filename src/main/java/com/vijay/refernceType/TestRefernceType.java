package com.vijay.refernceType;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 

public class TestRefernceType {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("referncetype.xml");
//		Student student =(Student) context.getBean("student1");
		//System.out.println(student);
		
		 Resource r=new ClassPathResource("referncetype.xml");  
		    BeanFactory factory=new XmlBeanFactory(r); 
		    Student q=(Student)factory.getBean("student1");  
		    System.out.println(q);
	
	}

}
