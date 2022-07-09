package polymorphism;

public class Parent {
	private int age;
	
	public Parent (int a) {
		this.age = a;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	
	public int ageCalc() {
		return getAge();
	}
}
