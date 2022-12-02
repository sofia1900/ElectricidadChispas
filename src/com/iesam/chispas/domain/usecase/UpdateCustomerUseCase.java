package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Customer;
public class UpdateCustomerUseCase {
    /**
     * Caso de uso que permite modificar un cliente
     */
    private CustomerDataStore customerDataStore;
    public UpdateCustomerUseCase (CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public void execute(Customer customer){
        customerDataStore.updateCustomer(customer);
    }
}
