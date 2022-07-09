package Lab08;

import java.util.ArrayList;

public class Student{

	private String Name;
	private int exam1,exam2, finalExam;
	private double finalGrade;
	private String letterGrade;
	
	public Student(String n, int e1, int e2, int fe)
	{ 
		this.Name = n;
		this.exam1 = e1;
		this.exam2 = e2;
		this.finalExam = fe;
	}
	
	// create all of the necessary accessor and mutator methods
	
	//Name
	public String getName()
	{
		return this.Name;
	}
	public void setName(String n)  
	{
		this.Name = n;
	}
	//Exam1
	public int getexam1()
	{
		return this.exam1;
	}
	public void setlexam1(int e1) 
	{
		this.exam1 = e1;
	}
	//Exam2
	public int getexam2()
	{
		return this.exam2;
	}
	public void setlexam2(int e2) 
	{
		this.exam2 = e2;
	}
	//Final Exam
	public int getfinalExam()
	{
		return (int) this.finalExam;
	}
	public void setfinalExam(int fe)
	{
		this.finalExam = fe;
	}
	
	//Final Grade
	public double getfinalGrade()
	{
		return (double) this.finalGrade;
	}
	public void setfinalGrade()
	{
	
		this.finalGrade = (this.getexam1()*0.25) + (this.getexam2()*0.25) + (this.getfinalExam()*0.50);
	}
	//Letter Grade
	public String getletterGrade()
	{
		return this.letterGrade;
	}
	// Create the necessary methods to compute the letterGrade
		public void setletterGrade() {
			double score = this.getfinalGrade();
	 		String letterGrade;
			
		if (score >= 90) {
			letterGrade = "A";
		} else if (score >= 80) {
			letterGrade = "B";
		}else if (score >= 70) {
			letterGrade = "C";
		} else {
			letterGrade = "F";
		}
	
		this.letterGrade = letterGrade;
	}



	//method
	public String toString() {
		//return ((getexam1() + getexam2() + getfinalExam())/3) = getfinalExam();
		return getName() + "recieved a grade of" + " : " + getletterGrade() + getfinalGrade();
	}
}

 
