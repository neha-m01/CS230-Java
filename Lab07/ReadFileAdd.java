package Lab07;
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner; 

public class ReadFileAdd {

		
		public static void main (String[] args) {
			
			// === READ IN FILE ===
			String fileName = "tester.txt";
			File myInputFile = new File (fileName);
			ArrayList<Integer> allMyInt = new ArrayList<Integer>();
			
			// try-catch block
			try 
			{
				Scanner sc = new Scanner (myInputFile);
				while (sc.hasNextLine()) 
				{
					String nextLine = sc.nextLine();
					
					//int NextNumber = sc.nextInt();
					String [] allElements = nextLine.split(",");
					System.out.println(nextLine);
					
					int sum = 0;
			        for(int i = 0; i <allElements.length; i++)
			        {
			            sum = sum + Integer.parseInt(allElements[i]);
			            
			            
			            System.out.println(allElements[0] + allElements[i]);	
      
				}
			        allMyInt.add(sum);
			        
				}sc.close();
				
		        
//				while (sc.hasNextLine()) 
//				{
//				String nextLine = sc.nextLine();
//				//int nextNumber = Integer.parseInt(nextLine);
//				//int NextNumber = sc.nextInt();
//				for (int i = 0; i < nextLine.length(); i++) {
//				String [] allElements = nextLine.split(",");
//				System.out.println(allElements[i]);	
				
				
				 // to access  later

			
			}catch (FileNotFoundException fnfE) 
				{
					System.out.println(fnfE);
				} // end try-catch
		
		
			// === WRITE FILE ===
				String outputFileName = "outputFileLab07.txt";
			try 
			{
				PrintWriter pw = new PrintWriter (outputFileName);
				pw.println("Writing this to a file:");
				for (Integer s:allMyInt)
				{
					System.out.println(s);
					pw.println(s);
				}
				
				//MOST IMPORTANT
				pw.close();
				
			} 
			
			catch (FileNotFoundException fnfE) 
			{
				System.out.println(fnfE);
			} // end try-catch
			
	} //end main method
} //end class

