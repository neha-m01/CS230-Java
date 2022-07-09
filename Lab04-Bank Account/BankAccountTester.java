package Lab04;
import java.util.Scanner;

public class BankAccountTester {

	public static void main(String[] args)
	{
		String firstname, lastname;
		int accNo;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name : ");
		firstname = sc.nextLine();
		System.out.println( "Enter last name : ");
		lastname = sc.nextLine();
		System.out.println( "Enter the account number : ");
		accNo = Integer.parseInt(sc.nextLine());
		System.out.println();

		//BankAccounut
		BankAccount b = new BankAccount(4500);
		//Calling methods of BA object.
		b.setName(firstname,lastname);
		b.setAccNo(accNo);
		System.out.println("**************************************");
		System.out.println(b.getLastName() +  "," + b.getFirstName());
		System.out.println("Accounut Number: "+ b.getAccNo());
		System.out.println("Current Balance: $"+ b.getBalance());
		
		//Deposit/Withdraw 
		
		System.out.println("Enter deoposit ammount: $");
		b.setDeposit(sc.nextDouble());
		System.out.println("Current Balance: $" + b.getBalance());
		System.out.println("Enter withdrawl amount: $");
		b.setWithdraw(sc.nextDouble());
		System.out.println("Current balance: $" + b.getBalance());
		
		// test loan method
		System.out.println("Giving a $5,000 loan ...");
		b.setloanAmount(5000);
		System.out.println("Loan in total will be: $" + b.getloanTotal());
			

		// test armstrong method
		
		System.out.println("Account Armstrong number : " + b.checkArmstrong());
		sc.close();
	}
}
