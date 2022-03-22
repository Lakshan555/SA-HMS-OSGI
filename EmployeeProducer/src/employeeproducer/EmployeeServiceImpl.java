package employeeproducer;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
	
	ArrayList<Employee> employeeDetails = new ArrayList<Employee>();
	
	Employee emp1 =  new Employee("EMP001", "Malith", "Perera", "0765895120", "Malith@gmail.com");
	Employee emp2 =  new Employee("EMP002", "Lalith", "Aponsu", "0768485235", "Lalith@gmail.com");
	Employee emp3 =  new Employee("EMP003", "Sujith", "Perera", "0725478624", "Sujith@gmail.com");
	Employee emp4 =  new Employee("EMP004", "Majith", "Aponsu", "0751554852", "Majith@gmail.com");
	Employee emp5 =  new Employee("EMP005", "Sagith", "Perera", "0765895120", "Sagith@gmail.com");
	
	

	public EmployeeServiceImpl() {
		
		//Add employee details to array
		employeeDetails.add(emp1);
		employeeDetails.add(emp2);
		employeeDetails.add(emp3);
		employeeDetails.add(emp4);
		employeeDetails.add(emp5);
	}


	@Override
	public void displayEmployees() {
	
		System.out.println("| EMPID | FisrtName | LastName |  MobileNo  |     Email\t\t  |");
		
		for (Employee employee : employeeDetails) {
			System.out.println("  " +employee.getEmpID()+ "  " +employee.getFisrtName() + "\t" +employee.getLastName()+ "   " +employee.getMobile()+ "   " +employee.getEmail());
		}

	}

}
