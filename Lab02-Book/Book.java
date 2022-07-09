package Lab02;

public class Book {
	private String name;
	private int page;
	private boolean stock;

	/**
	 * This class creates Books
	 * @param name represents a String for the name of the Book
	 * @param page represents an int for the number of pages in the Book
	 * @param stock represents a boolean to indicate whether or not the Book is in stock (true) 
	 */
	public Book(String name, int page, boolean stock) {

		this.name = name;
		this.page = page;
		this.stock = stock;
}


	public String getName() {

		return this.name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public int getPageNumber() {

		return this.page;
	}
	public void setPageNumber(int num) {

		this.page = num;
	}
	public boolean getStock() {

		return this.stock;
	}
	public void setStock(boolean stock) {

		this.stock = stock;
	}

	/**
	 * Reverses the name of the book
	 * @return String, the reverse of the Book's name
	 */
	public String reverseName() {

		String name = this.getName();
		int index = name.length() - 1;
		String result = " ";

		for (int i = index; i > -1; i -- ) {
			result = result + name.charAt(i);
		}

		return result;
	}

	/**
	 * this overrides the default toString() method
	 * which is called whenever we call print
	 * This allows us to define a custom print statement to represent this Book
	 * @return String to represent the Book, with the Book's name, number of pages, and 
	 * a boolean to indicate whether it is in stock
	 */
	public String toString() {

		String out = "Book name: " + this.getName() + ". Page number: " + this.getPageNumber() + ". In Stock: " + this.getStock();
		return out;
	}
}
