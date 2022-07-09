package Lab05;

import javax.swing.*;
import java.awt.*;

public class SomeGraphicsTester {

	public static void main(String[] args) {
	JFrame frame= new JFrame();
	frame.setSize(500,500);
	frame.setTitle("CS 203 lecture 6");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	
	SomeGraphics s = new SomeGraphics();
	frame.add(s);

	
	frame.setVisible(true);
}
}