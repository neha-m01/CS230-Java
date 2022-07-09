package HW2;

import javax.swing.JFrame;

public class ShapeViewer {
	public static void main (String[] args) {
		
		// create a new variable
		//    declare             initial value
		// <type> <name> = <value>;
		// String myString = "my string here";
		// create/instantiate JFrame object
		// <type/Class> <name> = new <Constructor>;
		
		JFrame frame = new JFrame();
		
		// set size
		//frame.setSize(100,400);
	
		// no magic / mystery numbers
		int width = 100; //in pixels
		int height = 400;
		frame.setSize(width,height);
		
		frame.setTitle("Neha's JFrame");
		
		// set default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add stuff
		ShapeComponent component = new ShapeComponent();
		frame.add(component);
		
		//make visible
		frame.setVisible(true);
		
	}

}
