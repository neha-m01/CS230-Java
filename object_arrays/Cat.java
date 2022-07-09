package object_arrays;

public class Cat {
	private String name;
	private int age;
	private String color;

	
	public Cat(String n, int a, String c) {
		this.name = n;
		this.age = a;
		this.color = c;
	}
	
	//getters and setters
	public String getName()
	{
		return this.name;
	}
	public void setName(String n)
	{
		this.name = n;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int a)
	{
		this.age = a;
	}
	public String getColor()
	{
		return this.color;
	}
	public void setColor(String c)
	{
		this.color = c;
	}


	
	//method
	public String toString() {
		return getName() + " is a " + getAge() + " year old " + getColor() + " cat looking for their forever home!";
	}
}
