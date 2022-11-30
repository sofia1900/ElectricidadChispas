package domain;

import data.InvoiceDataStore;

import java.util.Scanner;

public class GetVatRateUseCases {
    public VatRate execute(Integer type){
        InvoiceDataStore invoiceDataStore = new InvoiceDataStore();
        return invoiceDataStore.getVatRateByType(type);

    }
}
