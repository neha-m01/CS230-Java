package polymorphism;

public class Grandchild extends Child{

	public Grandchild(int a) {
		super(a);
	}
	
	//runtime polymorphism
	@Override
	public int ageCalc() {
		return getAge() - 50;
	}
}
