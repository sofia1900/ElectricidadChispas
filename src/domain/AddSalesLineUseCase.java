package domain;

import data.SalesLineDataStore;

public class AddSalesLineUseCase {
    public void execute (SalesLine salesLine){
        SalesLineDataStore salesLineDataStore = new SalesLineDataStore();
        salesLineDataStore.saveSalesLine(salesLine);
    }
}

