package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.InvoiceDataStore;
import com.iesam.chispas.domain.models.Invoice;

public class UpdateInvoiceUseCase {
    /**
     * Caso de uso que permite modificar una factura
     */
    private InvoiceDataStore invoiceDataStore;

    public UpdateInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore = invoiceDataStore;
    }

    public void execute(Invoice invoice){
        invoiceDataStore.updateInvoice(invoice);
    }
}
