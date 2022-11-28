package domain;

import data.SalesLineDataStore;

public class ListSalesLineUseCase {
    public List<SalesLine> execute(){
        SalesLineDataStore salesLineDataStore = new SalesLineDataStore();
        return salesLineDataStore.getAllSalesLine();
    }
}
