// DependencyInjectionTest.java
public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create an instance of CustomerRepositoryImpl
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into CustomerService
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find customer details
        String customerDetails = customerService.getCustomerDetails("12345");
        System.out.println(customerDetails);
    }
}
