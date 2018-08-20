package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.RegularPolygon;
import com.inapp.Firstjava.learn.Square;
import com.inapp.Firstjava.learn.Rectangle;
import com.inapp.Firstjava.learn.inter_face.PolygonAreaCalculatorService;

public class PolygonCalculatorTest {

	public static void main(String[] args) {
		PolygonCalculatorTest calculatorTest = new PolygonCalculatorTest();
		calculatorTest.testSquare();
		calculatorTest.testRectangle();
		calculatorTest.testPolygon();
	}
	public void testSquare() {

		PolygonAreaCalculatorService calculatorservice = new Square(3);
		System.out.println("Area of square:"+calculatorservice.calculateArea());
	}
	public void testRectangle() {

		PolygonAreaCalculatorService calculatorservice = new Rectangle(3,7);
		System.out.println("Area of rectangle:"+calculatorservice.calculateArea());
	}
	public void testPolygon() {
		PolygonAreaCalculatorService calculatorservice = new RegularPolygon(3,8); 
		System.out.println("Area of polygon:"+Math.round(calculatorservice.calculateArea()));
	}
	
		
		
	


}
