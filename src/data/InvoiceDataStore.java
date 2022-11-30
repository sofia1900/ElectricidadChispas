package data;

public interface InvoiceDataStore {

    List<VatRate> getAllVatRate();
    VatRate getVatRateByType(Integer type);

}
