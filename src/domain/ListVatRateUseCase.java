package domain;

import data.InvoiceDataStore;

public class ListVatRateUseCase {
    public List<VatRate> execute(){
        InvoiceDataStore invoiceDataStore = new InvoiceDataStore();
        return invoiceDataStore.getAllVatRate();
    }
}
