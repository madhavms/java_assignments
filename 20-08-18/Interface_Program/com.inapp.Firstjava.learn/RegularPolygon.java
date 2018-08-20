package com.inapp.Firstjava.learn;

import com.inapp.Firstjava.learn.inter_face.Polygon;

public class RegularPolygon extends Polygon {
	private int noofsides;
	private double sidelength;
public RegularPolygon() {
	
}
public RegularPolygon(int noofsides,double sidelength) {
	this.noofsides = noofsides;
	this.sidelength = sidelength;
	
}
@Override
public double calculateArea() {
	 return (noofsides * (sidelength * sidelength)) / (4.0 * Math.tan((Math.PI / noofsides)));
}
}

