package data;

public interface SalesLineDataStore {
    void saveSalesLine(SalesLine salesLine);
    void deleteSalesLine(SalesLine salesLine);
    void updateSalesLine(SalesLine salesLine);
    List<SalesLine> getAllSalesLine();
    Customer findById(String codeSalesLine);
}
