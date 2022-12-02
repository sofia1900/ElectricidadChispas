package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.InvoiceDataStore;
import com.iesam.chispas.domain.models.Invoice;

public class GetInvoiceUseData {
    /**
     * Caso de uso que permite coger una factura por su codigo
     */
    private InvoiceDataStore invoiceDataStore;
    public GetInvoiceUseData (InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore = invoiceDataStore;
    }
    public Invoice execute(String code){
        return invoiceDataStore.findById(code);
    }
}
