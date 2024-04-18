package com.vijay.withoutxmlfile.UsingBeanAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class Fruit {
	@Value("Mango")
	private String fruitName;
	@Value("Yello")
	private String fruitColor;
	@Value("Sweet")
	private String fruitTest;
	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitColor=" + fruitColor + ", fruitTest=" + fruitTest + "]";
	}
	
	
}
