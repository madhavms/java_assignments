package com.inapp.Firstjava.learn.inter_face;

public abstract class Polygon implements PolygonCalculatorService{
private double[] sides;
private int noofsides;
	@Override
	public double caculatePerimeter() {
		double perimeter = 0;
		if(sides != null && sides.length >0){
			for (int i = 0; i < sides.length; i++) {
				
				perimeter = perimeter + sides[i];
				
			}
		}
		return perimeter;
	}
	
	
	
	public int getNoofsides() {
	return noofsides;
}
public void setNoofsides(int noofsides) {
	this.noofsides = noofsides;
}

	public double[] getSides() {
		return sides;
	}

	public void setSides(double[] sides) {
		this.sides = sides;
	}

}

