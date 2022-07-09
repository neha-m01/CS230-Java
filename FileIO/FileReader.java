package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		String file = "reading_example.txt";
		
		try {
			Scanner scan = new Scanner(new File(file));
			while(scan.hasNextLine()) {
				String txtline = scan.nextLine();
				String sentence[];
				sentence = txtline.split(",");
				for (int i = 0; i < sentence.length; i++) {
					System.out.print(sentence[i] + " ");
				}
				System.out.println("");
			}
			
		}
		catch(FileNotFoundException e){
			System.out.println("File not found!");
		}

	}
}
