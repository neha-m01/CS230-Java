package abstract_class;

public class PoisonIvy extends Plant{
	private String name;
	
	//constructor
	public PoisonIvy(String n) {
		this.name = n;
	}
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	@Override
	public void leafPattern() {
		System.out.println("Poison Ivys have compound leaves which have three leaflets in each.");
		
	}
	@Override
	public void scientificName() {
		System.out.println("The scientific name is Toxicodendron radicans.");
		
	}

}
