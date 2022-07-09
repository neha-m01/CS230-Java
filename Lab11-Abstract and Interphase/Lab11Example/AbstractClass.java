package Lab11Example;

public abstract class AbstractClass {
	
	public AbstractClass() {
		System.out.println("In abstract constructor");
	}
	
	public abstract void abstractMethod();
	
	public void concreteMethodInAbstractClass() {
		System.out.println("Concrete in AC");
		
	}
}
	
	
	
//	abstract method:  public void mtyMethod();
//	concrete method:  public void myMethod2() {
//	  // something inside curly braces
//	}
	

