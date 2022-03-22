package medicineproducer;

import java.util.ArrayList;

public class MedicineProducerServiceImpl implements MedicineService {

	ArrayList<Medicine> medicineDetails = new ArrayList<Medicine>();
	
	Medicine medicine1 =  new Medicine("MID001", "Paclitaxel ", "02/02/2022", "02/02/2022", 1500);
	Medicine medicine2 =  new Medicine("MID002", "CAptopril  ", "02/02/2022", "02/03/2025", 2500);
	Medicine medicine3 =  new Medicine("MID003", "Labetalol  ", "02/02/2022", "12/01/2027", 4000);
	Medicine medicine4 =  new Medicine("MID004", "Amikacin   ", "02/02/2022", "31/01/2024", 1500);
	Medicine medicine5 =  new Medicine("MID005", "Hydralazine", "02/02/2022", "05/12/2024", 2152);

	public MedicineProducerServiceImpl() {
		
		//Add medicineDetails details to array
		
		medicineDetails.add(medicine1);
		medicineDetails.add(medicine2);
		medicineDetails.add(medicine3);
		medicineDetails.add(medicine4);
		medicineDetails.add(medicine5);
	}
	
	@Override
	public void displayMedicine() {
		
		System.out.println("| MID  |  MedicineName   | MauDate |  ExpDate  |   QYT\t  |");
		
		for (Medicine medicine : medicineDetails) {
			System.out.println("  " +medicine.getmId()+ "  " +medicine.getMedicineName() + "\t" +medicine.getMauDate()+ "   " +medicine.getExeDate()+ "   " +medicine.getQyt());
		}
	
			
	}

}
