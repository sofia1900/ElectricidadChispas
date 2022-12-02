package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.VatRateDataStore;
import com.iesam.chispas.domain.models.VatRate;

import java.util.List;

public class ListVatRateUseCase {
    /**
     * Caso de uso que permite listar todas los iva guardados
     */
    private VatRateDataStore vatRateDataStore;
    public ListVatRateUseCase (VatRateDataStore vatRateDataStore){
        this.vatRateDataStore = vatRateDataStore;
    }
    public List<VatRate> execute(){
        return vatRateDataStore.getAllVatRate();
    }
}
