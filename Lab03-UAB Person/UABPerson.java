package Lab03;

//this is my Instance Variables (always private)
public class UABPerson {
	private String name;
	private String gender;
	private int age;
	private String blazerID;

	/**
	 * This class models a UAB Person
	 * @param name represents a String for the name of the Book
	 * @param gender represents a String for the gender
	 * @param age represents a int for the person's age
	 * @param blazerID represents a String for their UAB ID.
	 */
	
	
	//this is a constructor
	public UABPerson(String name, String gender, int age, String blazerID) {

		this.name = name;
		this.gender = gender;
		this.age = age;
		this.blazerID = blazerID;
}

	// this is my getter/setter methods
	public String getName() {

		return this.name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public String getgender() {

		return this.gender;
	}
	public void setgender(String gender) {

		this.gender = gender;
	}
	public int getage() {

		return this.age;
	}
	public void setage(int age) {

		this.age = age;
	}
	public String getblazerID() {

		return this.blazerID;
	}
	public void setblazerID(String blazerID) {

		this.blazerID = blazerID;
	}

	/**
	 * Check if name is Palindrome using bool
	 * @return String, the reverse of the Book's name
	 */
	
	//this is my First toDo method
	public boolean checkPalindrome() {
		String str = this.name.toLowerCase();
		
		int i = 0, j = str.length() - 1;
		
		while (i<j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		
		return true;
	}

	public int yearsUntilRetirement()  { 

		
		return (65-this.age);
	}
	/**
	 * this overrides the default toString() method
	 * which is called whenever we call print
	 * This allows us to define a custom print statement to represent this Book
	 * @return String to represent the Book, with the Book's name, number of pages, and 
	 * a boolean to indicate whether it is in stock
	 */
	public String toString() {

		String out = "UAB Person's Name: " + this.getName() + ". Gender: " + this.getgender() + ". Age: " + this.getage() + ". BlazerID: " + this.getblazerID();
		return out;
	}

}
