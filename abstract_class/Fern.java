package abstract_class;

public class Fern extends Plant{
	private String name;
	
	//constructor
	public Fern(String n) {
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
		System.out.println("Ferns have leaves called fronds, which has a central stalk and many leaf blades which stem from it.");
		
	}
	@Override
	public void scientificName() {
		System.out.println("The scientific name of the phylum is Tracheophyta.");
		
	}

}
