package departmentproducer;

import java.util.ArrayList;

public class DepartmentServiceImpl implements DepartmentService {
	
	ArrayList<Department> departmentDetails = new ArrayList<Department>();

	Department dep1 =  new Department("DID001", "Outpatient department (OPD)    ", "Perera", 11, 25);
	Department dep2 =  new Department("DID002", "Inpatient Service (IP)         ", "Aponsu", 10, 10);
	Department dep3 =  new Department("DID003", "Medical Department             ", "Perera", 15, 20);
	Department dep4 =  new Department("DID004", "Radiology Department (X-ray)   ", "Aponsu", 17, 11);
	Department dep5 =  new Department("DID005", "Medical Record Department (MRD)", "Perera", 20, 20);
	
	public DepartmentServiceImpl() {
		
		//Add Department details to array
		departmentDetails.add(dep1);
		departmentDetails.add(dep2);
		departmentDetails.add(dep3);
		departmentDetails.add(dep4);
		departmentDetails.add(dep5);
	}
	
	@Override
	public void displayDepartment() {
		
        System.out.println("| DID  |            DepName              |  HeadName |NoOfWardes|noOfEmployees|");
		
		for (Department department : departmentDetails) {
			System.out.println("  " +department.getdID()+ "  " +department.getDepName() + "   " +department.getHeadName()+ "     " +department.getNoOfwardes()+ "           " +department.getNoOfemployees());
		}
		
		

		
	}
	
}
