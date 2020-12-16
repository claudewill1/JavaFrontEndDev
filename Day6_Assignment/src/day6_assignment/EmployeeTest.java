package day6_assignment;
import java.util.*;
import java.util.Map.Entry;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		
		// use try catch block to catch any exceptions
		try 
		{
			// create employee TreeMap
			TreeMap<Employee, String> employee=new TreeMap<Employee,String>();
			// add three employee key/value pairs to EmployeeMap
			Employee e3=new Employee(1998,"Maruthi");
			Employee e1=new Employee(1504,"Jaanu");
			Employee e2=new Employee(1505,"Kus");
			Employee e5=new Employee(1507,"Rob");
			Employee e6=new Employee(1507,"Rand");

			// Add designations to employees
			employee.put(e1, "Senior Systems Architech");
			employee.put(e2,"Soft Dev");
			employee.put(e3,"Lead");
			employee.put(e3,"Lead");
			employee.put(e5, "Jr Dev");
			employee.put(e6, "UI/UX Designer");
			// changing designation of one employee
			employee.put(e6,"Soft Dev");
			System.out.println(employee);

			// sort TreeMap in reverse order
			// use Map descendingMap() method to reverse order
			Map<Employee, String> reverseEmployee = employee.descendingMap();
			// print employees in reverse order
			System.out.println("Employees in Reverse Order: "+reverseEmployee);
		} catch (NullPointerException e) {
			System.out.println("Exception thrown" + e);
		}
  	}

}

