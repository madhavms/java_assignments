package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.RegularPolygon;
import com.inapp.Firstjava.learn.Square;
import com.inapp.Firstjava.learn.Rectangle;
import com.inapp.Firstjava.learn.inter_face.PolygonCalculatorService;

public class PolygonCalculatorTest {

	public static void main(String[] args) {
		PolygonCalculatorTest calculatorTest = new PolygonCalculatorTest();
		calculatorTest.testSquare();
		calculatorTest.testRectangle();
		calculatorTest.testPolygon();
	}
	public void testSquare() {

		PolygonCalculatorService calculatorservice = new Square(3);
		
		System.out.println("\nArea of square:"+calculatorservice.calculateArea());
		System.out.println("\nPerimeter of square:"+calculatorservice.caculatePerimeter());
	}
	public void testRectangle() {

		PolygonCalculatorService calculatorservice = new Rectangle(3,6);
		
		System.out.println("\nArea of rectangle:"+calculatorservice.calculateArea());
		System.out.println("\nPerimeter of Rectangle:"+calculatorservice.caculatePerimeter());
	}
	public void testPolygon() {
		PolygonCalculatorService calculatorservice = new RegularPolygon(4,8);
		
		System.out.println("\nArea of polygon:"+Math.round(calculatorservice.calculateArea()));
		System.out.println("\nPerimeter of Polygon:"+calculatorservice.caculatePerimeter());
	}
	
		
		
	


}
