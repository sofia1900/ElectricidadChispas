package data;

public class MenCustomerDataStore implements CustomerDataStore {
    private Map<String, Customer> dataStore = new TreepMap<String, Customer>();
    @Override
    void saveCustomer(Customer customer){dataStore.put(customer.code, customer);}
    @Override
    void deleteCustomer(Customer customer){
        dataStore.remove(customer);
    };
    @Override
    void updateCustomer (Customer customer){
        dataStore.replace(customer.code, customer);
    };
    @Override
    List<Customer> getAllCustomer(){
        return dataStore.values().stream().toList();
    };
    @Override
    Customer findById(String code){return dataStore.getCode();};

}
