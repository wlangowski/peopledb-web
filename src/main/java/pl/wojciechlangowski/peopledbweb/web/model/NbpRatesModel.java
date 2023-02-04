package pl.wojciechlangowski.peopledbweb.web.model;

import java.util.ArrayList;
import java.util.List;

public class NbpRatesModel {

    private List<String> rates = new ArrayList<>();
    private String currency;
    private String code;
    private double mid;

    public NbpRatesModel() {
    }

    public NbpRatesModel(List<String> rates, String currency, String code, double mid) {
        this.rates = rates;
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public List<String> getRates() {
        return rates;
    }

    public void setRates(List<String> rates) {
        this.rates = rates;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }


    @Override
    public String toString() {
        return "NbpRatesModel{" +
                "rates=" + rates +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid=" + mid +
                '}';
    }
}



