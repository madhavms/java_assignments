package com.inapp.Firstjava.learn;

public class Rectangle {
 private double length;
 private double breadth;
 private double area;
 private double perimeter;
 private boolean square;

public Rectangle()
{System.out.println("Constructor Rectangle()");
	}
public Rectangle(double length,double breadth)
{
	this.length=length;
	this.breadth=breadth;
	area=length*breadth;
	perimeter=2*(length*breadth);
	System.out.println("Constructor Rectangle(l,b)");
}

public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
	updateAreaAndPerimeter();
	square = length == breadth;
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
	updateAreaAndPerimeter();
	System.out.println("value of boolean sqaure:"+square);
    square = breadth == length;
    System.out.println("value of boolean sqaure:"+square);
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
{
	return square;
}
}

 
