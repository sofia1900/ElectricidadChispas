package domain;

import data.SalesLineDataStore;

public class GetSalesLineUseCase {
    public SalesLine execute(String code){
        SalesLineDataStore salesLineDataStore = new SalesLineDataStore();
        return salesLineDataStore.findById(code);
    }
}
