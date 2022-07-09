package interfaces;

public class CBBTester {

	public static void main(String[] args) {
		ChipotleBurritoBowl b = new ChipotleBurritoBowl("bowl");
		
		b.addRice();
		b.addChicken();
		//b.addFajitaVeggies();
		//b.addBeans(); //i don't do this btw beans are gross
		//b.addCorn();
		b.addSalsa();
		
		System.out.println("Your Bowl:\n");
		b.nutrition();
		System.out.println("");
		b.calories();
		b.dailyCalories();

	}

}
