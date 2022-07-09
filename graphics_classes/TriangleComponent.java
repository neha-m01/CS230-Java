package graphics_classes;

import java.awt.*; //jcomponent
import java.awt.Polygon;

import javax.swing.*; //graphics

public class TriangleComponent extends JComponent{
	private int[] xcoord;
	private int[] ycoord;
	private int sides = 3;
	
	private int red;
	private int green;
	private int blue;
	private Color color = new Color (red, green, blue);
	
	private Polygon t = new Polygon();
	
	//constructor
	public TriangleComponent (int[] x, int [] y, int s) {
		this.xcoord = x;
		this.ycoord = y;
		this.sides = s;
	}
	
	
	public void paintComponent (Graphics g){ //Graphics is abstract class
		Graphics2D g2 = (Graphics2D) g; //instance stored in Graphics g
		
		g2.setColor(Color.BLACK);
		g2.draw(this.t);
		g2.setColor(this.color);	
		g2.fill(this.t);
	} 

	public void setTriangle (Color c) {
		this.color = c;
		this.t = new Polygon(xcoord,ycoord,sides);
	}
}
