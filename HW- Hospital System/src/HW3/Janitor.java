package HW3;

public class Janitor extends Administrator{

					
		// define the attributes
			private String Sweeping;
					
		//Define the Constructor
			public Janitor(String n, int bId, String d, String s) 
			{
				super (n,bId, d);
				this.Sweeping = s;
			}
					
		// getting Answering
			public String get_Answering()
			{
				return this.Sweeping;
			}
					    	
		// display() method to display the Janitor data 
			public String toString() 
			{
				return super.toString() + (" Sweeping: " + Sweeping);
			 }
}
