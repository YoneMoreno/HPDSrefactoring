package invoice;

public class Invoice {

    private int quantity;
    private double unitPrice;


    public Invoice(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        if (getPrice() >= 10) return getPrice() - getDiscount();
        return getPrice();
    }

    private double getDiscount() {
        return getPrice() * 0.1;
    }

    private double getPrice() {
        return quantity * unitPrice;
    }

}
