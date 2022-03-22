package departmentproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class DepartmentProducerActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Department Producer Start");
		
		DepartmentService departmentService = new DepartmentServiceImpl();
		
		publishServiceRegistration = context.registerService(DepartmentService.class.getName(), departmentService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
