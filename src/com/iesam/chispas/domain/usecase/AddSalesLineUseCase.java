package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;

public class AddSalesLineUseCase {
    /**
     * Esto es un caso de uso que permite almacenar una linea de venta
     */
    private SalesLineDataStore salesLineDataStore;
    public AddSalesLineUseCase(SalesLineDataStore salesLineDataStore){
        this.salesLineDataStore = salesLineDataStore;
    }
    public void execute (SalesLine salesLine){
        salesLineDataStore.saveSalesLine(salesLine);
    }
}

