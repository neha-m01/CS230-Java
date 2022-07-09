package HW3;

public class Administrator extends Employee{

			
		// define the attributes
			private String Department;
			
			//Define the Constructor
				public Administrator(String n, int bId, String d) 
				{
					super (n,bId);
					this.Department = d;
				}
			
			// getting Department
			    public String get_Department()
			    {
			    	return this.Department;
			    }
			    	
			// display() method to display the Admin data 
			    public String toString() 
			    {
			    	return super.toString() + (" Department: " + Department);
			    }
}

