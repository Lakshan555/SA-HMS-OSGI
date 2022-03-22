package patientproducer;

public class Patient {
	private String pID;
	private String fisrtName;
	private String lastName;
	private String mobile;
	private String email;
	
	public Patient(String pID, String fisrtName, String lastName, String mobile, String email) {
		super();
		this.pID = pID;
		this.fisrtName = fisrtName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
	}

	public String getpID() {
		return pID;
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
