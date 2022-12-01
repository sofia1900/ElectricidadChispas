package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MenCustomerDataStore;
import com.iesam.chispas.domain.models.Customer;

public class AddCustomerUseCase {
    public void execute(Customer customer){
        CustomerDataStore customerDataStore = new MenCustomerDataStore();
        customerDataStore.saveCustomer(customer);
    }
}
