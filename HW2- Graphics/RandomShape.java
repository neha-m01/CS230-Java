package HW2;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class RandomShape extends JComponent {

	private int width;
	private int length;
	private int RandFig = 0;
	private Color myColor;
	private Shape myShape;	
	int xCoord = new Random().nextInt(100)+100;
	int yCoord = new Random().nextInt(100)+100;
	
	
	/**
	 * Constructor (has no return type -- exact name as class -- only gets called once
	 * 				for object instantiated) 
	 * @params
	 * 
	 */

	
	public int getX() {
		return this.xCoord;
	}
	public int getY() {
		return this.yCoord;
	}
	public int getwidth() {
		return this.width;
	}
	public int getlength() {
		return this.length;
	}
	public Color getColor() {
		return this.myColor;
	}
	public Shape getShape() {
		return this.myShape;
	}
	
	public RandomShape() {
		//
		Random randomGenerator = new Random();
		int red = randomGenerator.nextInt(256);
		int green = randomGenerator.nextInt(256);
		int blue = randomGenerator.nextInt(256);

		this.myColor = new Color(red,green,blue);
		this.setShape();
	}

	
	public void setShape() {
		this.width = new Random().nextInt(74) + 26; // picks number between 26 and 99;
		this.length = new Random().nextInt(74) + 26; 
		this.RandFig = new Random().nextInt(6);
		
		if (this.RandFig == 0) {
			// Rectangle
			System.out.println ("Rectangle: " + this.RandFig);
			this.myShape = new Rectangle(this.getX(), this.getY(), this.getwidth(), this.getlength());	
		}

		if (this.RandFig == 1) {
			// Square
			System.out.println ("Square: " +this.RandFig);
			this.myShape = new Rectangle(this.getX(), this.getY(), this.getwidth(), this.getwidth());
		}

		if (this.RandFig == 2) {
			// Circle
			System.out.println ("Circle: " + this.RandFig);
			this.myShape =  new Ellipse2D.Double(this.getX(),this.getY(),this.getwidth(), this.getwidth());
		}
		if (this.RandFig == 3) {
			//Ellipse
		System.out.println ("Ellipse: " + this.RandFig);
		this.myShape =  new Ellipse2D.Double(this.getX(),this.getY(),this.getwidth(), this.getlength());	
		}
		
		if (this.RandFig == 4) {		
			// Eq. Triangle
			double X1 = this.getX();
			double Y1 = this.getY();
			double X2 = X1 + (this.width/2);
			double Y2 = Y1 + ((this.width/2)*(Math.sqrt(3)));
			double X3 = X1 + (this.width);
			double Y3 = Y1;
			this.myShape = new Polygon(new int[] {(int) X1, (int) X2, (int) X3}, new int[] {(int) Y1, (int) Y2, (int) Y3}, 3);
			System.out.println("Triangle: " + this.myShape);
		}
		
		if (this.RandFig == 5) {
			// Regular Pentagon
			double radius = this.getwidth()/(2*Math.sin(Math.PI/5));
			
			double X1 = this.getX();
			double Y1 = this.getY() + radius;
			double X2 = this.getX() + (radius * (Math.sin(1 * (2 * Math.PI)/ 5)));
			double Y2 = this.getY() + (radius * (Math.cos(1 * (2 * Math.PI)/ 5)));
			double X3 = this.getX() + (radius * (Math.sin(2 * (2 * Math.PI)/ 5)));
			double Y3 = this.getY() + (radius * (Math.cos(2 * (2 * Math.PI)/ 5)));
			double X4 = this.getX() + (radius * (Math.sin(3 * (2 * Math.PI)/ 5)));
			double Y4 = this.getY() + (radius * (Math.cos(3 * (2 * Math.PI)/ 5)));
			double X5 = this.getX() + (radius * (Math.sin(4 * (2 * Math.PI)/ 5)));
			double Y5 = this.getY() + (radius * (Math.cos(4 * (2 * Math.PI)/ 5)));
			
			this.myShape = new Polygon(new int[] {(int) X1, (int) X2, (int) X3, (int) X4, (int) X5}, new int[] {(int) Y1, (int) Y2, (int) Y3,(int) Y4,(int) Y5}, 5);
			System.out.println("Regular Pentagon: " + this.myShape);
		}

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

}

