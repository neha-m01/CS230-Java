package HW1;
import java.util.Scanner;
public class printJAVA {

	public static void main(String[] args)
	{
		
	int n3; int counter ;
	System.out.print("Input positive integer : ");
	Scanner c = new Scanner(System.in);
	n3 = c.nextInt();
        String output;
        output = "0";
        /*System.out.println("0");*/
        for (counter=1; counter < n3; counter ++)
        {
            if ((counter&counter-1)==0)
            {
              /*System.out.println("JAVA"); */
              output = output + "JAVA";
            }
            else
            {
                 /*System.out.println(counter); */
                 output = output + counter;
            }
        }
        System.out.println(output);
        c.close();
     }
}