package HW5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class rented {

//instance variables
	private String lastName;
	
//Accessor/Mutator Methods
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
//Method to display Rented
	public String toString() {
		return "rented [lastName=" + lastName + "]";
	}
	 //button2
    public static void showRent() {
        //Open File Object
        // Creating JFrame
        JFrame bookListFrame2 = new JFrame();
        //Set JFrame size
        bookListFrame2.setSize(400, 400);
        bookListFrame2.setTitle("Showing rented books:");
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
        File file = new File("booksRented.txt");  //chooseFile.getSelectedFile();
        try {
            // Reading data from file object and set data from file to textarea
            textarea.read(new InputStreamReader(new FileInputStream(file)), "Reading Data from File");
            } catch (Exception e) {
            e.printStackTrace();
        }
// Adding textarea for file data to jframe with scrollpane
        bookListFrame2.add(new JScrollPane(textarea), BorderLayout.CENTER);
        bookListFrame2.pack();
        // Set jframe visible
        bookListFrame2.setVisible(true);

    }
}
