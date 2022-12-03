package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.VatRateDataStore;
import com.iesam.chispas.domain.models.VatRate;

public class GetVatRateUseCase {
    /**
     * Caso de uso que permite coger un iva por su tipo
     */
    private VatRateDataStore vatRateDataStore;
    public GetVatRateUseCase (VatRateDataStore vatRateDataStore){
        this.vatRateDataStore = vatRateDataStore;
    }
    public VatRate execute(Integer type){
        return vatRateDataStore.findByType(type);
    }
}
