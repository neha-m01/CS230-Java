package Lab06;

public class LabDogex extends Dogex {
	
	//Is-A ___ (parent)
	//test for inheritance
	//Lab Is-A Dog
	
	public LabDogex(String _name2) {
		 super(_name2);
	}
	
	public String toString() {
		return super.toString() + " and I'm a lab";
	}

}
