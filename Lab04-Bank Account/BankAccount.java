package Lab04;

import java.util.Scanner;

public class BankAccount {

	private String first, last;
	public int accNo;
	private double balance, loanAmount, initialBalance = 0;
	public BankAccount()
	{

	}
	public BankAccount(double initialBalance)
	{
		this.initialBalance = initialBalance;
		balance = balance + initialBalance;
	}
	public void setName(String first, String last)
	{
		this.first = first;
		this.last = last;
	}
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}


//Getter methods for full name and account number.
	
	public String getFirstName() {
		return this.first;
		
	}public String getLastName() {
		return this.last;
	}

	public Integer getAccNo() {
		return this.accNo;
	}
	

    // Depositing money.
	public void setDeposit(double amount)
	{
		balance += amount;
	}

    // Withdrawing money.
	public void setWithdraw(double amount)
	{
		balance -= amount;
	}

    // Displaying current balance.
    public double getBalance()	
    {
        return balance;		
    }
    
// Give Customer loan on $5000 interest of 5% p.a 


	public void setloanAmount (double amounut)   {
		this.loanAmount = amounut;
	}
	public double getloanTotal() {
		
		return (this.loanAmount * (1 + (0.05 * 3)));
	}
//Armstrong = Boolean (like lab03 Palindrome)
	//this is my First toDo method
	
	public boolean checkArmstrong() {
		int origNumber = this.accNo;
		int newNumber = 0;
		int totalDigits = Integer.toString(origNumber).length();
		//1634 => 4 3 2 1
		//1634 => 163 => 16 => 1
		while (origNumber > 0) {
			int digit = origNumber % 10;
			newNumber += Math.pow(digit, totalDigits);
			origNumber /= 10;
		}
		return (newNumber == this.accNo);
//		int n =  this.accNo, originalNumber, remainder, result = 0;
//		originalNumber = n;
//		
//		
//		while (originalNumber != 0) {
//			remainder = originalNumber % 10;
//			result = result + (int)(Math.pow(remainder, 3));
//			originalNumber = originalNumber / 10;
//		}
//		if (result == n)
//			return true;
//		else
//			return false;
	}
}
