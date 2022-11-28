package domain;

import data.CustomerDataStore;

public class AddCustomerUseCase {
    public void execute(Customer customer){
        CustomerDataStore customerDataStore = new CustomerDataStore();
        customerDataStore.saveCustomer(customer);
    }
}
