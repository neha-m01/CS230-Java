package HW3;


// Java program to demonstrate initializing 
	// an array of objects using a method 
public class Doctor extends Employee {
	
		// define the attributes
			private String Specialty;
	
		//Define the Constructor

			public Doctor(String n, int bId, String s) 
			{
				super (n,bId);
				this.Specialty = s;
			}

	
		// getting Specialty
	    	public String get_Specialty()
	    	{
	    		return this.Specialty;
	    	}
	    	
	   // display() method to display the Doctor data 
		    public String toString() 
		    {
		    	return super.toString() + (" Specialty: " + Specialty);
		    }
}