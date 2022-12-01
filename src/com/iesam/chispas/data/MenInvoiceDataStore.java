package com.iesam.chispas.data;
import com.iesam.chispas.domain.models.Invoice;
import com.iesam.chispas.domain.models.VatRate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MenInvoiceDataStore implements InvoiceDataStore{

    private Map<String, Invoice> dataStore = new TreeMap<String, Invoice>();

}
