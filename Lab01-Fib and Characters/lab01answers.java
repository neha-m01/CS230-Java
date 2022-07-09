package Lab01;
import java.util.Scanner;

public class Fiboncacci {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        //user to enter int
        System.out.print("Enter a Value for n:");
        int n =scan.nextInt();
        for(int i = 1; i <= n; i++)
        {
        	System.out.print(fib(i) + " ");
        }
        System.out.println();
            
        scan.nextLine();
        // user to enter a string
        System.out.print("Enter a string :");
        System.out.println(s);
        
            scan.close();
        }
        
        
        public static int fib (int n) {
        	int prevPrev= 0;
        	int prev = 1;
        	for (int i = 3; i <= n; i++) {
        		int temp = prev;
        		prev =+ prevPrev;
        		prevPrev = temp;
        	}
        	return n == 1? prevPrev : prev;
    }
    public static char middleCharacter(String s)}
}