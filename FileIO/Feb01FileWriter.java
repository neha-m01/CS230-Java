package FileIO;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Feb01FileWriter {

	public static void main(String[] args) {
		String file = "writing_example.txt";
		Scanner input = new Scanner(System.in);
		
		try {
			PrintWriter p = new PrintWriter (new File(file));
			p.print(""); //to clear previous inputs
			System.out.println("Enter contents of text file: ");
			String contents = input.nextLine();
			p.print(contents);
			p.close();
			} 
		catch (FileNotFoundException e) {
				e.printStackTrace();
		}
		input.close();
	}
	
}
