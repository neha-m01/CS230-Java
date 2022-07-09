package HW1;

import java.util.Scanner;

public class paintGallons {
	public static void main(String[] args)
	{
		

	float length, width, height, total_area, total_gallons;
	
	System.out.print("Input length : ");
	Scanner l = new Scanner(System.in);
	length = l.nextInt();
	
	System.out.print("Input width : ");
	Scanner w = new Scanner(System.in);
	width = w.nextInt();
	
	System.out.print("Input height : ");
	Scanner h = new Scanner(System.in);
	height = h.nextInt();
	
	
	total_area = (2*(length*height)) + (2*(width*height)) + (length*width);
	total_gallons = (total_area / 400);
	System.out.println("Total Area: " + total_area);
	System.out.println("Total Gallons: " + total_gallons + "gallons thus " + Math.ceil(total_gallons));
	}
}
