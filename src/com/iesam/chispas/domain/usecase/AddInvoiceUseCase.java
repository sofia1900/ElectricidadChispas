package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.InvoiceDataStore;
import com.iesam.chispas.domain.models.Invoice;

public class AddInvoiceUseCase {
    /**
     * Esto es un caso de uso que permite almacenar una factura
     */
    private InvoiceDataStore invoiceDataStore;

    public AddInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore = invoiceDataStore;
    }

    public void execute (Invoice invoice){
        invoiceDataStore.saveInvoice(invoice);
    }
}
