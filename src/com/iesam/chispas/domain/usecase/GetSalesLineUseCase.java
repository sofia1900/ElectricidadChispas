package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;

public class GetSalesLineUseCase {

    private SalesLineDataStore salesLineDataStore;
    public GetSalesLineUseCase(SalesLineDataStore salesLineDataStore){
        this.salesLineDataStore = salesLineDataStore;
    }
    public SalesLine execute(String code){
        return salesLineDataStore.findById(code);
    }
}
