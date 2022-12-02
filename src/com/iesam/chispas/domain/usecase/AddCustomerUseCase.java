package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Customer;

public class AddCustomerUseCase {
    /**
     * Caso de uso que me permite guardar un cliente.
     */
    private CustomerDataStore customerDataStore;
    public AddCustomerUseCase (CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public void execute(Customer customer){
        this.customerDataStore.saveCustomer(customer);
    }
}
