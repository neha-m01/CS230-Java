package HW2;

import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Shape;
import java.util.Random;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class ShapeComponent extends JComponent {
	
	private int xCoord = 50;
	private int yCoord = 100;
	private int n = 15;
	private Color myColor;
	private Shape myShape;
	
	/**
	 * Constructor (has no return type -- exact name as class -- only gets called once
	 * 				for object instantiated) 
	 * @params
	 * 
	 */
	public ShapeComponent() {
		//inset params here
		this.myColor = Color.BLUE;
		this.setShape();
	}

	// we inherit abstract method from JComponent
	public void paintComponent (Graphics g) {
		
		//recast g into Graphics2D
		Graphics2D g2 = (Graphics2D) g; 
		
		// set paint brush color
		g2.setColor(this.getColor());
		
		// draw = outline
		g2.draw(this.getShape());
		
		// fill - fills the inside
		g2.fill(this.getShape());
		
	} // end paintComponent 
	
	public void setShape() {
		this.n = new Random().nextInt(40); // picks number between 0 & 40;
		
		this.myShape = new Rectangle(this.getX(), this.getY(), this.getN(), this.getN());
	}
	
	public int getX() {
		return this.xCoord;
	}
	public int getY() {
		return this.yCoord;
	}
	public int getN() {
		return this.n;
	}
	public Color getColor() {
		return this.myColor;
	}
	public Shape getShape() {
		return this.myShape;
	}
}
