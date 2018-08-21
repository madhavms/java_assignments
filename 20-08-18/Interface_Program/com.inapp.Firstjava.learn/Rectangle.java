package com.inapp.Firstjava.learn;

import com.inapp.Firstjava.learn.inter_face.Polygon;


public class Rectangle extends Polygon {
 private double length;
 private double breadth;

 private boolean square;

public Rectangle()
{System.out.println("Constructor Rectangle()");
	}
public Rectangle(double length,double breadth)
{   
	this.length=length;
	this.breadth=breadth;
	double[] sides= {length,breadth,length,breadth};
	setSides(sides);


}

public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
	
	isSquare();
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
	
	isSquare();
    
    
}


public boolean isSquare()
{   square = breadth == length;
	return square;
}
@Override
public double calculateArea() {
	
	return length*breadth;
}




}

 
