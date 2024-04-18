package com.vijay.withoutxmlfile.UsingBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.vijay.withoutxmlfile.UsingBeanAnnotation")
public class JavaConfiguration {
	@Bean
	public Fruit getFruit()
	{
		Fruit fruit = new Fruit();
		return fruit;
	}
}
