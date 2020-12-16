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
class to display the class name and the person’s name.
 Write a test program
that creates a Person, Student, Employee, Faculty, and Staff.
 */
public class TestProgram {
public static void main(String[] args) {
	// create person object
	Person person = new Person("Bob Wallace","123 Abc Street, SomeCity, TX, USA", "1-334-333-5555", 
								"email@domain.net");
	// create student object
	Student student = new Student("John Williams","321 A North Street, City, CA", "123-456-2345", "email@website.com","Freshman");
	
	// create Employee object
	Employee employee = new Employee("John Louis","2345 N. 1st Street, City, MA", "123-421-3454", "johnLouis@email.net",
									"Accounting",50000.00,"2004-12-23");
	// create Faculty object
	Faculty facultyMember = new Faculty("Sammi Willis","345 Sesema Ave, Atlanta, GA","234-345-3333","sammi@email.com","0930-1630",
										"Department Head");
	// create staff object
	Staff staffMember = new Staff("Joe Sleepy","123 North Lake Drive, North Lake, LA","234-456-4444","sleepyslow@sleepy.com","Janitor");
	
	// display each object
	System.out.print(person.toString()+'\n'+"Address: "+person.address+'\n'+"Phone Number: " + person.phoneNumber+'\n'+
			"Email: "+person.emailAddress+'\n'+'\n');
	System.out.print(student.toString()+'\n'+"Address: "+student.address+'\n'+"Phone Number: "+student.phoneNumber+'\n'+
					"Email: " +student.emailAddress+'\n'+"Class status: "+student.classStatus+'\n'+'\n');
	System.out.print(employee.toString()+'\n'+"Address: "+employee.address+'\n'+"Phone Number: "+employee.phoneNumber+'\n'+"Email: "+employee.emailAddress+'\n'+
				     "Office: "+employee.office+'\n'+"Salary: $"+employee.salary+'\n'+"Hire Date: "+employee.hireDate+'\n'+'\n');
	System.out.print(facultyMember.toString()+'\n'+"Address: "+facultyMember.address+'\n'+"Phone Number: "+facultyMember.phoneNumber+'\n'+"Email: "+facultyMember.emailAddress+'\n'+
					 "Office Hours: "+facultyMember.officeHours+'\n'+"Rank: "+facultyMember.rank+'\n'+'\n');
	System.out.print(staffMember.toString()+'\n'+"Address: "+staffMember.address+'\n'+"Phone Number: "+staffMember.phoneNumber+'\n'+"Title: "+staffMember.title+'\n');
	
	
}
}
