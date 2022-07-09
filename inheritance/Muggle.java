package inheritance;

public class Muggle {
	//instance variables
	private String name = "";
	
	//constructor
	public Muggle(String n) {
		this.name = n;
	}

	//getter and setter methods
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	
	//methods that a muggle can do
	public String driveCar() {
		return getName() + " drives their car.";
		
	}
	public String cooksFood () {
		return getName() + " cooks something to eat.";
	}
	public boolean isMagic() {
		return false;
	}
}
