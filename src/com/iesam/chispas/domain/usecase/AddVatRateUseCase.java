package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.VatRateDataStore;
import com.iesam.chispas.domain.models.VatRate;

public class AddVatRateUseCase {
    private VatRateDataStore vatRateDataStore;

    public AddVatRateUseCase (VatRateDataStore vatRateDataStore){
        this.vatRateDataStore = vatRateDataStore;
    }

    public void execute(VatRate vatRate){
        this.vatRateDataStore.saveVatRate(vatRate);
    }
}
