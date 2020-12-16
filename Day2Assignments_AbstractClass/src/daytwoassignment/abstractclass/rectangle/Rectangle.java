package daytwoassignment.abstractclass.rectangle;

import daytwoassignment.abstractclass.shape.Shape;

public class Rectangle extends Shape {
	double length;
	double width;
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	@Override
	public void printArea()
	{
		double area = length * width;
		System.out.println("The area of the rectangle is: "+area);
	}
}
