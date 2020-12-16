package day6_assignment;

public class Employee implements Comparable<Employee> {
	int empid;
	String ename;
	float eSal;
	//Date date;
	public Employee(int empid,String name) {
		this.empid = empid;
		this.ename=name;
	}
	public int compareTo(Employee arg0) {
	//System.out.println("im inside ccompareto");
			/*if(this.empid<arg0.empid)
			return 1;
			else
			return -1;*/
			return this.ename.compareToIgnoreCase(arg0.ename);
	}	
	public String toString()
	{
		return this.empid+":"+ename;
	}
	public int hashCode()
	{
		return this.empid;
	}
	public boolean equals(Object o)
	{
			Employee e=(Employee)o;
			return this.empid==e.empid;
	 } 
	

}
