package graphics_classes;

import java.awt.*; //jcomponent
import java.util.Random;

import javax.swing.*; //graphics

public class Viewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(600,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Random r = new Random();
		
		int x = r.nextInt(301); //exclusive
		int y = r.nextInt(301);
		int w = r.nextInt(301);
		int h = r.nextInt(301);
		
		int x1 = r.nextInt(301);
		int x2 = r.nextInt(301);
		int x3 = r.nextInt(301);
		int y1 = r.nextInt(301);
		int y2 = r.nextInt(301);
		int y3 = r.nextInt(301);
		int[] xcoords = {x1, x2, x3};
		int[] ycoords = {y1, y2, y3};
		int sides = 3;
		
		
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);
		Color color = new Color (red, green, blue);
		
		OvalComponent o = new OvalComponent(x,y,w,h);
		TriangleComponent t = new TriangleComponent(xcoords, ycoords, sides);
		
		int which = r.nextInt(2);
		if (which == 0) {
			o.setOval(color);
			frame.add(o);
		}
		else {
			t.setTriangle(color);
			frame.add(t);
		}
	
		frame.setVisible(true);

	}

}
