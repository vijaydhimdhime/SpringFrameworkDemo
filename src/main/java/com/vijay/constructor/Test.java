package com.vijay.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	  ApplicationContext context = new ClassPathXmlApplicationContext("questionAnswer.xml");  
	      Question question = (Question)context.getBean("question1");
	   System.out.println(question);
	   question.displayInfo();
	} 

}
