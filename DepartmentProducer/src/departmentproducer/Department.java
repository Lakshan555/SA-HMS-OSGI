package departmentproducer;

public class Department {
	
	private String dID;
	private String depName;
	private String headName;
	private int noOfwardes;
	private int noOfemployees;
	
	public Department(String dID, String depName, String headName, int noOfwardes, int noOfemployees) {
		super();
		this.dID = dID;
		this.depName = depName;
		this.headName = headName;
		this.noOfwardes = noOfwardes;
		this.noOfemployees = noOfemployees;
	}

	public String getdID() {
		return dID;
	}

	public String getDepName() {
		return depName;
	}

	public String getHeadName() {
		return headName;
	}

	public int getNoOfwardes() {
		return noOfwardes;
	}

	public int getNoOfemployees() {
		return noOfemployees;
	}
	
	
	
	
	
}
