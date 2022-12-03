package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.SalesLine;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MenSalesLineDataStore implements SalesLineDataStore{

    private Map<String, SalesLine> dataStore = new TreeMap<String, SalesLine>();
    @Override
    public void saveSalesLine(SalesLine salesLine) {
        dataStore.put(salesLine.getCode(), salesLine);
    }
    @Override
    public void deleteSalesLine(SalesLine salesLine) {
        dataStore.remove(salesLine.getCode());
    }
    @Override
    public void updateSalesLine(SalesLine salesLine) {
        dataStore.replace(salesLine.getCode(), salesLine);
    }
    @Override
    public List<SalesLine> getAllSalesLine() {
        return dataStore.values().stream().toList();
    }
    @Override
    public SalesLine findById(String codeSalesLine) {
        return dataStore.get(codeSalesLine);
    }
}
