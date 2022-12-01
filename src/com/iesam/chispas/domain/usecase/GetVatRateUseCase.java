package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.VatRateDataStore;
import com.iesam.chispas.domain.models.VatRate;

public class GetVatRateUseCase {
    private VatRateDataStore vatRateDataStore;
    public GetVatRateUseCase (VatRateDataStore vatRateDataStore){
        this.vatRateDataStore = vatRateDataStore;
    }
    public VatRate execute(Integer type){
        return vatRateDataStore.findByType(type);
    }
}
