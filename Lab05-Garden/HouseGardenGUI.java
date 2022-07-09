package Lab05;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.*;
import javax.swing.JComponent;
import java.awt.Font;


	public class HouseGardenGUI extends JComponent {


		public void paintComponent(Graphics g){	
			// Casts g as a Graphics2D object, allows us to draw/fill
			// with shape objects
			Graphics2D g2 = (Graphics2D)g;
			
			// Create a shape and color it
			//Grass
			Rectangle2D.Double grass = new Rectangle2D.Double(0, 650, 800, 150);
			g2.setColor(Color.GREEN);
			g2.fill(grass);
			
			//Sky
			Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, 800, 700);
			g2.setColor(Color.CYAN);
			g2.fill(sky);
			
			//House
			Rectangle2D.Double House1 = new Rectangle2D.Double(550, 300, 200, 200);
			g2.setColor(Color.RED);
			g2.fill(House1);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(3));
			g2.draw(House1);
			
			Rectangle2D.Double House2 = new Rectangle2D.Double(550, 500, 200, 200);
			g2.setColor(Color.RED);
			g2.fill(House2);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(6));
			g2.draw(House2);
			
			Rectangle2D.Double House3 = new Rectangle2D.Double(350, 500, 200, 200);
			g2.setColor(Color.RED);
			g2.fill(House3);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(6));
			g2.draw(House3);
			
			Rectangle2D.Double House4 = new Rectangle2D.Double(350, 299, 200, 200);
			g2.setColor(Color.RED);
			g2.fill(House4);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(2));
			g2.draw(House4);
			
			//Windows
			Rectangle2D.Double W = new Rectangle2D.Double(600, 340, 110, 110);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(2));
			g2.draw(W);
			
			Rectangle2D.Double L = new Rectangle2D.Double(655, 340, 2, 110);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(2));
			g2.draw(L);
			
			Rectangle2D.Double W2 = new Rectangle2D.Double(600, 550, 110, 110);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(2));
			g2.draw(W2);
			
			Rectangle2D.Double L2 = new Rectangle2D.Double(655, 550, 2, 110);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(2));
			g2.draw(L2);
			
			Rectangle2D.Double W3 = new Rectangle2D.Double(400, 340, 110, 110);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(2));
			g2.draw(W3);
			
			Rectangle2D.Double L3 = new Rectangle2D.Double(455, 340, 2, 110);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(2));
			g2.draw(L3);
			
			//Door
			Rectangle2D.Double D = new Rectangle2D.Double(400, 550, 85, 150);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(6));
			g2.draw(D);
			
			Rectangle2D.Double D2 = new Rectangle2D.Double(400, 550, 85, 20);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(6));
			g2.draw(D2);
			
			Rectangle2D.Double D1 = new Rectangle2D.Double(440, 550, 2, 150);
			g2.setColor(Color.BLACK);
			g2.setStroke(new BasicStroke(5));
			g2.draw(D1);
			
			// setColor tells g2 what to color everything until called again
			// takes either an enum case (Color.SOMETHING) 
			// or a custom color (new Color(r, g, b))
			g2.setColor(new Color(60, 100, 220));
			
			// g2.fill() fills the area defined by the shape
			// g2.draw() defines the outline made by the shape
			//g2.draw(r);
			
			
			// Tree
			Ellipse2D.Double Tree = new Ellipse2D.Double(100, 200, 220, 225);
			g2.setColor(new Color(0, 102, 0));
			g2.fill(Tree);
			Rectangle2D.Double Stem = new Rectangle2D.Double(180, 420, 50, 285);
			g2.setColor(new Color(102, 51, 0));
			g2.fill(Stem);
			
			// Roof
			int[] xPoints = {350, 200, 750};
			int[] yPoints = {300, 100, 300};
			Polygon tri = new Polygon(xPoints, yPoints, 3);
			g2.setColor(Color.YELLOW);
			
			int[] x2Points = {750, 300, 230};
			int[] y2Points = {300, 150, 10};
			Polygon tri2 = new Polygon(x2Points, y2Points, 3);
			g2.setColor(Color.YELLOW);
			
			// Fill Roof
			g2.fillPolygon(tri);
			g2.fillPolygon(tri2);
			//g2.draw(tri);
			
			//Name Label
		      Font font = new Font("Serif", Font.PLAIN, 20);
		      g2.setFont(font);
		      g2.setColor(Color.BLACK);
		      g2.drawString("Neha Moolchandani", 600, 750);
			
			// drawRect, drawOval, fillRect, and fillOval can draw without
			// creating shape objects
			//g2.drawRect(150, 50, 100, 100);
			//g2.drawOval(100, 100, 75, 75);
			

			
			
		}
	}
		

