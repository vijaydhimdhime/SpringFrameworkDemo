package com.vijay.usingBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {
	@Bean
	public Student getStudent()
	{
		return new Student();
	}
	@Bean
	public Pin getPin()
	{
		return new Pin();
	}
}
