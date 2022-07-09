package polymorphism;

public class Child extends Parent{

	public Child(int a) {
		super(a);
		
	}
	
	//runtime polymorphism
	@Override
	public int ageCalc() {
		return getAge() - 25;
	}
}
