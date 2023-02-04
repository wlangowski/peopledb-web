package pl.wojciechlangowski.peopledbweb.web.model;

public class NbpCurrency {

    private String currency;
    private String code;
    private double mid;

    public NbpCurrency() {
    }


    public NbpCurrency(String currency, String code, double mid) {
        this.currency = currency;
        this.code = code;
        this.mid = mid;
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
        return "NbpCurrency{" +
                "currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid=" + mid +
                '}';
    }
}