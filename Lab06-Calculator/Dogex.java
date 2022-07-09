package Lab06;

public class Dogex {
	private String name = "";
	private int age = 0;
	
	//good for constants
	public static final float PI = 3.141592F;
	/*
	 * block
	 */

	/**
	 * 
	 * describe what method does
	 * @param_name takes a string to represent Dog's name
	 * @return doesnt return anything because it is a Constructor
	 */
	
	public Dogex(String _name) {
		this.name = _name;
	}
	//getters/setters
	public String getName() {
		return this.name;
	}
	public String toString() {
		return "My name is: " + this.getName() + " age: " + age;
	}
	public void setAge(int _age) throws Exception {
		if(_age < 0) {
			throw new Exception ("Dog's age can't be less than 0");
		} else {
			this.age = _age;
		}
	}
}
