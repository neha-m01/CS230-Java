package Lab06;

import java.util.Scanner;


public class CalculatorTester {

	public static void main(String[] args)
	{		

		// ask user to enter two numbers
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = scan.nextInt();

		System.out.println("Enter Second Number: ");
		int b = scan.nextInt();
		
		// create your object
		Calculator c1 = new Calculator(a,b);
		ScientificCalculator sc = new ScientificCalculator(a, b);
			

		// invoke the methods and print the results
		System.out.println("Using Calculator:");
		System.out.println("The Sum of the Numbers are: " + c1.add());
		System.out.println("The Difference of the Numbers are: " + c1.subtract());
		System.out.println("The Product of the Numbers are: " + c1.multiply());
		System.out.println("The Division of the Numbers are: " + c1.divide());
		
		System.out.println("---------------------------------------");
		System.out.println("Using Scientific Calculator:");
		
		//Call SciCalc Object
		System.out.println("The First Number raised to Second Number (Exponent) : " + sc.Exponent());
		System.out.println("The Square Root of First Number is: " + sc.SquareRoot());
		

	}

}
