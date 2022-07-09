package HW5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class customers {

//instance variables
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
//Accessor/Mutator Methods
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//Display customers data
	public String toString() {
		return "customers [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}
	//button3
    public static void showCustomers() {
        //Open File Object
        // Creating JFrame
        JFrame bookListFrame2 = new JFrame();
        //Set JFrame size
        bookListFrame2.setSize(400, 400);
        bookListFrame2.setTitle("Showing Data of Customers");
        JMenuBar bookListMenuBar = new JMenuBar();
        bookListMenuBar.setOpaque(true);
        bookListMenuBar.setBackground(new Color(154, 165, 127));
        bookListMenuBar.setPreferredSize(new Dimension(200, 20));
        bookListFrame2.setJMenuBar(bookListMenuBar);
        // TextArea to display file data
        JTextArea textarea = new JTextArea(50, 50);
        // LineWrap enabling for TextArea
        textarea.setLineWrap(true);
        // Set ReadOnly TextArea
        textarea.setEditable(false);
        File file = new File("customers.txt");  //chooseFile.getSelectedFile();
        try {
            // Reading data from file object and set data from file to textarea
            textarea.read(new InputStreamReader(new FileInputStream(file)), "Reading Data from File");
            } catch (Exception e) {
            e.printStackTrace();
        }
// Adding textarea for file data to jframe 
        bookListFrame2.add(new JScrollPane(textarea), BorderLayout.CENTER);
        bookListFrame2.pack();
        // Set jframe visible
        bookListFrame2.setVisible(true);

    }
  //button5
    public static void searchCustomer(){
        //Open File Object
        // Creating JFrame

        String input = JOptionPane.showInputDialog(
                bookStore.mainFrame, "Which customer would you like to search for?");
        //System.out.println(input);

        File file = new File("customers.txt"); 
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
                        //System.out.println(searchWord + 
                        bookList.add(scanner1.nextLine());
                    }
                    //System.out.println(wordScanner.toString() 
                }
                if (i == 0) {
                    String advanceScanner = scanner1.nextLine();
                    i = 0;
                    System.out.println(advanceScanner + " This is the advanceScanner line");
                }

            }
            scanner.close();


            JFrame searchCustomerFrame = new JFrame();
            //Set JFrame size
            searchCustomerFrame.setSize(400, 400);
            searchCustomerFrame.setTitle("Here are your Customer Results");
            JMenuBar searchBookListMenuBar = new JMenuBar();
            searchBookListMenuBar.setOpaque(true);
            searchBookListMenuBar.setBackground(new Color(154, 165, 127));
            searchBookListMenuBar.setPreferredSize(new Dimension(200, 20));
            searchCustomerFrame.setJMenuBar(searchBookListMenuBar);
            // TextArea to display file data
            JTextArea searchBookTextArea = new JTextArea(50, 50);
            // LineWrap enabling for TextArea
            searchBookTextArea.setLineWrap(true);
            // Set ReadOnly TextArea
            searchBookTextArea.setEditable(false);
            String searchResults = bookList.toString();
            searchResults = searchResults.replace("[","");
            searchResults = searchResults.replace("]","");
            searchBookTextArea.setText(searchResults.trim());
            //System.out.println(searchResults + "Content of Booklist");
            Font font = new Font("Times New Roman", Font.BOLD, 20);
            searchBookTextArea.setFont(font);
            searchBookTextArea.setForeground(Color.BLUE);
//// Adding textarea for file data to jframe
            searchCustomerFrame.add(new JScrollPane(searchBookTextArea), BorderLayout.CENTER);
            searchCustomerFrame.pack();
//        // Set jframe visible
            searchCustomerFrame.setVisible(true);

            // Set longest word to textarea2
            //textarea2.setText(longWord);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
