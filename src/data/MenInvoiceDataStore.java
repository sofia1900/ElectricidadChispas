package data;

public class MenInvoiceDataStore implements InvoiceDataStore{

    private Map<String, Invoice> dataStore = new TreepMap<String, Invoice>();

    @Override
    public List<VatRate> getAllVatRate() {
        System.out.prinln(dataStore.values().stream().toList());
    }

    @Override
    public VatRate getVatRateByType(Integer type) {
        return VatRate;
    }
}
