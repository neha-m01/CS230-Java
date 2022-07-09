package HW2;

import java.awt.*;
import javax.swing.*;

public class RandomShapeTester {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		int width = 100; //in pixels
		int height = 400;
		frame.setSize(800,800);
		
		frame.setTitle("Random Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RandomShape component = new RandomShape();
		frame.add(component);
		
		frame.setVisible(true);
	}

}
