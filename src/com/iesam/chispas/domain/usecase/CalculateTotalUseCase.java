package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.InvoiceDataStore;
import com.iesam.chispas.domain.models.Invoice;

public class CalculateTotalUseCase {

    private InvoiceDataStore invoiceDataStore;

    public CalculateTotalUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore = invoiceDataStore;
    }
    public Double execute(Invoice invoice){
        return invoiceDataStore.calculateTotalInvoice(invoice);
    }
}
