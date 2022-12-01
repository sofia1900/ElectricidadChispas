package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.MenSalesLineDataStore;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;

public class UpdateSalesLineUseCase {
    public void execute(SalesLine salesLine){
        SalesLineDataStore salesLineDataStore = new MenSalesLineDataStore();
        salesLineDataStore.updateSalesLine(salesLine);
    }
}
