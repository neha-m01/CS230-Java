package Lab11Example;

public class Tester {

	public static void main(String[] args) {
		//These do the same thing
		ConcreteClass obj = new ConcreteClass();
		//AbstractClass obj1 = new ConcreteClass();
	
		obj.abstractMethod();
		//Parent name = new Child();
		
		obj.methodInInterface();
		obj.defaultMethodInInterface();
		System.out.println(Interface.pi);
	}

}
