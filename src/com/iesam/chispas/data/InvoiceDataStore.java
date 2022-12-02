package com.iesam.chispas.data;
import com.iesam.chispas.domain.models.Invoice;
import java.util.List;

public interface InvoiceDataStore {
    void saveInvoice(Invoice invoice);
    void updateInvoice (Invoice invoice);
    List<Invoice> getAllInvoice();
    Invoice findById(String code);
    Double calculateTotalInvoice (Invoice invoice);

}
