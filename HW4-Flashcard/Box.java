package HW4;


public class Box {

    // instance variables
	private String term;
	private String definition;
	
	  
// Method to set the data 
	public Box (String t, String d)
	{
		this.term = t;
		this.definition = d;
	}
	
// getting the term
	public String get_term()
	{
		return this.term;
	} 
	
// getting the definition
	public String get_definition()
	{
		return this.definition;
	}

// display() method to display the Box data
    public String toString() 
    { 
        return("Term: " + term + " "
                           + "Definition: "
                           + definition);
    } 

}
	

	