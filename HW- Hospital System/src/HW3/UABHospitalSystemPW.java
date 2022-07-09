package HW3;
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class UABHospitalSystemPW {

		public static void main(String[] args) {

			String fileName = "uabEmployee.txt";
			String outputFileName = "outputFileUABHospitalSys.txt";
			File myInputFile = new File (fileName); 
			

				
				// === READ IN FILE ===
				// try-catch block
				try 
				{
					Scanner sc = new Scanner (myInputFile);
					PrintWriter pw = new PrintWriter (outputFileName);
					

					
					//Arrays for each Class
					ArrayList<Employee> EmployeeArrayList = new ArrayList<Employee>();
					ArrayList<Doctor> DoctorArrayList = new ArrayList<Doctor>();
					ArrayList<Surgeon> SurgeonArrayList = new ArrayList<Surgeon>();
					ArrayList<Nurse> NurseArrayList = new ArrayList<Nurse>();
					ArrayList<Administrator> AdministratorArrayList = new ArrayList<Administrator>();
					ArrayList<Receptionist> ReceptionistArrayList = new ArrayList<Receptionist>();
					ArrayList<Janitor> JanitorArrayList = new ArrayList<Janitor>();
					
				        while(sc.hasNextLine()){
				            String line = sc.nextLine();
		
	    				String[] values = line.split(" ");
						//EmployeeArrayList.add(new Employee(values[1], Integer.parseInt(values[2])));
   	   					//System.out.println(EmployeeArrayList);
   	   					System.out.println(values[0]);
   	   			
   						if (values[0].equals("E")) {
   							EmployeeArrayList.add(new Employee(values[1], Integer.parseInt(values[2])));
   							System.out.println(EmployeeArrayList.get(0));
   						}else if (values[0].equals("D")) {
   							//System.out.println("Hello");
   							DoctorArrayList.add(new Doctor(values[1], Integer.parseInt(values[2]), values[3]));
   							System.out.println(DoctorArrayList);
   						}else if (values[0].equals("S")) {
   							//System.out.println("Hello");
   							SurgeonArrayList.add(new Surgeon(values[1], Integer.parseInt(values[2]), values[3], values[4]));
   							System.out.println(SurgeonArrayList);
   						}else if (values[0].equals("N")) {
   							//System.out.println("Hello");
   							NurseArrayList.add(new Nurse(values[1], Integer.parseInt(values[2]), values[3]));
   							System.out.println(NurseArrayList);
   						}else if (values[0].equals("A")) {
   							//System.out.println("Hello");
   							AdministratorArrayList.add(new Administrator(values[1], Integer.parseInt(values[2]), values[3]));
   							System.out.println(AdministratorArrayList);
   						}else if (values[0].equals("R")) {
   							//System.out.println("Hello");
   							ReceptionistArrayList.add(new Receptionist(values[1], Integer.parseInt(values[2]), values[3], values[4]));
   							System.out.println(ReceptionistArrayList);
   						}else if (values[0].equals("J")) {
   							//System.out.println("Hello");
   							JanitorArrayList.add(new Janitor(values[1], Integer.parseInt(values[2]), values[3], values[4]));
   							System.out.println(JanitorArrayList);
   						} else {
   							System.out.println("Employee Does NOT Exist in this System");
   						}
   						

   						//break;						
				        }
 
   						sc.close();
   						
						pw.write("**********************************" + "\n");
						pw.write("Welcome to the UAB Employee System" + "\n");
						pw.write("**********************************" + "\n");
						pw.write("The UAB Hospital System has the following employees: " + "\n");
						pw.write("\r\n");
				
						//Total Count
						int EmployeeCount = EmployeeArrayList.size();
						int DoctorCount = DoctorArrayList.size();
						int SurgeonCount = SurgeonArrayList.size();
						int NurseCount = NurseArrayList.size();
						int AdministratorCount = AdministratorArrayList.size();
						int ReceptionistCount = ReceptionistArrayList.size();
						int JanitorCount = JanitorArrayList.size();
						int TotalCount = EmployeeCount + DoctorCount + SurgeonCount + NurseCount
																	+ AdministratorCount + ReceptionistCount + JanitorCount;
						
						pw.write("Total Number of employees = " + TotalCount);
						pw.write("\r\n");
						pw.write("\r\n");
						
						//Employee
						int i =0;
						pw.write("Hospital Employees: " + EmployeeCount);
						pw.write("\r\n");
						for (i=0; i<EmployeeArrayList.size(); i++) {
							  pw.println(EmployeeArrayList.get(i));
						}	
						pw.write("\r\n");
						
						//Doctor
						int j =0;
						pw.write("Doctors: " + DoctorArrayList.size());
						pw.write("\r\n");
						for (j=0; j<DoctorArrayList.size(); j++) {
							  pw.println(DoctorArrayList.get(j));
						}	
						pw.write("\r\n");
						
						//Surgeon
						int k =0;
						pw.write("Surgeons: " + SurgeonArrayList.size());
						pw.write("\r\n");
						for (k=0; k<SurgeonArrayList.size(); k++) {
							  pw.println(SurgeonArrayList.get(k));
						}	
						pw.write("\r\n");
						
						//Nurses
						int m =0;
						pw.write("Nurses: " + NurseArrayList.size());
						pw.write("\r\n");
						for (m=0; m<NurseArrayList.size(); m++) {
							  pw.println(NurseArrayList.get(m));
						}	
						pw.write("\r\n");
						
						//Administrator
						int l =0;
						pw.write("Administrators: " + AdministratorArrayList.size());
						pw.write("\r\n");
						for (l=0; l<AdministratorArrayList.size(); l++) {
							  pw.println(AdministratorArrayList.get(l));
						}	
						pw.write("\r\n");
						
						//Receptionist
						int n =0;
						pw.write("Receptionists: " + ReceptionistArrayList.size());
						pw.write("\r\n");
						for (n=0; n<ReceptionistArrayList.size(); n++) {
							  pw.println(ReceptionistArrayList.get(n));
						}	
						pw.write("\r\n");
						
						//Janitors
						int p =0;
						pw.write("Janitors: " + JanitorArrayList.size());
						pw.write("\r\n");
						for (p=0; p<JanitorArrayList.size(); p++) {
							  pw.println(JanitorArrayList.get(p));
						}	
						pw.write("\r\n");
						
   						pw.close();
				
				}catch (FileNotFoundException fnfE) 
				{
					System.out.println(fnfE);
				} // end try-catch
		}
}						