package domain;

import data.SalesLineDataStore;

public class UpdateSalesLineUseCase {
    public SalesLine execute(SalesLine salesLine){
        SalesLineDataStore salesLineDataStore = new SalesLineDataStore();
        salesLineDataStore.updateSalesLine(salesLine);
    }
}
