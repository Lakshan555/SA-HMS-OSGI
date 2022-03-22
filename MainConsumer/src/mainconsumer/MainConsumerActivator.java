package mainconsumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import departmentconsumer.DepartmentConsumerActivator;
import employeeconsumer.EmployeeConsumerActivator;
import medicineconsumer.MedicineConsumerActivator;
import patientconsumer.PatientConsumerActivator;


public class MainConsumerActivator implements BundleActivator {

	String userInput;
	boolean control = true;

	DepartmentConsumerActivator department = new DepartmentConsumerActivator();
	EmployeeConsumerActivator employee = new EmployeeConsumerActivator();
	PatientConsumerActivator patient = new PatientConsumerActivator();
	MedicineConsumerActivator medicine = new MedicineConsumerActivator();
	
	public void start(BundleContext context) throws Exception {
		
		System.out.println(" \n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println(" Hospital Management Dashboard");
		Scanner userInputScaner =  new Scanner(System.in);
		
		while(control == true) {
			
			System.out.println("\nTo view Departmenet details press 'D'");
			System.out.println("To view Employee details press 'E'");
			System.out.println("To view Patient details press 'P'");
			System.out.println("To view Medicine details press 'M'");
			System.out.println(" \n");
			
			System.out.print("Type here : ");
			userInput = userInputScaner.next();
			
			if(userInput.equalsIgnoreCase("d")) {
				department.start(context);
			}
			else if(userInput.equalsIgnoreCase("e")) {
				employee.start(context);
			}
			else if(userInput.equalsIgnoreCase("p")) {
				patient.start(context);
			}
			else if(userInput.equalsIgnoreCase("m")) {
				medicine.start(context);
			}else {
				System.out.println("Wrong Input");
			}
			
		
			
			System.out.println(" \n");
			System.out.println("To exit type 'exit' or type 'continue' to continue\n");
			System.out.print("Type here : ");
			userInput = userInputScaner.next();
			
		
			if(userInput.equalsIgnoreCase("exit")) {
				System.out.println("Thank You!");
				control = false;
			}else if(userInput.equalsIgnoreCase("continue")) {
				continue;
			}else {
				System.out.println("Wrong Input");
				continue;
			}
		}
		
		
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop MainConsumer");
		
	}

}
