package com.inapp.Firstjava.test;
import com.inapp.Firstjava.learn.*;
public class TestSquare{
	public static void main(String[] args) {
		int arrayLength=5;
		Square squareArr[]=new Square[arrayLength];
		for(int i=0;i<arrayLength;i++) {
	    Square square=new Square(i+1);
	    squareArr[i]=square;
	    }
		for(int i=0;i<arrayLength;i++) {
		System.out.println(squareArr[i].getArea());
		
	}   Square square1=new Square();
		System.out.println("area of square : "+square1.getArea());

		System.out.println("Is square : "+square1.isSquare());
		square1.setLength(10);

		System.out.println("Is square : "+square1.isSquare());
		System.out.println("area of square : "+square1.getArea());
		square1.setBreadth(10);
		System.out.println("area of square : "+square1.getArea());
		System.out.println("Is square : "+square1.isSquare());
		System.out.println("Is ** square : "+(square1 instanceof Rectangle));
	}
}

