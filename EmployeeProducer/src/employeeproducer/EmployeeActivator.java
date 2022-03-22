package employeeproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class EmployeeActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	public void start(BundleContext context) throws Exception {
		
		System.out.println("Employee Producer Start");
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		publishServiceRegistration = context.registerService(EmployeeService.class.getName(), employeeService, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}

}
