package Lab11;

public class Tester {

	public static void main(String[] args) {
		SoccerPlayer player1 = new CristianoRonaldo();
		SoccerPlayer player2 = new LionelMessi();
		SoccerPlayer player3 = new OlivierGiroud();
		
		System.out.println("*****Cristiano Ronaldo*****");
		player1.paymentForGame(54);
		player1.country();
		player1.age();
		player1.netWorth();
		player1.titlesWon();
		
		System.out.println("");
		
		System.out.println("*****Lionel Messi*****");
		player2.paymentForGame(69);
		player2.country();
		player2.age();
		player2.netWorth();
		player2.titlesWon();
		
		System.out.println("");
		
		System.out.println("*****Olivier Giroud*****");
		player3.paymentForGame(27);
		player3.country();
		player3.age();
		player3.netWorth();
		player3.titlesWon();

	}

}
