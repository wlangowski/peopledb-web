package pl.wojciechlangowski.peopledbweb.web.model;


public class LemEntityModel {
    private String orderStatus;

    private String orderNumber;
    private String line;

    public LemEntityModel() {
    }


    public LemEntityModel(String orderStatus, String orderNumber, String line) {
        this.orderStatus = orderStatus;
        this.orderNumber = orderNumber;
        this.line = line;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "LEMentity{" +
                "orderStatus='" + orderStatus + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", line='" + line + '\'' +
                '}';
    }
}

