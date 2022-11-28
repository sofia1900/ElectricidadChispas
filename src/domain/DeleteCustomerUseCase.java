package domain;

import data.CustomerDataStore;

public class DeleteCustomerUseCase {
    public void execute(Customer customer){
        CustomerDataStore customerDataStore = new CustomerDataStore();
        customerDataStore.deleteCustomer(customer);
    }
}
