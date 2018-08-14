package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.*;
public class TestSquare{
	public static void main(String[] args) {
		Square obj=new Square(6);
		System.out.println("Length of square:"+obj.getLength());
		System.out.println("Breadth of square:"+obj.getBreadth());  
		System.out.println("Area of square:"+obj.getArea());  
		System.out.println("Perimeter of square:"+obj.getPerimeter()); 
	}

}
