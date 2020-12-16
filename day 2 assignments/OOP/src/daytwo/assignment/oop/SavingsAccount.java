package daytwo.assignment.oop;



/*
 * A SavingsAccount object, 
in addition to the attributes of an Account object, should have an interest variable and a method which adds interest to the account.
 */
public class SavingsAccount extends Account {
	private double interest;
	
	public SavingsAccount(int id, double balance, double annualInterestRate) {
		super(id, balance);
	}
	
	public void addInterest() {
		this.interest = getBalance() * getMonthlyInterest();
		
		setBalance(this.interest);
	}
	
	@Override
	public void setID(int id){
		setID(id);
	}
	
	@Override
	public void withdraw(double amount) {
		double balance = getBalance();
		if ((balance - amount < 0) || (amount < 0)) {
            double newBalance;
			newBalance = balance;
        }
		else
		{			
			double withdrawAmount = amount;
			double newBalance = getBalance() - withdrawAmount ;
			this.setBalance(newBalance);	
		}
	}
	
	@Override 
	public void deposit(double amount) {
		double currentBalance = getBalance();
		setBalance(currentBalance+amount);
	}
	@Override
	public String toString() {
		return "Savings Account Id: " + getId() +'\n'+"Account Creation Date: "+getDateCreated()+'\n'+"Balance: $"+getBalance()+'\n';
	}
}
