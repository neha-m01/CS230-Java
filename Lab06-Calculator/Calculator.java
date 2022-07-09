package Lab06;

public class Calculator {
	
	//Cacl basic operations of two numbers
	//Add,Sub,Mult,Divide
	//two instance variables:  int num1 and int num2
	//create all required methods here (setter/getters/arithmetic operators, etc)
	
	
	
	// instance variables
	private int num1, num2;

// setting the values of two numbers
	/**
	 * This is the Constructor for the Calculator class.
	 * The Calculator class takes two integers. The class
	 *   provides methods to add, subtract, multiply, and divide these two integers.
	 * @param a an int representing the first number
	 * @param b an int representing the second number
	 */
	
	public Calculator(int a, int b)
	{
		this.num1 = a;
		this.num2 = b;
	}
// getting the value of first number
	public int get_first_number()
	{
		return this.num1;
	}
// getting the value of second number
	public int get_second_number()
	{
		return this.num2;
	}
	
// should return the sum of both numbers
	/**
	 * Javadoc comment to describe this method
	 * @return
	 */
	/*public int add(){
		
	}*/
	
	public int add () {
		return this.get_first_number() + this.get_second_number();
	}
	
	public int subtract () {
		return this.get_first_number() - this.get_second_number();
	}
	public int multiply () {
		return this.get_first_number() * this.get_second_number();
	}
	public int divide () {
		return this.get_first_number() / this.get_second_number();
	}


}

