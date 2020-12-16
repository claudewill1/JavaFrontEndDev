package assignment2_financialpayrollapp;
import java.io.Console;
import java.util.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
/*(Financial application: payroll) Write a program that reads the following information
and prints a payroll statement:
Employee’s name (e.g., Smith)
Number of hours worked in a week (e.g., 10)
Hourly pay rate (e.g., 6.75)
Federal tax withholding rate (e.g., 20%)
State tax withholding rate (e.g., 9%)

ex:
Enter employee's name:
Enter number of hours worked in a week:
Enter hourly pay rate:
Enter federal tax withholding rate:
Enter state tax withholding rate:
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $6.75
Gross Pay: $67.5
Deductions:
Federal Withholding (20.0%): $13.5
State Withholding (9.0%): $6.07
Total Deduction: $19.57
Net Pay: $47.92  */
public class FinancialPayRollApp {
	private static DecimalFormat df = new DecimalFormat("0.00");
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// get employee name
	System.out.print("Enter the employees name: ");
	// save employee name to String variable name
	String name = scan.next();
	// ask for hours worked
	System.out.print("enter the hours worked: ");
	// save hours worked to "hours"
	String hours = scan.next();
	// parse hours to float
	float hrs = Float.parseFloat(hours);
	// ask for payrate
	System.out.print("Enter hourly pay rate: ");
	// save payrate
	String payRt = scan.next();
	// convert payrate to float
	float payRate = Float.parseFloat(payRt);
	// get federal tax rate
	System.out.print("Enter federal tax withholding rate: ");
	// save to string variable
	String fedRt = scan.next();
	// parse to float
	float federalRate = Float.parseFloat(fedRt);
	// get state tax rate
	System.out.print("Enter state tax withholding rate: ");
	// save state rate to string variable
	String stateRt = scan.next();
	// parse to float
	float stateRate = Float.parseFloat(stateRt);
	// calculate gross pay
	float grossPay = hrs * payRate;
	// calculate federal taxes
	float federalTaxes = (federalRate/100) * grossPay;
	// calculate state taxes
	float stateTaxes = (stateRate/100) * grossPay;
	// calculate total tax deduction
	float totalDeduction = federalTaxes + stateTaxes;
	// calculate net pay
	float netPay = grossPay - totalDeduction;
	// print information to console
	System.out.println("Employee Name: " + name+'\n'+ "Hours Worked: " + hrs+'\n' + "Pay Rate: $" + df.format(payRate) + '\n'+"Gross Pay: $"+df.format(grossPay)+'\n'+
						"Deductions:\n"+ "Federal Withholding: ("+federalRate+"): $"+df.format(federalTaxes)+'\n'+"State Withholding: ("+stateRate+"): $"+df.format(stateTaxes)+'\n'
						+"Total Deduction: $"+df.format(totalDeduction)+'\n'+"Net Pay: $"+ df.format(netPay));
	
	
}

}
