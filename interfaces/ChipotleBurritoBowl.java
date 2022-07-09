package interfaces;

public class ChipotleBurritoBowl extends DailyValues implements Nutrition{
	//https://www.chipotle.com/nutrition-calculator
	
	private String name;
	int calorieCount, fat, carbs, protein = 0;
	
	public ChipotleBurritoBowl(String n){
		this.name = n;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	public void addRice() {
		calorieCount += 210;
		fat += 4;
		carbs += 40;
		protein += 4;			
	}
	public void addChicken() {
		calorieCount += 180;
		fat += 7;
		carbs += 0;
		protein += 42;
	}
	public void addBeans() {
		calorieCount += 130;
		fat += 1.5;
		carbs += 22;
		protein += 8;
	}
	public void addFajitaVeggies() {
		calorieCount += 20;
		fat += 0;
		carbs += 5;
		protein += 1;
	}
	public void addCorn() {
		calorieCount += 80;
		fat += 1.5;
		carbs += 16;
		protein += 3;
	}
	public void addSalsa() {
		calorieCount += 30;
		fat += 0;
		carbs += 4;
		protein += 1;
	}
	
	@Override
	public void nutrition() {
		System.out.println("Total Calories: " + calorieCount + "kcal\nFats: " + fat + "g\nCarbohydrates: " + carbs + "g\nProtein: " + protein + "g");
	}

	@Override
	public void calories() {
		totalCalories -= calorieCount;
		System.out.println("You have " + totalCalories + " calories left to eat today.");	
	}

}
