package employeeproducer;

public class Employee {
	private String empID;
	private String fisrtName;
	private String lastName;
	private String mobile;
	private String email;
	
	public Employee(String empID, String fisrtName, String lastName, String mobile, String email) {
		super();
		this.empID = empID;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
	}

	public String getEmpID() {
		return empID;
	}

	public String getFisrtName() {
		return fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}
	
	
	
}
