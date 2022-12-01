package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MenCustomerDataStore;
import com.iesam.chispas.domain.models.Customer;

public class DeleteCustomerUseCase {
    public void execute(Customer customer){
        CustomerDataStore customerDataStore = new MenCustomerDataStore();
        customerDataStore.deleteCustomer(customer);
    }
}
