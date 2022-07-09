package Lab11;

import java.text.NumberFormat;

public class OlivierGiroud extends LionelMessi implements SoccerPlayer2{ 
		
		@Override
		public void country() {
			System.out.println("Plays for France");
		}
		
		@Override
		public void age() {
			System.out.println("Is 34 years old");
		};
		
		@Override
		public void netWorth() {
			System.out.println("Net Worth of $10 million");
		}
		
		@Override
		public void titlesWon() {
			System.out.println("Has won 13 titles");
		}
		
		@Override
		public void paymentForGame(int games) {
			String totalg = NumberFormat.getIntegerInstance().format(games*500000);
			System.out.println("Oliver Giroud will make $" + totalg + " this year");
			
		}
	}

