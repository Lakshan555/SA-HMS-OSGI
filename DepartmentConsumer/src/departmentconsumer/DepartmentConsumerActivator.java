package departmentconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import departmentproducer.DepartmentService;


public class DepartmentConsumerActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start DepartmentConsumer");
		serviceReference = context.getServiceReference(DepartmentService.class.getName());
		DepartmentService departmentService = (DepartmentService)context.getService(serviceReference);
		
		departmentService.displayDepartment();
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Good Bye");
		context.ungetService(serviceReference);

	}

}
