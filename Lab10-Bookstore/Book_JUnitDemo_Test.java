package Lab10;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Book_JUnitDemo_Test {
	private Book myBook = new Book(1,"Author1","Title1");
	
	/**
	 * tests Book getTitle()
	 */
	@Test
	public void test_getId() {
		// 1. Identify method under test: 
		
		// 2. set-up the test input
		// input already set in Constructor (1)
	
		// 3. define an expected value
		int expected = 1;
		
		// 4. get the actual value by calling method under test
		int actual = myBook.getId();
		
		// 5. Compare via an assertion
		assertEquals(expected,actual);
			//expected==actual will pass
	}
	
	/**
	 * tests Book setId()
	 */
	@Test
	public void test_setId() {
		// 1. Book setID(0
		// 2. input 
		int input = 5;
		// 3. expected 
		int expected =5;
		// 4. get actual value, call method under test
		// use getter setter
		myBook.setId(input);
		int actual = myBook.getId();
		// 5. assert, compare actual vs expected
		assertEquals(expected, actual);
		//if expected and actual are equal: will pass
	}

	/**
	 * tests book setTitle()
	 * Testing Strings
	 */
	@Test
	public void test_setTitle() {
		// 1. input
		String input = "new Title"; //expected = input
		// 2. Set up expected value... this case is equal to input
		// 3. actual
		myBook.setTitle(input);
		String actual = myBook.getTitle();
		// 4. assert to compare
		assertTrue(input.equalsIgnoreCase(actual));
		// if in parenthesis they are equal it will pass
	}
	
	
	

}
