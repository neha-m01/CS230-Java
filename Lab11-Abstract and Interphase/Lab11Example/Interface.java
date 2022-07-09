package Lab11Example;

public interface Interface {
	
	double pi = 3.14;

	public void methodInInterface();
	
	public static void staticMethodInInterface() {
		System.out.println("Static Interface");
	}
	
	public default void defaultMethodInInterface() {
		System.out.println("Default Interface");
		
	}
}
