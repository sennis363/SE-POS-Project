package posproject;

public interface DiscountStrategy {

    public abstract double getDiscountInDollars(double price, int qty);
}
