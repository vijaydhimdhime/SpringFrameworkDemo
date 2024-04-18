package com.vijay.DIconstructor;

import org.springframework.beans.factory.BeanFactory;  

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class Test {  
public static void main(String[] args) {  
	ApplicationContext context = new ClassPathXmlApplicationContext("DI.xml");
	Question question = (Question) context.getBean("question");
	System.out.println(question);
	question.displayInfo();
      
}  
}  