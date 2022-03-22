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
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getFisrtName() {
		return fisrtName;
	}
	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
