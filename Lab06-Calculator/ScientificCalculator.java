package Lab06;

// define the ScientificCalculator class here, implement inheritance
public class ScientificCalculator extends Calculator {
	// define the attributes


//must be child class to calculator
	//define two more methods (sq. root and exponent)
	//Sq. Root to return sq root of first num
	//exponent to raise first number to power of second number
	
	
//Define the Constructor

		public ScientificCalculator(int c, int d) {
			super (c, d);

		}


// Add two methods that calculate the exponent of x^y and square root of x and y

	public int Exponent () 
	{
		return (int) (Math.pow(this.get_first_number(), this.get_second_number()));
	}
	
	public double SquareRoot () 
	{
	return (double) Math.sqrt(this.get_first_number());
	}


}
