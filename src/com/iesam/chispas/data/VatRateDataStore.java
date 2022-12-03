package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.VatRate;

import java.util.List;

public interface VatRateDataStore {
    void saveVatRate(VatRate vatRate);
    void deleteVatRate(VatRate vatRate);
    void updateVatRate (VatRate vatRate);
    List<VatRate> getAllVatRate();
    VatRate findByType(Integer type);
}
