package medicineconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import medicineproducer.MedicineService;



public class MedicineConsumerActivator implements BundleActivator {

	ServiceReference serviceReference;


	public void start(BundleContext context) throws Exception {
		System.out.println("Start MedicineConsumer");
		serviceReference = context.getServiceReference(MedicineService.class.getName());
		MedicineService medicineService = (MedicineService)context.getService(serviceReference);
		
		medicineService.displayMedicine();
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Good Bye");
		context.ungetService(serviceReference);

	}

}
