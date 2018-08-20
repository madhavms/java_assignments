package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.RegularPolygon;

import com.inapp.Firstjava.learn.inter_face.PolygonAreaCalculatorService;

public class PolygonCalculatorTest {

	public static void main(String[] args) {
		PolygonCalculatorTest calculatorTest = new PolygonCalculatorTest();
	    calculatorTest.testPolygon();
	}
	public void testPolygon() {
		PolygonAreaCalculatorService calculatorservice = new RegularPolygon(3,8); 
		System.out.println("Area of polygon:"+Math.round(calculatorservice.calculateArea()));
	}
	
		
		
	


}
