package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Customer;
import java.util.List;
public class ListCustomersUseCase {
    /**
     * Caso de uso que me permite recuperar un lista de clientes.
     */
    private CustomerDataStore customerDataStore;
    public ListCustomersUseCase (CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }
    public List<Customer> execute(){
        return customerDataStore.getAllCustomer();
    }
}
