package Lab10;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BookStoreTest {

	private BookStore store;
	private Book b1 = new Book(1, "Harper Lee", "To Kill a Mockingbird");
	private Book b2 = new Book(2, "Harper Lee", "To Kill a Mockingbird");
	private Book b3 = new Book(3, "Frances Hodgson", "The Secret Garden");
	private Book b4 = new Book(5, "J.K. Rowling",
			"Harry Potter and the Sorcerer's Stone");
	private Book b5 = new Book(4, "Douglas Adams",
			"The Hitchhiker's Guide to the Galaxy");

	/**
	 * setup the store
	 * 
	 */
	@Before
	public void setUpBookStore() { 
		store = new BookStore();
		store.addBook(b1);
		store.addBook(b2);
		store.addBook(b3);
		store.addBook(b4);
	}

	/**
	 * tests the addition of book
	 * 
	 */

	@Test
	public void testAddBook() {
		store.addBook(b5);
		assertTrue(store.getBooks().contains(b5));
	}
	
	/**
	 * tests the deletion of book
	 * 
	 */

	@Test
	public void testDeleteBook() {
		store.deleteBook(b5);
		assertFalse(store.getBooks().contains(b5));
	}

	/**
	 * tests sorting of books by author name
	 * 
	 */

	@Test
	public void testGetBooksSortedByAuthor() {
		ArrayList<Book> sortAuthor = new ArrayList<Book>();
		store.getBooksSortedByAuthor();
		//System.out.println(store.getBooksSortedByAuthor());
		sortAuthor.add(b3);
		
		sortAuthor.add(b1);
		sortAuthor.add(b2);
		
		sortAuthor.add(b4);
		
		List<Book> a = store.getBooksSortedByAuthor();
		assertEquals(sortAuthor, a);
	} 

	/**
	 * tests sorting of books by title
	 * 
	 */

	@Test
	public void testGetBooksSortedByTitle() {
		ArrayList<Book> sortTitle = new ArrayList<Book>();
		store.getBooksSortedByTitle();
		//System.out.println(store.getBooksSortedByTitle());
		sortTitle.add(b4);
		
		sortTitle.add(b3); 
		sortTitle.add(b1);
		
		sortTitle.add(b2);
		
		List<Book> t = store.getBooksSortedByTitle();
		assertEquals(sortTitle, t); 
	}

	/**
	 * tests the number of copies of book in store
	 *  
	 */

	@Test
	public void testCountBookWithTitle() {
		String input = "To Kill a Mockingbird";
		int expected = 2;
		
		int actual = store.countBookWithTitle(input);

		assertEquals(expected, actual);
	}
}
