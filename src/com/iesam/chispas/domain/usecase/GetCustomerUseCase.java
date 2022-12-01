package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MenCustomerDataStore;
import com.iesam.chispas.domain.models.Customer;

public class GetCustomerUseCase {
    public Customer execute(String cod){
        CustomerDataStore customerDataStore = new MenCustomerDataStore();
        return customerDataStore.findById(cod);
    }
}
