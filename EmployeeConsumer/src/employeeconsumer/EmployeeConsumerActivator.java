package employeeconsumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import employeeproducer.EmployeeService;

public class EmployeeConsumerActivator implements BundleActivator {


	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start EmployeeConsumer");
		serviceReference = context.getServiceReference(EmployeeService.class.getName());
		EmployeeService employeeService = (EmployeeService)context.getService(serviceReference);
		
		employeeService.displayEmployees();
	}

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Good Bye");
		context.ungetService(serviceReference);

	}

}
