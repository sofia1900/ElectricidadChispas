package com.iesam.chispas.data;
import com.iesam.chispas.domain.models.Customer;
import java.util.List;

public interface CustomerDataStore {
    void saveCustomer(Customer customer);
    void deleteCustomer(Customer customer);
    void updateCustomer (Customer customer);
    List<Customer> getAllCustomer();
    Customer findById(String code);
}
