package patientproducer;

import java.util.ArrayList;


public class PatientServiceImpl implements PatientService {
	
	ArrayList<Patient> patientDetails = new ArrayList<Patient>();
	
	Patient patient1 =  new Patient("PID001", "Saman", "Perera", "0765895120", "Saman@gmail.com");
	Patient patient2 =  new Patient("PID002", "Kamal", "Aponsu", "0768485235", "Kamal@gmail.com");
	Patient patient3 =  new Patient("PID003", "Nimal", "Perera", "0725478624", "Nimal@gmail.com");
	Patient patient4 =  new Patient("PID004", "Pasan", "Aponsu", "0751554852", "Pasan@gmail.com");
	Patient patient5 =  new Patient("PID005", "Ashan", "Perera", "0765895120", "Ashan@gmail.com");

	public PatientServiceImpl() {
		
		//Add patientDetails details to array
		
		patientDetails.add(patient1);
		patientDetails.add(patient2);
		patientDetails.add(patient3);
		patientDetails.add(patient4);
		patientDetails.add(patient5);
	}
	
	@Override
	public void displayPaitents() {
		// TODO Auto-generated method stub
		
		System.out.println("| PID  | FisrtName | LastName |  MobileNo  |     Email\t\t  |");
		
		for (Patient patient : patientDetails) {
			System.out.println("  " +patient.getpID()+ "  " +patient.getFisrtName() + "\t\t" +patient.getLastName()+ "   " +patient.getMobile()+ "   " +patient.getEmail());
		}
	
	}

}
