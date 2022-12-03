package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.VatRateDataStore;
import com.iesam.chispas.domain.models.VatRate;

public class DeleteVatRateUseCase {
    private VatRateDataStore vatRateDataStore;

    public DeleteVatRateUseCase (VatRateDataStore vatRateDataStore){
        this.vatRateDataStore = vatRateDataStore;
    }

    public void execute(VatRate vatRate){
        vatRateDataStore.deleteVatRate(vatRate);
    }
}
