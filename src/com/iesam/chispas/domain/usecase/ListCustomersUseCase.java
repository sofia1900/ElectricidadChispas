package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MenCustomerDataStore;
import com.iesam.chispas.domain.models.Customer;
import java.util.List;
public class ListCustomersUseCase {
    public List<Customer> execute(){
        CustomerDataStore customerDataStore = new MenCustomerDataStore();
        return customerDataStore.getAllCustomer();
    }
}
