package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.RegularPolygon;
import com.inapp.Firstjava.learn.Square;
import com.inapp.Firstjava.learn.Rectangle;
import com.inapp.Firstjava.learn.inter_face.PolygonAreaCalculatorService;
import com.inapp.Firstjava.learn.inter_face.PolygonPerimeterCalculatorService;;
public class PolygonCalculatorTest {

	public static void main(String[] args) {
		PolygonCalculatorTest calculatorTest = new PolygonCalculatorTest();
		calculatorTest.testSquare();
		calculatorTest.testRectangle();
		calculatorTest.testPolygon();
	}
	public void testSquare() {

		PolygonAreaCalculatorService calculatorservice = new Square(3);
		PolygonPerimeterCalculatorService pericalculatorservice = new Square(3);
		System.out.println("\nArea of square:"+calculatorservice.calculateArea());
		System.out.println("\nPerimeter of square:"+pericalculatorservice.caculatePerimeter());
	}
	public void testRectangle() {

		PolygonAreaCalculatorService calculatorservice = new Rectangle(3,7);
		PolygonPerimeterCalculatorService pericalculatorservice = new Rectangle(3,7);
		System.out.println("\nArea of rectangle:"+calculatorservice.calculateArea());
		System.out.println("\nPerimeter of Rectangle:"+pericalculatorservice.caculatePerimeter());
	}
	public void testPolygon() {
		PolygonAreaCalculatorService calculatorservice = new RegularPolygon(3,8);
		PolygonPerimeterCalculatorService pericalculatorservice = new RegularPolygon(3,8);
		System.out.println("\nArea of polygon:"+Math.round(calculatorservice.calculateArea()));
		System.out.println("\nPerimeter of Polygon:"+pericalculatorservice.caculatePerimeter());
	}
	
		
		
	


}
