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
		  System.out.println(""
	                + ""
	                + "                               _    _ _____ _     _____ ________  ___ _____   _____ _____                         \r\n" +
	                "                              | |  | |  ___| |   /  __ \\  _  |  \\/  ||  ___| |_   _|  _  |                        \r\n" +
	                "                              | |  | | |__ | |   | /  \\/ | | | .  . || |__     | | | | | |                        \r\n" +
	                "                              | |/\\| |  __|| |   | |   | | | | |\\/| ||  __|    | | | | | |                        \r\n" +
	                "                              \\  /\\  / |___| |___| \\__/\\ \\_/ / |  | || |___    | | \\ \\_/ /                        \r\n" +
	                "                               \\/  \\/\\____/\\_____/\\____/\\___/\\_|  |_/\\____/    \\_/  \\___/                         \r\n" +
	                "                                                                                                                  \r\n" +
	                "                                                                                                                  \r\n" +
	                "              _   _ _____ _____ _____ _      ___  ___  ___   _   _   ___  _____  ________  ___ _____ _   _ _____  \r\n" +
	                "             | | | |  _  |_   _|  ___| |     |  \\/  | / _ \\ | \\ | | / _ \\|  __ \\|  ___|  \\/  ||  ___| \\ | |_   _| \r\n" +
	                "             | |_| | | | | | | | |__ | |     | .  . |/ /_\\ \\|  \\| |/ /_\\ \\ |  \\/| |__ | .  . || |__ |  \\| | | |   \r\n" +
	                "             |  _  | | | | | | |  __|| |     | |\\/| ||  _  || . ` ||  _  | | __ |  __|| |\\/| ||  __|| . ` | | |   \r\n" +
	                "             | | | \\ \\_/ / | | | |___| |____ | |  | || | | || |\\  || | | | |_\\ \\| |___| |  | || |___| |\\  | | |   \r\n" +
	                "             \\_| |_/\\___/  \\_/ \\____/\\_____/ \\_|  |_/\\_| |_/\\_| \\_/\\_| |_/\\____/\\____/\\_|  |_/\\____/\\_| \\_/ \\_/   \r\n" +
	                "                                                                                                                  \r\n" +
	                "                                                                                                                  \r\n" +
	                "                              ______  ___   _____ _   _ ______  _____  ___  ____________                          \r\n" +
	                "                              |  _  \\/ _ \\ /  ___| | | || ___ \\|  _  |/ _ \\ | ___ \\  _  \\                         \r\n" +
	                "                              | | | / /_\\ \\\\ `--.| |_| || |_/ /| | | / /_\\ \\| |_/ / | | |                         \r\n" +
	                "                              | | | |  _  | `--. \\  _  || ___ \\| | | |  _  ||    /| | | |                         \r\n" +
	                "                              | |/ /| | | |/\\__/ / | | || |_/ /\\ \\_/ / | | || |\\ \\| |/ /                          \r\n" +
	                "                              |___/ \\_| |_/\\____/\\_| |_/\\____/  \\___/\\_| |_/\\_| \\_|___/                           \r\n" +
	                "                                                                                                                  \r\n" +
	                "                                                                                                                  "
	                + "");
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
