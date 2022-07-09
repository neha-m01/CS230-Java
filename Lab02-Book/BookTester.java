package Lab02;

public class BookTester {
	public static void main(String[] args) {

	  Book book1 = new Book("Book One", 450, true);
	  Book book2 = new Book("Book Two", 50, true);

	  System.out.println("Testing reverse method: " + book1.reverseName());
	  System.out.println("Testing toString method: " + book1.toString());
	  System.out.println("Testing toString method: " + book2.toString());

	}
}
