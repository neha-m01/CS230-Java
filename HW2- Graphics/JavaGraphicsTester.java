package HW2;
import java.awt.*;
import javax.swing.*;


public class JavaGraphicsTester {


	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800,500);
		frame.setTitle("CS 203 Lecture GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JavaGraphics s = new JavaGraphics();
		frame.add(s);
		

		frame.setVisible(true);
	}

}
