package daytwo.assignment.oop;
/*
 *  A CurrentAccount object, 
in addition to the attributes of an Account object, should have an overdraft limit variable. Ensure that you have overridden methods of the Account class as 
necessary in both derived classes.
 */
public class CurrentAccount extends Account {
	private double overdraftLimit;
	
	public CurrentAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}
	@Override
	public void setID(int id) {
		setID(id);
	}
	
	
	@Override
	public void withdraw(double amount) {
		double currentBalance = getBalance();
		//if balance is zero or is negative to the max overdraft limit return message stating withdraw cannot be made
		if(currentBalance - amount > -overdraftLimit) {
			setBalance(currentBalance);
			
		} else
		{
			double newBalance = currentBalance - amount;
			setBalance(newBalance);
		}
	}
	
	@Override 
	public void deposit(double amount) {
		double currentBalance = getBalance();
		setBalance(currentBalance+amount);
	}
	@Override
	public String toString() {
		return "CurrentAccount ID: " + getId() +'\n'+"Account Creation Date: "+getDateCreated()+'\n'+"Balance: $"+getBalance()+'\n';
	}
}
