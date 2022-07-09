package graphics_classes;

import java.awt.*; //jcomponent
import java.awt.geom.*;

import javax.swing.*; //graphics

public class OvalComponent extends JComponent{
	private int xcoord;
	private int ycoord;
	private int width;
	private int height;
	
	private int red;
	private int green;
	private int blue;
	private Color color = new Color (red, green, blue);
	
	private Ellipse2D.Double o = new Ellipse2D.Double(xcoord,ycoord,width,height);
	
	//constructor
	public OvalComponent (int x, int y, int w, int h) {
		this.xcoord = x;
		this.ycoord = y;
		this.width = w;
		this.height = h;
	}
	public void paintComponent (Graphics g){ //Graphics is abstract class
		Graphics2D g2 = (Graphics2D) g; //instance stored in Graphics g
		
		g2.setColor(Color.BLACK);
		g2.draw(this.o);;
		g2.setColor(this.color);	
		g2.fill(this.o);
	} 

	public void setOval (Color c) {
		this.color = c;
		this.o = new Ellipse2D.Double(xcoord,ycoord,width,height);
	}
}
