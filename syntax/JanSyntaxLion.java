package syntax;

public class JanSyntaxLion {
	private String name;
	private int age;
	
	public JanSyntaxLion(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String n) {
		this.name = n;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	
	
	
	public String toString() {
		String output = this.getName() + "is" + this.getAge() + "years old.";
		return output;
	}
	
	public int AgeCalc() {
		int ageDoubled = this.getAge() * 2;
		return ageDoubled;
	}
}
