package HW5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class books {

// instance variables
	private String author;
	private String numPages;
	private String publisher;
	private String copiesInventory;
	private String title;
	
//Accessor/Mutator Methods
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getNumPages() {
		return numPages;
	}

	public void setNumPages(String numPages) {
		this.numPages = numPages;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCopiesInventory() {
		return copiesInventory;
	}

	public void setCopiesInventory(String copiesInventory) {
		this.copiesInventory = copiesInventory;
	}

	
//Display data of books
	public String toString() {
		return "books [author=" + author + ", numPages=" + numPages + ", publisher=" + publisher + ", copiesInventory="
				+ copiesInventory + ", title=" + title + "]";


}

 //button 1
	 public static void showBooksInventory() {
	     //Open File Object
	     // Creating JFrame
	     JFrame bookListFrame = new JFrame();
	     //Set JFrame size
	     bookListFrame.setSize(400, 400);
	     bookListFrame.setTitle("Here is the inventory of all books");
	     JMenuBar bookListMenuBar = new JMenuBar();
	     bookListMenuBar.setOpaque(true);
	     bookListMenuBar.setBackground(new Color(154, 165, 127));
	     bookListMenuBar.setPreferredSize(new Dimension(200, 20));
	     bookListFrame.setJMenuBar(bookListMenuBar);
	     // TextArea to display file data
	     JTextArea textarea = new JTextArea(50, 50);
	     // LineWrap enabling for TextArea
	     textarea.setLineWrap(true);
	     // Set ReadOnly TextArea
	     textarea.setEditable(false);
	     File file = new File("bookStore.txt");  //chooseFile.getSelectedFile();
	     try {
	         // Reading data from file object and set data from file to textarea
	         textarea.read(new InputStreamReader(new FileInputStream(file)), "Reading Data from File");
	         } catch (Exception e) {
	         e.printStackTrace();
	     }
	//Adding textarea for file data to jframe 
	     bookListFrame.add(new JScrollPane(textarea), BorderLayout.CENTER);
	     bookListFrame.pack();
	     // Set jframe visible
	     bookListFrame.setVisible(true);

	 }
	//button4
	    public static void searchBooks(){
	        //Open File Object
	        // Creating JFrame

	        String input = JOptionPane.showInputDialog(
	                bookStore.mainFrame, "What's title of the book ?");
	        //System.out.println(input);

	        File file = new File("bookStore.txt"); 
	        try {
	            // scanner object to read data from file
	            Scanner scanner = new Scanner(file);
	            Scanner scanner1 = new Scanner(file);  //title1 author1 pages1
	            // getting file contents in array
	            ArrayList<String> bookList = new ArrayList<String>();
	            int i = 0;
	            while (scanner.hasNextLine()) {  //title1 author1 pages1
	                //bookList.add(inputLines);
	                Scanner wordScanner = new Scanner(scanner.nextLine());  //title2 author2 pages2

	                // loop while words present
	                while (wordScanner.hasNext()) {

	                    String searchWord = wordScanner.next(); //author2
	                    
	                    if(searchWord.toUpperCase().trim().equals(input.toUpperCase().trim())) {
	                        i++;
	                        //System.out.println(searchWord 
	                        bookList.add(scanner1.nextLine() +"\n" );
	                    }
	                    //System.out.println(wordScanner.toString() 
	                }
	                if (i == 0) {
	                    String advanceScanner = scanner1.nextLine();
	                    i = 0;
	                    //System.out.println(advanceScanner
	                }

	            }
	            scanner.close();


	            JFrame searchBookFrame = new JFrame();
	            //Set JFrame size
	            searchBookFrame.setSize(400, 400);
	            searchBookFrame.setTitle("Here are your Search Results");
	            JMenuBar searchBookListMenuBar = new JMenuBar();
	            searchBookListMenuBar.setOpaque(true);
	            searchBookListMenuBar.setBackground(new Color(154, 165, 127));
	            searchBookListMenuBar.setPreferredSize(new Dimension(200, 20));
	            searchBookFrame.setJMenuBar(searchBookListMenuBar);
	            // TextArea to display file data
	            JTextArea searchBookTextArea = new JTextArea(50, 50);
	            // LineWrap enabling for TextArea
	            searchBookTextArea.setLineWrap(true);
	            // Set ReadOnly TextArea
	            searchBookTextArea.setEditable(false);
	            String searchResults = bookList.toString();
	            searchResults = searchResults.replace("[","");
	            searchResults = searchResults.replace("]","");
	            searchResults = searchResults.replace(", ","");
	            searchBookTextArea.setText(searchResults.trim());
	            //System.out.println(searchResults + "Content of Booklist");
	            Font font = new Font("Times New Roman", Font.BOLD, 20);
	            searchBookTextArea.setFont(font);
	            searchBookTextArea.setForeground(Color.BLUE);
	            //// Adding textarea for file data to jframe
	            searchBookFrame.add(new JScrollPane(searchBookTextArea), BorderLayout.CENTER);
	            searchBookFrame.pack();
	            // Set jframe visible
	            searchBookFrame.setVisible(true);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
}