package Lab01;
import java.util.Scanner;

public class MiddleStrChar {
	// Function that prints the middle char of string
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a word: ");
	String str = sc.next();

	int position, length;
	
	if ((str.length() % 2) == 1){
		position = str.length() / 2;
		length = 1;
	}
	else
	    {
		position = str.length() / 2 -1;
		length = 2;
	    }
		String result = str.substring(position, position + length);
		
		System.out.println("String:" + result);
	}
    
}