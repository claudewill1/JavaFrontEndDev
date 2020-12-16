package daytwoassignment.abstractclass.printareaofshapes;
import java.util.Scanner;
import daytwoassignment.abstractclass.circle.*;
import daytwoassignment.abstractclass.rectangle.*;
import daytwoassignment.abstractclass.triangle.*;

public class PrintAreaOfShapes {
	public static void main(String[] args) {
		// create scanner object
		Scanner sc = new Scanner(System.in);
		
		// get and set radius for circle
		System.out.print("Enter the radius of a circle: ");
		double radius = sc.nextDouble();
		
		// get and set length and width of rectangle
		System.out.print("Enter the length of rectangle: ");
		double length = sc.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double width = sc.nextDouble();
		
		// get and set base and height of triangle
		System.out.print("Enter the base of triangle: ");
		double base = sc.nextDouble();
		System.out.print("Enter height of triangle: ");
		double height = sc.nextDouble();
		
		// create circle object
		Circle c1 = new Circle(radius);
		
		// create rectangle object
		Rectangle r1 = new Rectangle(length, width);
		
		// create triangle object
		Triangle t1 = new Triangle(base, height);
		// print area of circle
		c1.printArea();
		// print area of rectangle
		r1.printArea();
		// print area of triangle
		t1.printArea();
	}
}
