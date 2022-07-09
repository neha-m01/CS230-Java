

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentTester {
	
	public void ReadFile() {
		String fileName = "studentList.txt";
		File myInputFile = new File (fileName);

			
			// === READ IN FILE ===
			// try-catch block
			try 
			{
				Scanner sc = new Scanner (myInputFile);
				while (sc.hasNextLine()) 
				{
					String data = sc.nextLine();
					System.out.println(data);
			        
				}sc.close();

			}catch (FileNotFoundException fnfE) 
				{
					System.out.println(fnfE);
				} // end try-catch
		
		
			// === WRITE FILE ===
				String outputFileName = "outputFileLab08.txt";
			try 
			{
				PrintWriter pw = new PrintWriter (outputFileName);
				pw.println("Writing this to a file:");
				for (int i = 0; i < outputFileName.length(); i++) 
		            pw.write(outputFileName.charAt(i)); 
				System.out.println("Writing successful"); 
				
				//MOST IMPORTANT
				pw.close();
				
			} 
	
			
			catch (FileNotFoundException fnfE) 
			{
				System.out.println(fnfE);
			} // end try-catch
			
	}


	public static void main(String[] args) {
		
		Student StudentList[] = new Student[25];
		ArrayList<Student> StudentArrayList = new ArrayList<Student>();
		
		for(int i = 0; i< StudentList.length; i++)
		{
			System.out.println(StudentList[i]);
		}
		
		System.out.println("\n*** Student's Final Grades ***\n");
		for(int j = 0; j < StudentArrayList.size(); j++)
		{
			System.out.println(StudentArrayList.get(j).getName() 
					+ StudentArrayList.get(j).getlastName() 
						+ StudentArrayList.get(j).getexam1()
							+ StudentArrayList.get(j).getexam2()
								+ StudentArrayList.get(j).getletterGrade()
									+ StudentArrayList.get(j).getfinalGrade());
		}
	}
				
		
	}

	
//	public static void main(String[] args) {
//		Student myStudent = new Student("s")
//		
//		System.out.println(myStudent);
//		
//		ArrayList<Student> myStudents = new ArrayList<Student>();
//		myStudents.add(myStudent);
//		myStudents.add(new Student("s1"));
//		
//		System.out.println(myStudents);
//		
//		for(Student s:myStudents<25) {
//			System.out.println(s.getfinalGrade());
//			System.out.println(s.getletterGrade());

