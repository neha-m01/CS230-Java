package HW3;

public class Receptionist extends Administrator{

		// define the attributes
			private String Answering;
				
		//Define the Constructor

			public Receptionist(String n, int bId, String d, String a)
			{
				super (n,bId, d);
				this.Answering = a;
			}
				
		// getting Answering
			public String get_Answering()
			{
				return this.Answering;
			}
				    	
		// display() method to display the Receptionist data 
			public String toString() 
			{
				return super.toString() + (" Answering: " + Answering);
			}
}

