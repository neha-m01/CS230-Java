package abstract_class;

public abstract class Plant {
	//abstract method
	public abstract void leafPattern();
	
	//abstract method
	public abstract void scientificName();
		
	//concrete method
	public void kingdom() {
		System.out.println("All plants are in Kingdom Plantae.");
	}
}
