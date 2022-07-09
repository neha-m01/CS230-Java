package HW4;
import java.util.Scanner;

public class FlashCard {
	// instance variables
	private String term;
	private String definition;
	  
	// Constructor for FlashCard Class
	public FlashCard(String term, String definition)
	{
		this.term = term;
		this.definition = definition;
	} 
	
	//Getters and Setters for Term and Definition  
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	//Methods
	public static void exit() {
		System.out.println("Study Session Ended! Have great day!!!");
		System.exit(0);
	}
	
	// Methods
	public static char getChoice() {
		Scanner ChoiceInput = new Scanner(System.in);
		char Choice = ChoiceInput.nextLine().toUpperCase().trim().charAt(0);
		return Choice;
	}

	public static void displayChoices() {
		System.out.println("*********************************************************" 
				+ "\n Please select one of four choices: "
				+ "\n (a) Flip the card, "
				+ "\n (b) You know the answer, "
				+ "\n (c) You do NOT know the answer, "
				+ "\n (d) End the study session.");
	}
}