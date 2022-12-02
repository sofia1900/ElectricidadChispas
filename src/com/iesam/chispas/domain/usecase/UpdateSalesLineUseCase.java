package com.iesam.chispas.domain.usecase;
import com.iesam.chispas.data.SalesLineDataStore;
import com.iesam.chispas.domain.models.SalesLine;

public class UpdateSalesLineUseCase {

    /**
     * Caso de uso que permite modificar una linea de venta
     */
    private SalesLineDataStore salesLineDataStore;
    public UpdateSalesLineUseCase(SalesLineDataStore salesLineDataStore){
        this.salesLineDataStore = salesLineDataStore;
    }
    public void execute(SalesLine salesLine){
        salesLineDataStore.updateSalesLine(salesLine);
    }
}
