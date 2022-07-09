package polymorphism;

public class PolymorphTester {

	public static void main(String[] args) {
		int age = 72;
		Parent parent = new Parent(age);
		Child child = new Child(age);
		Grandchild grandchild = new Grandchild(age);
		
		System.out.println("The parent is " + parent.ageCalc() + " years old.");
		System.out.println("The child is " + child.ageCalc() + " years old.");
		System.out.println("The grandchild is " + grandchild.ageCalc() + " years old.");
	}

}
