package interfaces;

public abstract class DailyValues {
	//abstract classes obtain partial abstraction, only need one abstract class
	//inherited by other classes, does not support multiple inheritance
	//can provide code that can be overridden
	//can implement interfaces
	
	int totalCalories = 2000;
	public abstract void calories();
	
	public void dailyCalories() {
		System.out.println("An average of 2000 calories should be consunmed each day.");
		
	}
	
	
}
