package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.VatRateDataStore;
import com.iesam.chispas.domain.models.SalesLine;
import com.iesam.chispas.domain.models.VatRate;

public class UpdateVatRateUseCase {

    /**
     * Caso de uso que permite modificar un tipo de iva
     */
    private VatRateDataStore vatRateDataStore;
    public UpdateVatRateUseCase (VatRateDataStore vatRateDataStore){
        this.vatRateDataStore = vatRateDataStore;
    }
    public void execute(VatRate vatRate){
        vatRateDataStore.updateVatRate(vatRate);
    }

}
