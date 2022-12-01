package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;

public class AddSalesLineUseCase {
    private SalesLineDataStore salesLineDataStore;
    public AddSalesLineUseCase(SalesLineDataStore salesLineDataStore){
        this.salesLineDataStore = salesLineDataStore;
    }
    public void execute (SalesLine salesLine){
        salesLineDataStore.saveSalesLine(salesLine);
    }
}

