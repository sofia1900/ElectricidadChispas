package domain;

import data.CustomerDataStore;

public class GetCustomerUseCase {
    public Customer execute(String cod){
        CustomerDataStore customerDataStore = new CustomerDataStore();
        return customerDataStore.findById(cod);
    }
}
