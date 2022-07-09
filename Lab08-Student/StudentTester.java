package Lab08;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.PrintWriter;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class StudentTester
	{
		public static void main(String[] args) {

			String fileName = "studentList.txt";
			String outputFileName = "StudentTester.txt";
			File myInputFile = new File (fileName); 

				
				// === READ IN FILE ===
				// try-catch block
				try 
				{
					Scanner sc = new Scanner (myInputFile);
					PrintWriter pw = new PrintWriter (outputFileName);
					pw.println("Writing this to a file:");
					
					//Student[][] StudentList = new Student[8][4];
					ArrayList<Student> StudentArrayList = new ArrayList<Student>();
					
					//for(int j = 0; j < StudentArrayList.size(); j++)
					int i =0;
					int j=0;
					{ 
					while (sc.hasNext()) 
					{
						String data = sc.nextLine();
						String[] values = data.split(",");
						System.out.println(values[i] + "\r\n");
						
						 
						StudentArrayList.add(new Student(values[0], Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3])));
						i=i++;
					}
					}
					
					
					pw.write("\n*** Student's Final Grades ***\n");
					for (i=0; i<StudentArrayList.size(); i++) {
						StudentArrayList.get(i).setfinalGrade();
						StudentArrayList.get(i).setletterGrade();
						
						  pw.write(StudentArrayList.get(i).getName() +" received a grade of "
						  		+ StudentArrayList.get(i).getfinalGrade() + ": "
						  			+ StudentArrayList.get(i).getletterGrade());
						  	pw.write("\r\n");
					}						
				        
					sc.close();
					pw.close();

					
					} catch (FileNotFoundException fnfE) 
						{
							System.out.println(fnfE);
						} // end try-catch
		}
	}

	
		

