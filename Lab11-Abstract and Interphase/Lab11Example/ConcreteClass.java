package Lab11Example;

public class ConcreteClass extends AbstractClass implements Interface, Interface2  {

	public ConcreteClass() {
		System.out.println("In concrete constructor");
	}
	public  void abstractMethod() {
		System.out.println("Implemented abstract method");
	}
	
	public void methodInInterface() {
		System.out.println("Implemented Interface Method" + pi);
	}
	
}
