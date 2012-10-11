package posproject;

public class RecurringCustomerDiscount implements DiscountStrategy{
private final double RECURRING_DISCOUNT = .2;
    @Override
    public final double getDiscountInDollars(double price, int qty) {
        return RECURRING_DISCOUNT;
    }
    
}
