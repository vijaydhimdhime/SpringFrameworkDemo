package com.vijay.springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collectionconfig.xml");
		Employee emp = (Employee)context.getBean("emp1");
		System.out.println("employee id : "+emp.getEmpId());
		System.out.println("employee's phone list : "+emp.getPhones());
		System.out.println("set of employee's addresses : "+emp.getAddresses());
		System.out.println("subjects : "+emp.getSubjects());
				
	}

}
