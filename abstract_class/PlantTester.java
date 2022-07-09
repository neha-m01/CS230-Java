package abstract_class;

public class PlantTester {

	public static void main(String[] args) {
		//fern object
		String fname = "Fern";
		Fern f = new Fern(fname);
		f.leafPattern();
		f.scientificName();
		f.kingdom();
		System.out.println("");
		
		//poison ivy object
		String pname = "Poison Ivy";
		PoisonIvy p = new PoisonIvy(pname);
		p.leafPattern();
		p.scientificName();
		p.kingdom();
		System.out.println("");

	}

}
