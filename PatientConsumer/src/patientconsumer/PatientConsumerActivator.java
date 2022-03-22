package patientconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import patientproducer.PatientService;


public class PatientConsumerActivator implements BundleActivator {

	ServiceReference serviceReference;


	public void start(BundleContext context) throws Exception {
		System.out.println("Start PatientConsumer");
		serviceReference = context.getServiceReference(PatientService.class.getName());
		PatientService patientService = (PatientService)context.getService(serviceReference);
		
		patientService.displayPaitents();
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Good Bye");
		context.ungetService(serviceReference);

	}

}
