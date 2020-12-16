package daytwoassignment.abstractclass.triangle;
import daytwoassignment.abstractclass.shape.Shape;

public class Triangle extends Shape 
{
	double base;
	double height;
	public Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}
	@Override
	public void printArea()
	{
		double area = (base*height)/2;
		System.out.println("The area of the triangle is: " + area);
	}
}
