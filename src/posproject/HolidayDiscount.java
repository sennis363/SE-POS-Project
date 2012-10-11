package posproject;

public class HolidayDiscount implements DiscountStrategy{
    
private final double HOLIDAY_DISCOUNT = .4;
    @Override
    public final double getDiscountInDollars(double price, int qty) {
        return HOLIDAY_DISCOUNT;
    }
    
}
