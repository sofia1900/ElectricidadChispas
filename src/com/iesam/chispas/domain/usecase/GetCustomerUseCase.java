package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Customer;

public class GetCustomerUseCase {

    private CustomerDataStore customerDataStore;
    public GetCustomerUseCase (CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public Customer execute(String cod){
        return customerDataStore.findById(cod);
    }
}
