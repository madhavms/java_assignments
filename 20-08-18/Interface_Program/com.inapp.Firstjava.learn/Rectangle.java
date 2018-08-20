package com.inapp.Firstjava.learn;

import com.inapp.Firstjava.learn.inter_face.Polygon;


public class Rectangle extends Polygon {
 private double length;
 private double breadth;
 private double area;
 private double perimeter;
 private boolean square;

public Rectangle()
{System.out.println("Constructor Rectangle()");
	}
public Rectangle(double length,double breadth)
{   int i;
	this.length=length;
	this.breadth=breadth;
	double[] sides= {length,breadth,length,breadth};
	setSides(sides);

//	perimeter=2*(length+breadth);
/*	while(i<2) {
		perimeter=length+breadth;
		i++;
	}*/
	/*do
	{
		perimeter=length+breadth;
		i++;
	}
	while(i<2);*/
	for(i=0;i<2;i++) {
		perimeter=length+breadth;
	}
//	System.out.println("Constructor Rectangle(l,b)");
}

public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
	updateAreaAndPerimeter();
	isSquare();
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
	updateAreaAndPerimeter();
	isSquare();
    
    
}
public double getArea() {
	return area;
}

public double getPerimeter() {
	return perimeter;
}
private void updateAreaAndPerimeter() {
	area=length*breadth;
    perimeter=2*(length+breadth);
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

 
