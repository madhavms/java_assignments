package com.inapp.Firstjava.test;

public class WrapperTest {
public static void main(String[] args) {
	Integer x=10; //boxing
	x=x+5;        //unboxing
	System.out.println(x);
	double degrees = 30.0;
	double radians = Math.toRadians(degrees);
	System.out.println(Math.sin(radians));
}
}

