package patientproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class PatientProducerActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		PatientProducerActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		PatientProducerActivator.context = null;
	}

}
