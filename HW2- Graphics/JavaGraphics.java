package HW2;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.*;


public class JavaGraphics extends JComponent {
	
	public void paintComponent (Graphics g) {
		
		//Create a Graphics object
		Graphics2D g2 = (Graphics2D) g;
		
		//Create a rectangle box, x = 5, y = 10, length = 50, height = 30
		Rectangle box = new Rectangle (5,10,50,30);
		g2.draw(box);;

		//ellipse

		Ellipse2D.Double ellipse = new Ellipse2D.Double(70,10,30,40);
		g2.draw(ellipse);

	
		//set color and fill ellipse object
		Color red = new Color (255,0,0);
		g2.setColor(red);;
		g2.fill(ellipse);
	
		//set color and fill box object
		Color yellow = new Color(255,255,102);
		g2.setColor(yellow);
		g2.fill(box);
	
		//define object and draw the shape together
		Color black = new Color(0,0,0);
		g2.setColor(black);
		g2.draw(new Ellipse2D.Double (150, 10, 50, 50));
		
		//place a string, set font, size, etc...
		g2.setColor(Color.RED);
		g2.setFont(new Font ("TimesRoman", Font.PLAIN,44));
		g2.drawString("Neha Moolchandani", 130, 120);
	
		// draw a 2D line
		Point2D.Double from = new Point2D.Double(135,135);
		Point2D.Double to = new Point2D.Double(370,135);
		Line2D.Double segment = new Line2D.Double(from, to);
		g2.draw(segment);
	
	}
}