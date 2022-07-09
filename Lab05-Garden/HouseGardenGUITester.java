package Lab05;

import javax.swing.*;
import java.awt.*;

	public class HouseGardenGUITester {

		public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setSize(400,400);
		frame.setTitle("Neha's Home and Garden");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		JLabel label1 = new JLabel("Test");
		label1.setText("Neha Moolchandani");
		
		HouseGardenGUI s = new HouseGardenGUI();
		frame.add(s);

		
		frame.setVisible(true);
	}
	}