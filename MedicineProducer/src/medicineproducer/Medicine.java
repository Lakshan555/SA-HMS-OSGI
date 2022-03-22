package medicineproducer;

public class Medicine {
	
	private String mId;
	private String medicineName;
	private String mauDate;
	private String exeDate;
	private int qyt;
	
	public Medicine(String mId, String medicineName, String mauDate, String exeDate, int qyt) {
		super();
		this.mId = mId;
		this.medicineName = medicineName;
		this.mauDate = mauDate;
		this.exeDate = exeDate;
		this.qyt = qyt;
	}

	public String getmId() {
		return mId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public String getMauDate() {
		return mauDate;
	}

	public String getExeDate() {
		return exeDate;
	}

	public int getQyt() {
		return qyt;
	}
	
	
	
	
}
