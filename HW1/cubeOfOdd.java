package HW1;
import java.util.Scanner;
public class cubeOfOdd {
	
	public static void main(String[] args)
//cubeOfOdd (n1)
//taking n1 as input
	
{
	int i,n;
	
	System.out.print("Input number of terms : ");
	Scanner c = new Scanner(System.in);
			n = c.nextInt();
		
	for(i=1;i<=n;i++)
	{	
		if (i % 2 == 0){
			System.out.println(i + "");
			
		
		}else {
			System.out.println((i*i*i));
			}
		
		}
		
	}

}

