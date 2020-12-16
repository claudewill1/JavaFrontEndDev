package daytwo.assignment.oop;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/*
 * Account that contains:
¦ A private int data field named id for the account (default 0).
¦ A private double data field named balance for the account (default 0).
¦ A private double data field named annualInterestRate that stores the
current interest rate (default 0). Assume all accounts have the same interest rate.
¦ A private Date data field named dateCreated that stores the date when the
account was created.
¦ A no-arg constructor that creates a default account.
¦ A constructor that creates an account with the specified id and initial balance.
¦ The accessor and mutator methods for id, balance, and
annualInterestRate.
¦ The accessor method for dateCreated.
¦ A method named getMonthlyInterestRate() that returns the monthly
interest rate.
¦ A method named getMonthlyInterest() that returns the monthly interest.
¦ A method named withdraw that withdraws a specified amount from the
account.
¦ A method named deposit that deposits a specified amount to the account

The method getMonthlyInterest() is to return monthly interest, not the interest rate. Monthly
interest is balance * monthlyInterestRate. monthlyInterestRate is annualInterestRate / 12. Note that annualInterestRate is a percentage,
e.g.,like 4.5%. You need to divide it by 100.)
 */
public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate = 0.0;
	private Date dateCreated;
	public Account() {
		this.id = 0;
		this.balance = 0.0;
		this.annualInterestRate = 1.0;
		this.dateCreated = new Date();
		
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		
	}
	// accessor and mutator methods for id
	public int getId() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	// accessor and mutator methods for balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	// accessor and mutator methods for annualInterestRate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}
	// accessor for dateCreated
	public Date getDateCreated() {
		return dateCreated = new Date();
	}
	 
	// getMonthlyInterestRate()
	protected double getMonthlyInterestRate(double annualInterestRate) {
		return (annualInterestRate / 12) / 100;
	}
	public double getMonthlyInterest() {
		return this.balance * getMonthlyInterestRate(annualInterestRate);
	}
	
	protected void withdraw(double amount) {
		double balance = this.balance;
		if ((balance - amount < 0) || (amount < 0)) {
            this.balance = balance;
        }
		else
		{			
			double withdrawAmount = amount;
			double newBalance = this.balance - withdrawAmount ;
			this.balance = newBalance;	
		}
		
        
	}
	
	// deposit method
	protected void deposit(double amount) {
		double newBalance = this.balance + amount;
		this.balance = newBalance;
	}
	
	public String toString() {
		return "Account Id: " + id+'\n'+"Date Created: "+getDateCreated()+"Balance: $"+balance+'\n';
	}
}
