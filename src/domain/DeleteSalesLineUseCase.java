package domain;

import data.SalesLineDataStore;

public class DeleteSalesLineUseCase {
    public void execute(SalesLine salesLine){
        SalesLineDataStore salesLineDataStore = new SalesLineDataStore();
        salesLineDataStore.deleteSalesLine(salesLine);
    }
}
