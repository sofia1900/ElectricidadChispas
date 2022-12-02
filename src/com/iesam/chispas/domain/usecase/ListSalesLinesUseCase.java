package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;
import java.util.List;

public class ListSalesLinesUseCase {
    /**
     * Caso de uso que permite listar todas las lineas de venta guardadas
     */
    private SalesLineDataStore salesLineDataStore;
    public ListSalesLinesUseCase(SalesLineDataStore salesLineDataStore){
        this.salesLineDataStore = salesLineDataStore;
    }
    public List<SalesLine> execute(){
        return salesLineDataStore.getAllSalesLine();
    }
}
