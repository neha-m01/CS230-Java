package HW4;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Lab10.Book;

public class FlashCardJ_UnitTest {


		private FlashCard myFlashCard = new FlashCard("UAB","University of Alabama at Birmingham");
		private FlashCardTester myFlashCardTester = new FlashCardTester();
		private Box testBox2 = new Box("UAB", "University of Alabama at Birmingham");
		
		
		/**
		 * tests FlashCard setTerm()
		 */
		@Test
		public void test_setTerm() {
			String input = "UAB";
			myFlashCard.setTerm(input);
			String actual = myFlashCard.getTerm();
			assertTrue(input.equalsIgnoreCase(actual));
		}

		/**
		 * tests setDefinition
		 * 
		 */ 
		@Test
		public void test_setDefinition() {

			String input = "University of Alabama at Birmingham"; 
			myFlashCard.setDefinition(input);
			String actual = myFlashCard.getDefinition();

			assertTrue(input.equalsIgnoreCase(actual));

		}
		@Test
		public void testFlashCardBox() {
			String moveTerm = "UAB";
			String moveDefinition = "University of Alabama at Birmingham";
			ArrayList<Box> testBox1 = new ArrayList<Box>();
			//System.out.println(store.getBooksSortedByAuthor());
			testBox1.add(new Box(moveTerm, moveDefinition));
			assertEquals(testBox1.toString(), testBox2.toString());
		}   

	}
