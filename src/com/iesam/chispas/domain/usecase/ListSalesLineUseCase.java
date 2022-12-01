package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.MenSalesLineDataStore;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;
import java.util.List;

public class ListSalesLineUseCase {
    public List<SalesLine> execute(){
        SalesLineDataStore salesLineDataStore = new MenSalesLineDataStore();
        return salesLineDataStore.getAllSalesLine();
    }
}
