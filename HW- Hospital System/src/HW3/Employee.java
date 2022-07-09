package HW3;

public class Employee {

    // instance variables
    	private String Name;
    	private int BlazerId;
    	
  	  
   // Method to set the data to student objects 
    	public Employee (String n, int bId)
    	{
    		this.Name =n;
    		this.BlazerId = bId;
    	}
    	
    // getting the Name
    	public String get_Name()
    	{
    		return this.Name;
    	}
    	
    // getting the BlazerID
    	public int get_BlazerId()
    	{
    		return this.BlazerId;
    	}
 
    // display() method to display the Employee data 
	    public String toString() 
	    { 
	        return("Name: " + Name + " "
	                           + "BlazerId: "
	                           + BlazerId);
	    } 
}

