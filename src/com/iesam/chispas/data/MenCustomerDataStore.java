package com.iesam.chispas.data;
import com.iesam.chispas.domain.models.Customer;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MenCustomerDataStore implements CustomerDataStore {
    private Map<String, Customer> dataStore = new TreeMap<>();
    @Override
    public void saveCustomer(Customer customer) {dataStore.put(customer.getCode(), customer);}
    @Override
    public void deleteCustomer(Customer customer) {dataStore.remove(customer.getCode());}
    @Override
    public void updateCustomer(Customer customer) {
        dataStore.replace(customer.getCode(), customer);
    }
    @Override
    public List<Customer> getAllCustomer() {
        return dataStore.values().stream().toList();
    }
    @Override
    public Customer findById(String code) {
        return dataStore.get(code);
    }
}
