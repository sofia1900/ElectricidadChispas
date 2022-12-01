package com.iesam.chispas.data;
import com.iesam.chispas.domain.models.Invoice;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MenInvoiceDataStore implements InvoiceDataStore{

    private Map<String, Invoice> dataStore = new TreeMap<>();

    @Override
    public void saveInvoice(Invoice invoice) {
        dataStore.put(invoice.getCode(), invoice);
    }
    @Override
    public void updateInvoice(Invoice invoice) {
        dataStore.replace(invoice.getCode(), invoice);
    }
    @Override
    public List<Invoice> getAllInvoice() {
        return dataStore.values().stream().toList();
    }
    @Override
    public Invoice findById(String code) {
        return dataStore.get(code);
    }
    @Override
    public void calculateTotalInvoice(Invoice invoice) {
        System.out.println("5€");
    }


}
