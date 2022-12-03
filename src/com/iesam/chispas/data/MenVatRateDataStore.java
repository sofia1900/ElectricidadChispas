package com.iesam.chispas.data;
import com.iesam.chispas.domain.models.VatRate;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MenVatRateDataStore implements VatRateDataStore{
    private Map<Integer, VatRate> dataStore = new TreeMap<>();
    @Override
    public void saveVatRate(VatRate vatRate) {
        dataStore.put(vatRate.getType(), vatRate);
    }

    @Override
    public void deleteVatRate(VatRate vatRate) {
        dataStore.remove(vatRate.getType());
    }

    @Override
    public void updateVatRate(VatRate vatRate) {
        dataStore.replace(vatRate.getType(), vatRate);
    }

    @Override
    public List<VatRate> getAllVatRate() {
        return dataStore.values().stream().toList();
    }

    @Override
    public VatRate findByType(Integer type) {
        return dataStore.get(type);
    }
}
