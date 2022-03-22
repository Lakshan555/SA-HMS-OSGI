package medicineproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class MedicineProducerActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Medicine Producer Start");
		
		MedicineService medicineService = new MedicineProducerServiceImpl();
		
		publishServiceRegistration = context.registerService(MedicineService.class.getName(), medicineService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
