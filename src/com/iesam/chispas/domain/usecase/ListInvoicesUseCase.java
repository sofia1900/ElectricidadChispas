package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.InvoiceDataStore;
import com.iesam.chispas.domain.models.Invoice;

import java.util.List;

public class ListInvoicesUseCase {
    /**
     * Caso de uso que permite listar todas las facturas guardadas
     */
    private InvoiceDataStore invoiceDataStore;
    public ListInvoicesUseCase (InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore = invoiceDataStore;
    }
    public List<Invoice> execute(){
        return invoiceDataStore.getAllInvoice();
    }
}
