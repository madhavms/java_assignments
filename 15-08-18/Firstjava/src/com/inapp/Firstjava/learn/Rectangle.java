package com.inapp.Firstjava.learn;

public class Rectangle {
 private double length;
 private double breadth;
 private double area;
 private double perimeter;

public Rectangle()
{
	}
public Rectangle(double length,double breadth)
{
	this.length=length;
	this.breadth=breadth;
	area=length*breadth;
	perimeter=2*(length*breadth);
}

public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public double getPerimeter() {
	return perimeter;
}
public void setPerimeter(double perimeter) {
	this.perimeter = perimeter;
}

}

 