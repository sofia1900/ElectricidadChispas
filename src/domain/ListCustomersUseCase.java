package domain;

import data.CustomerDataStore;

public class ListCustomersUseCase {
    public List<Customer> execute(){
        CustomerDataStore customerDataStore = new CustomerDataStore();
        return customerDataStore.getAllCustomer();
    }
}
