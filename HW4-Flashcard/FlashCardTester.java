package HW4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FlashCardTester {

// Assuming all boxes are empty at begin of program execution
	//Yes? How can we select a random box as there will be no card. 
	//First box will have 5 cards. Rest of box will have no flashcard. If you know answer then will move to next box. 
	//Pick random box and display based on the 2^1 and 2^2 flashcard. creat Array list
	//NO? So do we need to have each box with a term and definition.
	public static void main(String[] args) {
		int initialUI;
		boolean loop = true;
		
		
		ArrayList<Box> Box1ArrayList = new ArrayList<Box>();
		ArrayList<Box> Box2ArrayList = new ArrayList<Box>();
		ArrayList<Box> Box3ArrayList = new ArrayList<Box>();
		ArrayList<Box> Box4ArrayList = new ArrayList<Box>();
		ArrayList<Box> Box5ArrayList = new ArrayList<Box>();
		
		
		Scanner scan = new Scanner(System.in);
		/*
		 * This while loop asks you to choose a program 
		 * after you choose you will need to insert term and definition
		 */
		while (loop){
			
			System.out.println("\nSelect One of the Following:\n 1: Create New Card "
								+ "\n 2: Pick a Random Card \n 3: Exit");
			System.out.println("Enter your choice: ");
			initialUI = scan.nextInt();
			
			switch (initialUI){
			/* Case for Create New Card*/
			case 1:
				Scanner TermInput = new Scanner(System.in);
				Scanner DefininitionInput = new Scanner(System.in);	
				System.out.println("Enter Term: " + "\r\n");
				String Term = TermInput.nextLine();
				System.out.println("Term: "+ Term);
				System.out.println("Enter Definition: ");
				String Definition = DefininitionInput.nextLine();
				Box1ArrayList.add(new Box(Term,Definition));
				System.out.println("The Term and Definition have been added! ");
				break;

			case 2: 
				Random randomGenerator = new Random();
				double boxNum = randomGenerator.nextDouble();
				int boxCount = 0;
				int boxNumber = 0;
				int CardNum = 0;
				String moveTerm = "";
				String moveDefinition = "";
				int BoxSize = 0;
				ArrayList<Box> BoxCurrentArrayList = new ArrayList<Box>();
				ArrayList<Box> BoxNextArrayList = new ArrayList<Box>();
				ArrayList<Box> BoxPreviousArrayList = new ArrayList<Box>();
					if (boxNum <= 0.0625 && Box5ArrayList.size() != 0){
						BoxCurrentArrayList = Box5ArrayList;
						BoxNextArrayList = Box1ArrayList;
						boxNumber = 5;
					}
					else if (boxNum <= 0.125 && Box4ArrayList.size() !=0) {
						BoxCurrentArrayList = Box4ArrayList;
						BoxNextArrayList = Box5ArrayList;
						boxNumber = 4;
					}
					else if (boxNum <= 0.25 && Box3ArrayList.size() != 0) {
						BoxCurrentArrayList = Box3ArrayList;
						BoxNextArrayList = Box4ArrayList;
						boxNumber = 3;
					}
					else if (boxNum <= 0.5 && Box2ArrayList.size() != 0) {
						BoxCurrentArrayList = Box2ArrayList;
						BoxNextArrayList = Box3ArrayList;
						boxNumber = 2;
					}
					else if (Box1ArrayList.size() != 0) {
						BoxCurrentArrayList = Box1ArrayList;
						BoxNextArrayList = Box2ArrayList;
						boxNumber = 1;
					}
					
				
				boxCount = BoxCurrentArrayList.size();
				CardNum = randomGenerator.nextInt(boxCount);
				moveTerm = BoxCurrentArrayList.get(CardNum).get_term();
				moveDefinition = BoxCurrentArrayList.get(CardNum).get_definition();
				BoxSize = BoxCurrentArrayList.size();
				
				char Choice = ' ';
				int Side = 2;
				do {
					FlashCard.displayChoices();
					Choice = FlashCard.getChoice();
					switch (Choice) {

					// Case for Flip Card
					case 'A':
						System.out.println("Flip the Card");
						if (Side == 2) {
							// Display Definition of Selected Rand Card
							Side = randomGenerator.nextInt(2);
							if (Side == 0) {
								System.out.println("Term: " + BoxCurrentArrayList.get(CardNum).get_term());
							} else {
								System.out.println("Definition: " + BoxCurrentArrayList.get(CardNum).get_definition());
							}
						} else if (Side == 0) {
								System.out.println("Definition: " + BoxCurrentArrayList.get(CardNum).get_definition());
								Side = 1;
						} else { System.out.println("Term: " + BoxCurrentArrayList.get(CardNum).get_term());
								Side = 0;
						
						}

						break;
						 
						// Case for do know answer
					case 'B':
						System.out.println("Congratulations! You know the answer"); // Don't Need line
						//Moving card into higher Box (box+1)
						BoxNextArrayList.add(new Box(moveTerm, moveDefinition));
						BoxCurrentArrayList.remove(CardNum);
						//For User reference 
						System.out.println("The card has been moved to Box " + boxNumber + 1);
						break;
						
						// Case for do NOT know answer
					case 'C':
						System.out.println("You do NOT know the answer"); // Don't Need line
						//Moving card into Box 1
						Box1ArrayList.add(new Box(moveTerm, moveDefinition));
						BoxCurrentArrayList.remove(CardNum);
						//For User reference 
						System.out.println("The card has been moved to Box 1");
						break;
					case 'D':
						FlashCard.exit();
					}

				}
				while (Choice == 'A');
			break;
				
			case 3: 
				FlashCard.exit();
				break;
			
			/* Case for user mistake*/
			default:
				System.out.println("Please select the correct option");
			}
			
		} scan.close();
	}


}
