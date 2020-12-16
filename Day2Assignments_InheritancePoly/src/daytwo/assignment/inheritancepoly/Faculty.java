package daytwo.assignment.inheritancepoly;
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
class to display the class name and the person�s name.
 Write a test program
that creates a Person, Student, Employee, Faculty, and Staff.
 */
public class Faculty extends Person {
	String officeHours;
	String rank;
	final String CLASS_NAME = "Faculty";
	// constructor
	public Faculty(String name, String address, String phoneNumber, String emailAddress, 
			String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	
	


	@Override
	public String toString() {
		return "Class name: " + CLASS_NAME + " Faculty Member Name: "+name;
	}
}
