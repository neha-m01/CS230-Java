package multiple_inheritance;

public class Child implements Mom, Dad{
	//multiple inheritance through implementing numerous interfaces

	private String name;
	//constructor
	public Child(String n) {
		this.name = n;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	@Override
	public void hairColor() {
		System.out.println(getName() + " has black hair from their dad.");
	}

	@Override
	public void eyeColor() {
		System.out.println(getName() + " has brown eyes from their mom.");
		
	}

}
