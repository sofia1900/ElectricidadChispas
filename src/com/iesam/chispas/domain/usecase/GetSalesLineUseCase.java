package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.MenSalesLineDataStore;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;

public class GetSalesLineUseCase {
    public SalesLine execute(String code){
        SalesLineDataStore salesLineDataStore = new MenSalesLineDataStore();
        return salesLineDataStore.findById(code);
    }
}
