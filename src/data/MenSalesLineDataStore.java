package data;

public class MenSalesLineDataStore implements SalesLineDataStore{

    private Map<String, SalesLine > dataStore = new TreepMap<String, SalesLine>();
    @Override
    public void saveSalesLine(SalesLine salesLine) {
        dataStore.put(salesLine.code, salesLine);
    }

    @Override
    public void deleteSalesLine(SalesLine salesLine) {
        dataStore.remove(salesLine);
    }

    @Override
    public void updateSalesLine(SalesLine salesLine) {
        dataStore.replace(salesLine.code, salesLine);
    }

    @Override
    public List<SalesLine> getAllSalesLine() {
        return dataStore.values().stream().toList();;
    }

    @Override
    public Customer findById(String codeSalesLine) {
        return dataStore.getCode();
    }
}
