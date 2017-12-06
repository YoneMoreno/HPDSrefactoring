package invoice;

public class Invoice {

    private int quantity;
    private double unitPrice;

    public Invoice(int quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        double discount = 0;
        if (getPrice() >= 10) discount = getPrice() * 0.1;
        return getPrice() - discount;
    }

    private double getPrice() {
        return quantity * unitPrice;
    }

}
