package posproject;

public class ThirdDiscount implements DiscountStrategy{
private final double THIRD_DISCOUNT = .33;
    @Override
    public final double getDiscountInDollars(double price, int qty) {
        return THIRD_DISCOUNT;
    }
    
}
