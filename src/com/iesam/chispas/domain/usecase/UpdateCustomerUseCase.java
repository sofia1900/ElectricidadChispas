package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Customer;
public class UpdateCustomerUseCase {

    private CustomerDataStore customerDataStore;
    public UpdateCustomerUseCase (CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public void execute(Customer customer){
        customerDataStore.updateCustomer(customer);
    }
}
