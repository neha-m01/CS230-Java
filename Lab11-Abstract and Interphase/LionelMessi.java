package Lab11;

import java.text.NumberFormat;

public class LionelMessi extends SoccerPlayer implements SoccerPlayer2{ 
	
		@Override
		public void country() {
			System.out.println("Plays for Argentina");
		}
		
		@Override
		public void age() {
			System.out.println("Is 33 years old");
		};
		
		@Override
		public void netWorth() {
			System.out.println("Net Worth of $600 million");
		}
		
		@Override
		public void titlesWon() {
			System.out.println("Has won 24 titles");
		}
		
		@Override
		public void paymentForGame(int games) {
			String totalg = NumberFormat.getIntegerInstance().format(games*500000);
			System.out.println("Lionel Messi will make $" + totalg + " this year");
		}
	}
