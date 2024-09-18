public class Price extends Dessert {
    private double price;

    public Price(int type, double price) {
        super(type);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
