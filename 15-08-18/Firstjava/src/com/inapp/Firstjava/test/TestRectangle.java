package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.*;
public class TestRectangle {
	
	
	public static void main(String[] args) {
		Rectangle obj=new Rectangle(5.5,4);
		System.out.println("Length of rectangle:"+obj.getLength());
		System.out.println("Breadth of rectangle:"+obj.getBreadth());  
		System.out.println("Area of rectangle:"+obj.getArea());  
		System.out.println("Perimeter of rectangle:"+obj.getPerimeter());  
	}
}
