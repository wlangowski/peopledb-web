package pl.wojciechlangowski.peopledbweb.web.model;

import java.util.List;

public class NbpRatesArray {

    private String table;
    private String no;
    private String effectiveDate;
    private List<NbpCurrency> rates;

    public NbpRatesArray() {
    }

    public NbpRatesArray(String table, String no, String effectiveDate, List<NbpCurrency> rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public List<NbpCurrency> getRates() {
        return rates;
    }

    public void setRates(List<NbpCurrency> rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "NbpRatesArray{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", rates=" + rates +
                '}';
    }
}

