package com.inapp.Firstjava.learn;



public class Square extends Rectangle  {

	public Square() {
		System.out.println("Constructor square()");
	}
	public Square(double sidelength) {
		
		super(sidelength,sidelength);
//		System.out.println("Constructor square(d,d)");
		
	}
}
