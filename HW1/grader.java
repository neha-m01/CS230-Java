package HW1;

import java.util.Scanner;

public class grader {

	public static void main(String[] args)
	{
		

	float avg_exams, avg_hw;
	int attendance;
	
	System.out.print("Input Average Exam Grade : ");
	Scanner e = new Scanner(System.in);
	avg_exams = e.nextInt();
	
	System.out.print("Input Average Homework Grade : ");
	Scanner h = new Scanner(System.in);
	avg_hw = h.nextInt();
	
	System.out.print("Input Days Attended Class : ");
	Scanner a = new Scanner(System.in);
	attendance = a.nextInt();
	
	if (attendance > 20 && avg_exams > 70 && avg_hw > 70)
	{
		System.out.println("PASS");
	}
	else 
	{
		System.out.println("FAIL");
	}
	}
}
