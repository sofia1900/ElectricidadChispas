package data;

public interface CustomerDataStore {
    void saveCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void updateCustomer (Customer customer);
    List<Customer> getAllCustomer();
    Customer findById(String code);

}
