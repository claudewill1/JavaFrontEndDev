package daytwo.assignment.oop;
import java.util.ArrayList;
import java.util.List;
/*
 * Now create a Bank class, an object of which contains an array of Account objects. Accounts in the array could be instances of the Account class, the 
SavingsAccount class, or the CurrentAccount class. Create some test accounts (some of each type).
Write an update method in the bank class. It iterates through each account, updating it in the following ways: Savings accounts get interest added 
(via the method you already wrote); CurrentAccounts get a letter sent if they are in overdraft.
The Bank class requires methods for opening and closing accounts, and for paying a dividend into each account.
Hints:

Note that the balance of an account may only be modified through the deposit(double) and withdraw(double) methods.
The Account class should not need to be modified at all.
Be sure to test what you have done after each step.
 */
public class Bank {
public static void main(String[] args) {
	Account account1 = new Account(1,234.23);
	Account account2 = new Account(2,100.00);
	Account account3 = new Account(3,100.00);
	SavingsAccount savings1 = new SavingsAccount(1,500.00,2.0);
	SavingsAccount savings2 = new SavingsAccount(2,300.00,2.0);
	SavingsAccount savings3 = new SavingsAccount(3,5000.00,2.0);
	CurrentAccount curAccount1 = new CurrentAccount(1,500.00,100);
	CurrentAccount curAccount2 = new CurrentAccount(2,60.00,200);
	// ArrayList to hold all accounts
	List<Object> accountList = new ArrayList<Object>();
	accountList.add(account1);
	accountList.add(account2);
	accountList.add(account3);
	accountList.add(savings1);
	accountList.add(savings2);
	accountList.add(savings3);
	accountList.add(curAccount1);
	accountList.add(curAccount2);
	
	for(Object account: accountList) {
		System.out.print(account.toString());
	}
	// deposit into account 1 and print updated balance
	((Account) accountList.get(0)).deposit(100.00);
	System.out.println("Account id: "+((Account) accountList.get(0)).getId()+ " New balance is: $" +(((Account) accountList.get(1)).getBalance() + " after this deposit")+'\n');
	// get date created of account 2
	System.out.println("Account: "+((Account) accountList.get(1)).getId()+" was created on "+(((Account) accountList.get(2)).getDateCreated())+'\n');
	
	// withdraw from account3
	
	((Account) accountList.get(2)).withdraw((800.00));
	System.out.println("New balance $"+(((Account) accountList.get(2)).getBalance())+'\n');
	// add interest to savings accounts
	((SavingsAccount) accountList.get(3)).addInterest();
	((SavingsAccount) accountList.get(4)).addInterest();
	((SavingsAccount) accountList.get(5)).addInterest();
	
	// try and overdraw from CurrentAccounts
	((CurrentAccount) accountList.get(6)).withdraw(300);
	((CurrentAccount) accountList.get(7)).withdraw(110);

	// Print accounts and balances
	//Normal Accounts
	System.out.print(((Account) accountList.get(0)).toString());
	System.out.print(((Account) accountList.get(1)).toString());
	System.out.print(((Account) accountList.get(2)).toString());
	System.out.println();
	// Savings Account
	System.out.print(((SavingsAccount) accountList.get(3)).toString());
	System.out.print(((SavingsAccount) accountList.get(4)).toString());
	System.out.print(((SavingsAccount) accountList.get(5)).toString());
	System.out.println();
	// Current Accounts
	System.out.print(((Account) accountList.get(6)).toString());
	System.out.print(((Account) accountList.get(7)).toString());
	
	
	
	
	
}
}
	