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
public class Staff extends Person {
	String title;
	final String CLASS_NAME = "Staff";
	public Staff(String name, String address, String phoneNumber, String emailAddress, String title) {
		super(name, address, phoneNumber, emailAddress);
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Class name: " + CLASS_NAME + " Staff Member Name: " + name;
	}
}
