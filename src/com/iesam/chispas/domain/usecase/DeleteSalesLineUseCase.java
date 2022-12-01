package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;

public class DeleteSalesLineUseCase {

    private SalesLineDataStore salesLineDataStore;
    public DeleteSalesLineUseCase(SalesLineDataStore salesLineDataStore){
        this.salesLineDataStore = salesLineDataStore;
    }
    public void execute(SalesLine salesLine){
        salesLineDataStore.deleteSalesLine(salesLine);
    }
}
