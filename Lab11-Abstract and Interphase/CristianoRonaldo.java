package Lab11;

import java.text.NumberFormat;

import Lab11Example.Interface;

public class CristianoRonaldo extends SoccerPlayer implements SoccerPlayer2{

	@Override
	public void country() {
		System.out.println("Plays for Portugal");
	}
	
	@Override
	public void age() {
		System.out.println("Is 36 years old");
	};
	
	@Override
	public void netWorth() {
		System.out.println("Net Worth of $500 million");
	}
	
	@Override
	public void titlesWon() {
		System.out.println("Has won 20 titles");
	}
	
	@Override
	public void paymentForGame(int games) {
		String totalg = NumberFormat.getIntegerInstance().format(games*500000);
		System.out.println("Cristiano Ronaldo will make $" + totalg + " this year");
	}
}
