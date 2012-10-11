package posproject;

public class NoDiscount implements DiscountStrategy{
private final double NO_DISCOUNT = 1;
    @Override
    public final double getDiscountInDollars(double price, int qty) {
        //validation required
        return NO_DISCOUNT;
    }
    
}
