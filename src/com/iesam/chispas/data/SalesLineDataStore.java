package com.iesam.chispas.data;
import com.iesam.chispas.domain.models.SalesLine;

import java.util.List;

public interface SalesLineDataStore {
    void saveSalesLine(SalesLine salesLine);
    void deleteSalesLine(SalesLine salesLine);
    void updateSalesLine(SalesLine salesLine);
    List<SalesLine> getAllSalesLine();
    SalesLine findById(String codeSalesLine);
}
