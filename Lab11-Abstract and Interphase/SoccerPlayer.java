package Lab11;

import java.text.NumberFormat;

//Abstract Class
public abstract class SoccerPlayer {
 //Concrete Method
	public void paymentForGame(int games) {
	    String totalg = NumberFormat.getIntegerInstance().format(games*500000);
		System.out.println("will make $" +totalg + " this year");
	}
//Abstract Methods
	public abstract void country();
	
	public abstract void age();
	
	public abstract void netWorth();
	
	public abstract void titlesWon();
	
}
