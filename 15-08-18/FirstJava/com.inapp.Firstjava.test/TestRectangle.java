package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.*;
public class TestRectangle {
	
	
	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();
		System.out.println("Area="+rectangle.getArea());
		Rectangle rectangle2=new Rectangle(4,6);
		System.out.println("Is square:"+rectangle2.isSquare());
		System.out.println("Area="+rectangle2.getArea());
		System.out.println("Perimeter="+rectangle2.getPerimeter());
		rectangle2.setBreadth(4);
		
		System.out.println("Is square:"+rectangle2.isSquare());
		System.out.println("Area="+rectangle2.getArea());
		System.out.println("Perimeter="+rectangle2.getPerimeter());
		 
	}
}
