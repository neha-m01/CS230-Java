package HW3;

public class Surgeon extends Doctor {
		
		// define the attributes
			private String BrainOperating ;
		
		//Define the Constructor

			public Surgeon(String n, int bId, String s, String bo)
			{
				super (n,bId, s);
				this.BrainOperating = bo;
			}

		// getting BrainOperating
		    public String get_BrainOperating()
		    {
		    	return this.BrainOperating;
		    }
		    	
		// display() method to display the Surgeon data 
		    public String toString() 
			{
		    	return super.toString() + (" Operating: " + BrainOperating);
			}
	}

