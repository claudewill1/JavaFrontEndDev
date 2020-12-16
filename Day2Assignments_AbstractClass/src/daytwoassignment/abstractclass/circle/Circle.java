package daytwoassignment.abstractclass.circle;

import daytwoassignment.abstractclass.shape.Shape;

public class Circle extends Shape {
	final double PI = Math.PI;
    double radius;
	
	public Circle(double radius) 
	{
		//initialize
		this.radius = radius;
	}
	@Override
	public void printArea() {
		double area = PI * Math.pow(radius, 2);
		System.out.println("The area of the circle is: "+area);
	}
	
	
	
}
