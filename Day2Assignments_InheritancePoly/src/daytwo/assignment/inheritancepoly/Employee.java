package daytwo.assignment.inheritancepoly;
import java.time.LocalDate;
import java.util.Date;

/*
 * Inheritahce and Polymorphism
(The Person, Student, Employee, Faculty, and Staff classes) Design a
class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee. A person has a name,
address, phone number, and email address. A student has a class status (freshman,
sophomore, junior, or senior). Define the status as a constant. An employee has an
office, salary, and date hired. Use the MyDate class defined in Programming Exercise
10.14 to create an object for date hired. A faculty member has office hours
and a rank. A staff member has a title. Override the toString method in each
class to display the class name and the person’s name.
 Write a test program
that creates a Person, Student, Employee, Faculty, and Staff.
 */
public class Employee extends Person{
	final String CLASS_NAME = "Employee";
	String office;
	
	double salary;
	// I couldn't find the Programming exercise 10.14 that is supposed to contain the "MyDate" class in either assignments
	// or examples
	LocalDate hireDate;
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, 
			double salary, String hireDate) {
		super(name, address, phoneNumber,emailAddress);
		this.office = office;
		this.salary = salary;
		this.hireDate = LocalDate.parse(hireDate); // date input taken as string, must be parsed to Date type
	}
	
	@Override
	public String toString() {
		return "Class: " + this.CLASS_NAME + " Employee Name: " + this.name;
	}
	
}
