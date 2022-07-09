package Lab12;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


import java.awt.*; 

public class calculator implements ActionListener{
	
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JButton button4;
	private static JButton button5;
	private static JButton button6;
	private static JButton button7;
	private static JButton button8;
	private static JButton button9;
	private static JButton button0;
	
	private static JButton plus;
	private static JButton minus;
	private static JButton divide;
	private static JButton multiply;
	private static JButton clear;	
	private static JButton dot;
	private static JButton equals;
	private static JTextField result;
	private static JTextField text1;
	private static JTextField text2;
	private int calculated;

	
    public static void main(String[] args){
    	
        // create frame 
        JFrame frame = new JFrame("Simple Calculator");

        // set close operation to when user clicks exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the look and feel to the computer
        try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } 
        
        JPanel panel = createMainPanel();
        frame.add(panel);
        // add panel to frame
        frame.setSize(300,400); 
        frame.setVisible(true);
        
        //result box
        JTextField result = new JTextField(10);        
        result.setEditable(false);
        
        
       EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               new calculator();
            }
          });    
       }    


    /**
     * Adds components to the main panel.
     * 
     * @param none
     */
    public static JPanel createMainPanel() {
        // panels to hold contents
        JPanel panel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridLayout(3,3,4,4));
        panel.setBorder(new EmptyBorder(4,4,4,4));

        // set layout for the panel - here we use the BoxLayout manager
        BoxLayout layout = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(layout);


            
      //buttons
        	calculator calculator = new calculator();
        	
            //Creating Buttons
            button1 = new JButton("1");
            button2 = new JButton("2");
            button3 = new JButton("3");
            button4 = new JButton("4");
            button5 = new JButton("5");
            button6 = new JButton("6");
            button7 = new JButton("7");
            button8 = new JButton("8");
            button9 = new JButton("9");
            button0 = new JButton("0");
            
            plus = new JButton("+");
            minus = new JButton("-");
            divide = new JButton("/");
            multiply = new JButton("x");
            clear = new JButton("Clear");
            dot = new JButton(".");
            equals = new JButton("=");
            
            result = new JTextField(10);
            text1 = new JTextField(10);
            text2 = new JTextField(10);
            panel.setLayout(new GridLayout(6,4));

            
            //Adding Buttons to panel
            buttonPanel.add(button0); 
            buttonPanel.add(button1); 
            buttonPanel.add(button2); 
            buttonPanel.add(button3); 
            buttonPanel.add(button4); 
            buttonPanel.add(button5); 
            buttonPanel.add(button6); 
            buttonPanel.add(button7); 
            buttonPanel.add(button8); 
            buttonPanel.add(button9); 
            
            buttonPanel.add(divide); 
            buttonPanel.add(clear);         
            buttonPanel.add(plus); 
            buttonPanel.add(minus); 
            buttonPanel.add(equals); 
            buttonPanel.add(multiply); 
            buttonPanel.add(dot); 
            panel.add(buttonPanel,BorderLayout.CENTER);
            panel.add(result);
            JLabel label = new JLabel("");
            panel.add(label);

            //Action Listeners: When Pressed
			button1.addActionListener(calculator);
			//can use this when not static in hw5
			button2.addActionListener(calculator);
            button3.addActionListener(calculator);
            button4.addActionListener(calculator);
            button5.addActionListener(calculator);
            button6.addActionListener(calculator);
            button7.addActionListener(calculator);
            button8.addActionListener(calculator);
            button9.addActionListener(calculator);
            button0.addActionListener(calculator);

            plus.addActionListener(calculator);
            minus.addActionListener(calculator);
            divide.addActionListener(calculator);
            multiply.addActionListener(calculator);
            clear.addActionListener(calculator);
            dot.addActionListener(calculator);
            equals.addActionListener(calculator);
 
            
            return panel;
            

    }


            @Override
            public void actionPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                
                
                // check value is a number
                if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
                    if (!x.equals(""))
                        z = z + s;
                    else
                        x = x + s;
                    result.setText(x + y + z);

                }
                //clear all
                else if (s.charAt(0) == 'C') {
                    x = y = z = "";
                    result.setText(x + y + z);
                } else if (s.charAt(0) == '=') {

                    double te;

                    // calculate based on selected button
                    if (y.equals("+"))
                        te = (Double.parseDouble(x) + Double.parseDouble(z));
                    else if (y.equals("-"))
                        te = (Double.parseDouble(x) - Double.parseDouble(z));
                    else if (y.equals("/"))
                        te = (Double.parseDouble(x) / Double.parseDouble(z));
                    else
                        te = (Double.parseDouble(x) * Double.parseDouble(z));

                    // set the value of text
                    result.setText(x + y + z + "=" + te);
                    x = Double.toString(te);
                    y = z = "";
                } else {
                    // if there was no operand
                    if (y.equals("") || z.equals(""))
                        y = s;
                        // else evaluate
                    else {
                        double te;
                        if (y.equals("+"))
                            te = (Double.parseDouble(x) + Double.parseDouble(z));
                        else if (y.equals("-"))
                            te = (Double.parseDouble(x) - Double.parseDouble(z));
                        else if (y.equals("/"))
                            te = (Double.parseDouble(x) / Double.parseDouble(z));
                        else
                            te = (Double.parseDouble(x) * Double.parseDouble(z));
                        x = Double.toString(te);
                        y = s;
                        z = "";
                    }
                    result.setText(x + y + z);
                }
            }
            String x, y, z;

            calculator(){
                x = y = z = "";

            }
            
}
            