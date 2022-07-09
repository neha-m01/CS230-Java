package HW1;
import java.util.Scanner;
public class introToJava {

	public static void main(String[] args)
	{
		
	int n2 ;
	System.out.print("Input positive integer : ");
	Scanner c = new Scanner(System.in);
	n2 = c.nextInt();
	
	if (n2 > 0) {
		System.out.println("Number is Positive");
		if ((n2 % 3 == 0) && (n2 % 7 == 0))
			{
				System.out.println("UAB CS 203");
			}
		else if (n2 % 3 == 0)
			{
				System.out.println("CS");
			}
		else if (n2 % 7 == 0)
			{
				System.out.println("UAB");
			}
		else if ((n2 % 2 == 1) && (n2 % 5 == 1))
			{
				System.out.println("Go Blazers");
			}
		else 
			{
				System.out.println((int)Math.pow(n2, 3));
			}
		}
	else {
			System.out.println("Not Valid Integer. Please input Positive integer");
		}
	}
}