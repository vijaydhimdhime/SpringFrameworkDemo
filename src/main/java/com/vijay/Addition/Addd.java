package com.vijay.Addition;

import java.text.ParseException;

public class Addd {
	private int a;
	private int b;
//	public Addd(int a, int b)
//	{
//		this.a=(int)a;
//		this.b=(int)b;
//		System.out.println("constructor of   int, int");
//	}
	public Addd(double a, double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructor of   double, double");
	}
//	public Addd(String a, String b)
//	{
//		this.a=Integer.parseInt(a);
//		this.b=Integer.parseInt(b);
//		System.out.println("constructor of   string, string");
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.a+"  "+this.b;
	}
	
}
