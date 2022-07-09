package inheritance;

public class Tester {

	public static void main(String[] args) {
		Muggle Monica = new Muggle ("Monica");
		Muggle Brian = new Muggle ("Brian");
		
		Wizard Hermione = new Wizard ("Hermione");
		
		//Monica
		System.out.println(Monica.driveCar());
		System.out.println(Monica.cooksFood());
		System.out.println(Monica.getName() + " is a witch: "+ Monica.isMagic() + '\n');
		
		//Brian
		System.out.println(Brian.driveCar());
		System.out.println(Brian.cooksFood());
		System.out.println(Brian.getName() + " is a wizard: " + Brian.isMagic() + '\n');
		//Hermione
		System.out.println(Hermione.driveCar());
		System.out.println(Hermione.cooksFood());
		System.out.println(Hermione.castSpell());
		System.out.println(Hermione.rideBroom());
		System.out.println(Hermione.getName() + " is a witch: " + Hermione.isMagic());
	}

}
