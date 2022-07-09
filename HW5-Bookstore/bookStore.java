package HW5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class bookStore extends JFrame implements ActionListener {

    // ArrayList<books> BooksArrayList = new ArrayList<books>();
    // ArrayList<customers> CustomerArrayList = new ArrayList<customers>();
    // ArrayList<rented> RentedArrayList = new ArrayList<rented>();
    static JFrame mainFrame = new JFrame();
    JPanel mainPanel = new JPanel();
    


    public static void main(String[] args) {
    	bookStore gui = new bookStore();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                gui.createAndShowGUI();
            }
        });
    }
    public bookStore() {

    }

    public void createAndShowGUI() {
        createAndAddMenuBar();
        createAndAddLabel();
        createAndAddButton();
        mainFrame.setSize(1200, 600);
        mainPanel.setSize(600,600);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        mainPanel.setLayout(new GridLayout(0,1));
        mainPanel.setBackground(Color.GRAY);
        mainFrame.add(mainPanel,BorderLayout.CENTER);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Welcome to the Book Store+");

        //mainFrame.pack();
        mainFrame.setVisible(true);
        mainPanel.setVisible(true);
    }

    public void createAndAddMenuBar() {
        JMenuBar BSMenuBar = new JMenuBar();
        BSMenuBar.setOpaque(true);
        BSMenuBar.setBackground(new Color(154, 165, 127));
        BSMenuBar.setPreferredSize(new Dimension(200, 20));
        mainFrame.setJMenuBar(BSMenuBar);
    }

    public void createAndAddLabel() {
        JLabel BSLabel = new JLabel("Please Select one of the Following Options:");
        BSLabel.setOpaque(false);
        //BSLabel.setPreferredSize(new Dimension (5,5));
        mainPanel.add(BSLabel);
        BSLabel.setHorizontalAlignment(JLabel.CENTER);

    }

    public void createAndAddButton() {
        //6 Buttons
        JButton button1 = new JButton("Display List of all Books");
        button1.setActionCommand("button_action_1");
        button1.addActionListener(this::actionPerformed);
        mainPanel.add(button1);

        JButton button2 = new JButton("Display Rented Books");
        button2.setActionCommand("button_action_2");
        button2.addActionListener(this::actionPerformed);
        mainPanel.add(button2);

        JButton button3 = new JButton("Display Customer Data");
        button3.setActionCommand("button_action_3");
        button3.addActionListener(this::actionPerformed);
        mainPanel.add(button3);
        
        JButton button4 = new JButton("Search Books");
        button4.setActionCommand("button_action_4");
        button4.addActionListener(this::actionPerformed);
        mainPanel.add(button4);
        
        JButton button5 = new JButton("Search Customer");
        button5.setActionCommand("button_action_5");
        button5.addActionListener(this::actionPerformed);
        mainPanel.add(button5);

    }

    public void actionPerformed(ActionEvent e) {
    	
            if("button_action_1".contentEquals(e.getActionCommand())) {
                JOptionPane.showMessageDialog(null, "Inventory of Books:");
                //Show another GUI that has contet of BooksInventory.txt
                books.showBooksInventory();
            }
            else if  ("button_action_2".contentEquals(e.getActionCommand())) {
                    JOptionPane.showMessageDialog(null, "Showing Rented Books: ");
                    rented.showRent();
                }
            else if("button_action_3".contentEquals(e.getActionCommand())) {
                        JOptionPane.showMessageDialog(null, "Showing data of Customers:");
                        customers.showCustomers();
                    }
            else if("button_action_4".contentEquals(e.getActionCommand())) {
                JOptionPane.showMessageDialog(null, "Search for Books:");
                books.searchBooks();
            }
            else if("button_action_5".contentEquals(e.getActionCommand())) {
                JOptionPane.showMessageDialog(null, "Search for Customer:");
                customers.searchCustomer();
            }
    }

}