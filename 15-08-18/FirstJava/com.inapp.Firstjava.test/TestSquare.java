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
		
	}
	}
}

