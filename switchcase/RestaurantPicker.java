package switchcase;

import java.util.Scanner;

public class RestaurantPicker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("*** Restaurents ***\nC: Chick-fil-A\nP: Panera Bread\nS: Starbucks\nT: Taco Bell\n*** Enter the letter of where you would like to eat: ***");
		String n = input.next();
		switch(n) {
		case "C":
			System.out.println("You got a 12 count nugget with Chick-fil-A sauce and a milkshake.");
			break;
		case "P":
			System.out.println("You got a bowl of Creamy Tomato Soup and a Blueberry Scone.");
			break;
		case "S":
			System.out.println("You got a grande Vanilla Sweet Cream Cold Brew and a Double Chocolate Chunk Brownie.");
			break;
		case "T":
			System.out.println("You got a Crunchwrap Supreme, 12 Cinnabon Delights, and a Baja Blast.");
			break;
		default:
			System.out.println("No restauraunt chosen, you can eat at home.");
		}
		System.out.println("Have a nice meal!");
	}

}
