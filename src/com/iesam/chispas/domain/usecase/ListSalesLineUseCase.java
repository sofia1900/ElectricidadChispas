package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;
import java.util.List;

public class ListSalesLineUseCase {

    private SalesLineDataStore salesLineDataStore;
    public ListSalesLineUseCase(SalesLineDataStore salesLineDataStore){
        this.salesLineDataStore = salesLineDataStore;
    }
    public List<SalesLine> execute(){
        return salesLineDataStore.getAllSalesLine();
    }
}
