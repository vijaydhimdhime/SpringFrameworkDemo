package com.vijay.parentBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {  
public static void main(String[] args) {  
   ApplicationContext context = new ClassPathXmlApplicationContext("parentBean.xml");
   Employee emp = (Employee) context.getBean("e2");
   emp.show();   
      
}  
}  
