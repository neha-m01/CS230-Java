package Lab01;
import java.util.Scanner;

public class Fiboncacci {

	public static void main(String[] args) {
		
        int n, a = 0, b = 0, c = 1;
        Scanner num = new Scanner(System.in);
        
        
        //user to enter int
        System.out.print("Enter a Value for n:");
        n = num.nextInt();
        System.out.print("Fibonacci Sequence:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}