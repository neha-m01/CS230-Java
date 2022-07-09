package HW3;

public class Nurse extends Employee{

		
		// define the attributes
			private String NumberOfPatients;
		
		//Define the Constructor

			public Nurse(String n, int bId, String Np)
			{
				super (n,bId);
				this.NumberOfPatients = Np;
			}

		
		// getting Number of Patients
		    public String get_NumberOfPatients()
		    {
		    	return this.NumberOfPatients;
		    }
		    	
		// display() method to display the Nurse data 
		    public String toString() 
		    {
		    	return super.toString() + (" Number of Patients: " + NumberOfPatients);
		    }
	}
