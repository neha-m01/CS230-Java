package HW3;
import java.io.ByteArrayOutputStream;
import java.io.File;  
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class UABHospitalSystem {

public static void main(String[] args) {

	String fileName = "uabEmployee (1).txt";
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
			
			//Initializing Variables
			int EmployeeCount = 0, DoctorCount  = 0,  SurgeonCount = 0, NurseCount = 0, AdministratorCount = 0,
					ReceptionistCount = 0,  JanitorCount = 0;
			int TotalCount = 0;
			int i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, p = 0;
			
		        while(sc.hasNextLine()){
		            String line = sc.nextLine();

				String[] values = line.split(" ");
				//EmployeeArrayList.add(new Employee(values[1], Integer.parseInt(values[2])));
				//System.out.println(EmployeeArrayList);
				System.out.println(values[0]);
		
				if (values[0].equals("E")) {
						EmployeeArrayList.add(new Employee(values[1], Integer.parseInt(values[2])));
					}else if (values[0].equals("D")) {
						//System.out.println("Hello");
						DoctorArrayList.add(new Doctor(values[1], Integer.parseInt(values[2]), values[3]));
					}else if (values[0].equals("S")) {
						//System.out.println("Hello");
						SurgeonArrayList.add(new Surgeon(values[1], Integer.parseInt(values[2]), values[3], values[4]));
					}else if (values[0].equals("N")) {
						//System.out.println("Hello");
						NurseArrayList.add(new Nurse(values[1], Integer.parseInt(values[2]), values[3]));
					}else if (values[0].equals("A")) {
						//System.out.println("Hello");
						AdministratorArrayList.add(new Administrator(values[1], Integer.parseInt(values[2]), values[3]));
					}else if (values[0].equals("R")) {
						//System.out.println("Hello");
						ReceptionistArrayList.add(new Receptionist(values[1], Integer.parseInt(values[2]), values[3], values[4]));
					}else if (values[0].equals("J")) {
						//System.out.println("Hello");
						JanitorArrayList.add(new Janitor(values[1], Integer.parseInt(values[2]), values[3], values[4]));
					} else {
						System.out.println("Employee Does NOT Exist in this System");
	   						}
				        }
 
   						sc.close();
   							
   				// Getting Main Inputs		
    	int option;
		int Display = 1, Add = 2, Update = 3, Delete = 4;
		
		Scanner input1 = new Scanner(System.in);
        System.out.println("\nSelect one of the following numbers: " + "\r\n");
		System.out.println("1. Display Employee List " + "\r\n");
		System.out.println("2. Add Employee " + "\r\n");
		System.out.println("3. Delete employee " + "\r\n");
		System.out.println("\nNumber: " + "\r\n");
        option = input1.nextInt();
        
		switch(option) {
		case 1:
			System.out.println("**********************************" + "\n");
			System.out.println("Welcome to the UAB Employee System" + "\n");
			System.out.println("**********************************" + "\n");
			System.out.println("The UAB Hospital System has the following employees: " + "\n");
			System.out.println("\r\n");
	
//					//Total Count
			EmployeeCount = EmployeeArrayList.size();
			DoctorCount = DoctorArrayList.size();
			SurgeonCount = SurgeonArrayList.size();
			NurseCount = NurseArrayList.size();
			AdministratorCount = AdministratorArrayList.size();
			ReceptionistCount = ReceptionistArrayList.size();
			JanitorCount = JanitorArrayList.size();
			TotalCount = EmployeeCount + DoctorCount + SurgeonCount + NurseCount
			+ AdministratorCount + ReceptionistCount + JanitorCount;
			
			System.out.println("Total Number of employees = " + TotalCount);
			System.out.println("\r\n");
			System.out.println("\r\n");
			
			//Employee
			System.out.println("Hospital Employees: " + EmployeeCount);
			System.out.println("\r\n");
			for (i=0; i<EmployeeArrayList.size(); i++) {
				System.out.println(EmployeeArrayList.get(i));
			}	
			System.out.println("\r\n");
			
			//Doctor
			System.out.println("Doctors: " + DoctorArrayList.size());
			System.out.println("\r\n");
			for (j=0; j<DoctorArrayList.size(); j++) {
				System.out.println(DoctorArrayList.get(j));
			}	
			System.out.println("\r\n");
			
			//Surgeon
			System.out.println("Surgeons: " + SurgeonArrayList.size());
			System.out.println("\r\n");
			for (k=0; k<SurgeonArrayList.size(); k++) {
				System.out.println(SurgeonArrayList.get(k));
			}	
			System.out.println("\r\n");
			
			//Nurses
			System.out.println("Nurses: " + NurseArrayList.size());
			System.out.println("\r\n");
			for (m=0; m<NurseArrayList.size(); m++) {
				System.out.println(NurseArrayList.get(m));
			}	
			System.out.println("\r\n");
			
			//Administrator
			System.out.println("Administrators: " + AdministratorArrayList.size());
			System.out.println("\r\n");
			for (l=0; l<AdministratorArrayList.size(); l++) {
				System.out.println(AdministratorArrayList.get(l));
			}	
			System.out.println("\r\n");
			
			//Receptionist
			System.out.println("Receptionists: " + ReceptionistArrayList.size());
			System.out.println("\r\n");
			for (n=0; n<ReceptionistArrayList.size(); n++) {
				  System.out.println(ReceptionistArrayList.get(n));
			}	
			System.out.println("\r\n");
			
			//Janitors
			System.out.println("Janitors: " + JanitorArrayList.size());
			System.out.println("\r\n");
			for (p=0; p<JanitorArrayList.size(); p++) {
				System.out.println(JanitorArrayList.get(p));
			}	
			System.out.println("\r\n");
			
								break;
		case 2:
			//int Display = 1, Add = 2, Update = 3, Delete = 4;

             //main(null);
			Scanner input2 = new Scanner(System.in);
            System.out.println("\nWhat type of Employee would you like to add? Please enter the code (E, D, S, N, A, R, J)" + "\r\n");
			System.out.println("E - Hospital Employee  " + "\r\n");
			System.out.println("D - Doctor " + "\r\n");
			System.out.println("S - Surgeon " + "\r\n");
			System.out.println("N - Nurse " + "\r\n");
			System.out.println("A - Administrator " + "\r\n");
			System.out.println("R - Receptionist " + "\r\n");
			System.out.println("J - Janitor " + "\r\n");
            
            String option2 = input2.next();
            switch (option2) {
		case "E": 
				Scanner HENameInput = new Scanner(System.in);
				Scanner HEBlazerIdInput = new Scanner(System.in);	
				System.out.println("Enter Hospital Employee name: " + "\r\n");
				String HEName = HENameInput.next();
				System.out.println("Enter Hospital Employee's BlazerId: ");
				String HEBlazerId = HEBlazerIdInput.next();
				EmployeeArrayList.add(new Employee(HEName, Integer.parseInt(HEBlazerId)));
				System.out.println("Hospital Employee has been Added! ");
				break;	
				
		case "D": 
				Scanner DNameInput = new Scanner(System.in);
				Scanner DBlazerIdInput = new Scanner(System.in);
				Scanner DSpecialtyInput = new Scanner(System.in);
				System.out.println("Enter Doctor's name: " + "\r\n");
				String DName = DNameInput.next();
				System.out.println("Enter Doctor's BlazerId: ");
				String DBlazerId = DBlazerIdInput.next();
				System.out.println("Enter Doctor's Specialty: ");
				String DSpecialty = DNameInput.next();
				DoctorArrayList.add(new Doctor(DName, Integer.parseInt(DBlazerId), DSpecialty));
				System.out.println("Doctor has been Added! ");
				break;	
				
				
		case "S": 
				Scanner SNameInput = new Scanner(System.in);
				Scanner SBlazerIdInput = new Scanner(System.in);
				Scanner SSpecialtyInput = new Scanner(System.in);
				Scanner SOperatingInput = new Scanner(System.in);
				System.out.println("Enter Surgeon's name: " + "\r\n");
				String SName = SNameInput.next();
				System.out.println("Enter Surgeon's BlazerId: ");
				String SBlazerId = SBlazerIdInput.next();
				System.out.println("Enter Surgeon's Specialty: ");
				String SSpecialty = SOperatingInput.next();
				System.out.println("Surgeon's Operating? ");
				String SOperating = SOperatingInput.next();
				SurgeonArrayList.add(new Surgeon(SName, Integer.parseInt(SBlazerId), SSpecialty, SOperating));
				System.out.println("Surgeon has been Added! ");
				break;	
		case "N": 
				Scanner NNameInput = new Scanner(System.in);
				Scanner NBlazerIdInput = new Scanner(System.in);
				Scanner NNumPatientsInput = new Scanner(System.in);
				System.out.println("Enter Nurse's name: " + "\r\n");
				String NName = NNameInput.next();
				System.out.println("Enter Doctor's BlazerId: ");
				String NBlazerId = NBlazerIdInput.next();
				System.out.println("Enter Doctor's Specialty: ");
				String NNumPatients = NNumPatientsInput.next();
				NurseArrayList.add(new Nurse(NName, Integer.parseInt(NBlazerId), NNumPatients));
				System.out.println("Nurse has been Added! ");
				break;	
		case "A":
				Scanner ANameInput = new Scanner(System.in);
				Scanner ABlazerIdInput = new Scanner(System.in);
				Scanner ADepartmentInput = new Scanner(System.in);
				System.out.println("Enter Administrator's name: " + "\r\n");
				String AName = ANameInput.next();
				System.out.println("Enter Administrator's BlazerId: ");
				String ABlazerId = ABlazerIdInput.next();
				System.out.println("Enter Administrator's Department: ");
				String ADepartment = ADepartmentInput.next();
				AdministratorArrayList.add(new Administrator(AName, Integer.parseInt(ABlazerId), ADepartment));	
				System.out.println("Administrator has been Added! ");
				break;	
		case "R": 
				Scanner RNameInput = new Scanner(System.in);
				Scanner RBlazerIdInput = new Scanner(System.in);
				Scanner RDepartmentInput = new Scanner(System.in);
				Scanner RAnsweringInput = new Scanner(System.in);
				System.out.println("Enter Receptionist's name: " + "\r\n");
				String RName = RNameInput.next();
				System.out.println("Enter Receptionist's BlazerId: ");
				String RBlazerId = RBlazerIdInput.next();
				System.out.println("Enter Receptionist's Department: ");
				String RDepartment = RDepartmentInput.next();
				System.out.println("Is Receptionist Answering? ");
				String RAnswering = RAnsweringInput.next();
				ReceptionistArrayList.add(new Receptionist(RName, Integer.parseInt(RBlazerId), RDepartment, RAnswering));	
				System.out.println("Receptionist has been Added! ");
				break;	
		case "J": 
				Scanner JNameInput = new Scanner(System.in);
				Scanner JBlazerIdInput = new Scanner(System.in);
				Scanner JDepartmentInput = new Scanner(System.in);
				Scanner JSweepingInput = new Scanner(System.in);
				System.out.println("Enter Janitor's name: " + "\r\n");
				String JName = JNameInput.next();
				System.out.println("Enter Janitor's BlazerId: ");
				String JBlazerId = JBlazerIdInput.next();
				System.out.println("Enter Janitor's Department: ");
				String JDepartment = JDepartmentInput.next();
				System.out.println("Is Janitor's Sweeping? ");
				String JSweeping = JSweepingInput.next();
				JanitorArrayList.add(new Janitor(JName, Integer.parseInt(JBlazerId), JDepartment, JSweeping));
				System.out.println("Janitor has been Added! ");
				break;	
         }

			break;


		default:
			System.out.println("Please Re-enter a Valid Code: ");
		}
		
		//write to file
		
//				//Total Count
		EmployeeCount = EmployeeArrayList.size();
		DoctorCount = DoctorArrayList.size();
		SurgeonCount = SurgeonArrayList.size();
		NurseCount = NurseArrayList.size();
		AdministratorCount = AdministratorArrayList.size();
		ReceptionistCount = ReceptionistArrayList.size();
		JanitorCount = JanitorArrayList.size();
		TotalCount = EmployeeCount + DoctorCount + SurgeonCount + NurseCount
		+ AdministratorCount + ReceptionistCount + JanitorCount;
		
		pw.write("**********************************" + "\n");
		pw.write("Welcome to the UAB Employee System" + "\n");
		pw.write("**********************************" + "\n");
		pw.write("The UAB Hospital System has the following employees: " + "\n");
		pw.write("\r\n");


		pw.write("Total Number of employees = " + TotalCount);
		pw.write("\r\n");
		pw.write("\r\n");
		
		//Employee
		pw.write("Hospital Employees: " + EmployeeCount);
		pw.write("\r\n");
		for (i=0; i<EmployeeArrayList.size(); i++) {
			  pw.println(EmployeeArrayList.get(i));
		}	
		pw.write("\r\n");
		
		//Doctor
		pw.write("Doctors: " + DoctorArrayList.size());
		pw.write("\r\n");
		for (j=0; j<DoctorArrayList.size(); j++) {
			  pw.println(DoctorArrayList.get(j));
		}	
		pw.write("\r\n");
		
		//Surgeon
		pw.write("Surgeons: " + SurgeonArrayList.size());
		pw.write("\r\n");
		for (k=0; k<SurgeonArrayList.size(); k++) {
			  pw.println(SurgeonArrayList.get(k));
		}	
		pw.write("\r\n");
		
		//Nurses
		pw.write("Nurses: " + NurseArrayList.size());
		pw.write("\r\n");
		for (m=0; m<NurseArrayList.size(); m++) {
			  pw.println(NurseArrayList.get(m));
		}	
		pw.write("\r\n");
		
		//Administrator
		pw.write("Administrators: " + AdministratorArrayList.size());
		pw.write("\r\n");
		for (l=0; l<AdministratorArrayList.size(); l++) {
			  pw.println(AdministratorArrayList.get(l));
		}	
		pw.write("\r\n");
		
		//Receptionist
		pw.write("Receptionists: " + ReceptionistArrayList.size());
		pw.write("\r\n");
		for (n=0; n<ReceptionistArrayList.size(); n++) {
			  pw.println(ReceptionistArrayList.get(n));
		}	
		pw.write("\r\n");
		
		//Janitors
		pw.write("Janitors: " + JanitorArrayList.size());
		pw.write("\r\n");
		for (p=0; p<JanitorArrayList.size(); p++) {
			  pw.println(JanitorArrayList.get(p));
		}	
		pw.write("\r\n");
		
		pw.close();
		
		
		//write to Original file
		String OriginalFileName = "outputOriginalFile.txt";
		PrintWriter pw1 = new PrintWriter (OriginalFileName);
		
//				
		
		//Employee
		
		for (i=0; i<EmployeeArrayList.size(); i++) {
			  pw1.println("E " + EmployeeArrayList.get(i));
		}	
		pw1.write("\r\n");
		
		//Doctor
		for (j=0; j<DoctorArrayList.size(); j++) {
			  pw1.println("D" + DoctorArrayList.get(j));
		}	
		pw1.write("\r\n");
		
		//Surgeon
		for (k=0; k<SurgeonArrayList.size(); k++) {
			  pw1.println("S" + SurgeonArrayList.get(k));
		}	
		pw1.write("\r\n");
		
		//Nurses
		for (m=0; m<NurseArrayList.size(); m++) {
			  pw1.println("N" + NurseArrayList.get(m));
		}	
		pw1.write("\r\n");
		
		//Administrator
		for (l=0; l<AdministratorArrayList.size(); l++) {
			  pw1.println("A" + AdministratorArrayList.get(l));
		}	
		pw1.write("\r\n");
		
		//Receptionist
		for (n=0; n<ReceptionistArrayList.size(); n++) {
			  pw1.println("R" + ReceptionistArrayList.get(n));
		}	
		pw1.write("\r\n");
		
		//Janitors
		for (p=0; p<JanitorArrayList.size(); p++) {
			  pw1.println("J" + JanitorArrayList.get(p));
		}	
		pw1.write("\r\n");
		
		pw1.close();

		
		}catch (FileNotFoundException fnfE) 
		{
			System.out.println(fnfE);
		} // end try-catch
}
    
}


				    
				    
				    
				    
				    